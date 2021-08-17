package com.wicipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wicipe.domain.RecipeDTO;
import com.wicipe.mapper.RecipeMapper;

@CrossOrigin(origins = "*")
@RestController
public class ReceipeController {
	@Autowired
	private RecipeMapper recipeMapper;
	
	@RequestMapping(value = "/recipe/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<RecipeDTO> getAllRecipe() throws Exception{		
		final List<RecipeDTO> recipeList = recipeMapper.selectAllRecipe();

		return recipeList;
	}
	
	@RequestMapping(value = "/recipe/get", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<RecipeDTO> getRecipe(@RequestParam(value="name",defaultValue="0") String name) throws Exception{
		System.out.println(name);
		final List<RecipeDTO> recipeList = recipeMapper.selectRecipe(name);

		return recipeList;
	}
}
