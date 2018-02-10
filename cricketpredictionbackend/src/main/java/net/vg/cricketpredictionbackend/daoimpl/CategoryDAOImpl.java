package net.vg.cricketpredictionbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.vg.cricketpredictionbackend.dao.CategoryDAO;
import net.vg.cricketpredictionbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category> ();
	
	
	static {
		
		Category category1 = new Category();
		
		//adding first category
		category1.setId(1);
		category1.setName("IPL");
		category1.setDescription("Ths is the Indian Premier League");
		category1.setImageURL("ipl.png");
		
		categories.add(category1);
		
		//adding 2nd category
		Category category2 = new Category();
		
		category2.setId(2);
		category2.setName("ICC");
		category2.setDescription("Ths is International Cricket");
		category2.setImageURL("icc.png");
		
		categories.add(category2);
	
		}
	
	@Override
	public List<Category> list() {
		return categories;

	}
}
