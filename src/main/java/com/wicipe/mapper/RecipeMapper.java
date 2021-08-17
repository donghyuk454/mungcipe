package com.wicipe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wicipe.domain.RecipeDTO;

@Mapper
public interface RecipeMapper {
	@Select("SELECT * FROM recipe")
	List<RecipeDTO> selectAllRecipe();
	
	List<RecipeDTO> selectRecipe(String name) throws Exception;
}
