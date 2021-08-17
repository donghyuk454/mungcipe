package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RecipeDTO {
	@JsonProperty("idx")
	private int idx;
	@JsonProperty("name")
	public String name;
	@JsonProperty("category")
	private int category;
	@JsonProperty("time")
	private int time;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("sauce")
	private String sauce;
	@JsonProperty("ingredient")
	private String ingredient;
	@JsonProperty("tool")
	private String tool;
	@JsonProperty("steps")
	private String steps;
	@JsonProperty("endpoint")
	private String endpoint;
	@JsonProperty("order_cnt")
	private int order_cnt;
	@JsonProperty("recommend")
	private int recommend;
}
