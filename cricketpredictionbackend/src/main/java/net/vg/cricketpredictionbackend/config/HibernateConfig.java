package net.vg.cricketpredictionbackend.config;

import java.util.Properties;

import javax.activation.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"net.vg.cricketpredictionbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

	//Change the below based on the DBMS you use
	private final static String DATABASE_URL = "jdb:h2:tcp//localhost/~/onlinecricketprediction";
	private final static String DATABASE_DRIVER = "org.h2.driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.h2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSWORD = "";
	
	//dataSource bean will be available
	
	@Bean
	private DataSource getDataSource() {
		
		BasicDataSource dataSource = new BasicDataSource ();
		
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		
		return (DataSource) dataSource;
	}
	
	//sessionFactory bean will be available
	
	@Bean
	private SessionFactory getSessionFactory(DataSource dataSource) {
			
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder((javax.sql.DataSource) dataSource);
		
		builder.addProperties(getHibernatePropeties());
		builder.scanPackages("net.vg.cricketpredictionbackend.dto");
		
		return builder.buildSessionFactory();
	}
	
	//All the hibernate properties will be returned in this method

	private Properties getHibernatePropeties() {
		
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
	}
	
	//transactionManager bean
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
		
	}
}
