package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter 생성
@Setter // Setter 생성
public class EvalueDTO {
	@JsonProperty("recipe_idx")
	private int recipe_idx;
	@JsonProperty("user_idx")
	private int user_idx;
	@JsonProperty("star")
	private int star;
	@JsonProperty("text")
	private String text;
	
	public EvalueDTO(Object recipe_idx, Object user_idx, Object star, Object text) {
		if (recipe_idx != null)
			this.recipe_idx = Integer.valueOf((String) recipe_idx);
		if (user_idx != null)
			this.user_idx = Integer.valueOf((String) user_idx);
		if (star != null)
			this.star = Integer.valueOf((String) star);
		if (text != null)
			this.text = text.toString();
	}
}
