package net.vg.onlinecricketprediction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.vg.cricketpredictionbackend.dao.CategoryDAO;
import net.vg.cricketpredictionbackend.dto.Category;

@Controller
public class PageController {
		
		@Autowired
		private CategoryDAO categoryDAO;
		
		@RequestMapping(value = {"/", "/home", "/index"})
		public ModelAndView index() {
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Home");
			
			//passing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
			mv.addObject("userClickHome", true);
			return mv;
					
		}
		
		@RequestMapping(value = {"/about"})
		public ModelAndView about() {
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","About us");
			mv.addObject("userClickAbout", true);
			return mv;
					
		}
		
		@RequestMapping(value = {"/contact"})
		public ModelAndView contact() {
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Contact us");
			mv.addObject("userClickContact", true);
			return mv;
					
		}
		
		@RequestMapping(value = {"/show/all/games"})
		public ModelAndView showAllGames() {
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","All Games");
			
			//passing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
			mv.addObject("userClickAllGames", true);
			return mv;
					
		}
		
		@RequestMapping(value = {"/show/category/{id}/games"})
		public ModelAndView showCategoryGames(@PathVariable("id") int id) {
			
			ModelAndView mv = new ModelAndView("page");
			
			//categoryDAO to fetch a single category
			Category category = null;
			
			category = categoryDAO.get(id);
			
			mv.addObject("title",category.getName());
			
			//passing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
			//passing the single category object
			mv.addObject("category",category);
			
			mv.addObject("userClickCategoryGames", true);
			return mv;
					
		}
		
}
