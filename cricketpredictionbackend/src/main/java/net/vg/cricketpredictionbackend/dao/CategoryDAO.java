package net.vg.cricketpredictionbackend.dao;

import java.util.List;

import net.vg.cricketpredictionbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
