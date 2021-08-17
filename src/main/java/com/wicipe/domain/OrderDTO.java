package com.wicipe.domain;

import java.text.ParseException;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter 생성
@Setter // Setter 생성
public class OrderDTO {
	@JsonProperty("idx")
	private int idx;
	@JsonProperty("user_name")
	private String user_name;
	@JsonProperty("recipe_name")
	private String recipe_name;
	@JsonProperty("state")
	private int state;
	@JsonProperty("price")
	private int price;
	@JsonProperty("time")
	private String time; //DateTime
	@JsonProperty("tip")
	private String tip;
	@JsonProperty("time_want")
	private String time_want; //DateTime
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("address")
	private String address;

	
	public OrderDTO(Object idx, Object user_name, Object recipe_name, Object state, Object price, Object time, Object tip, Object time_want, Object phone, Object address) throws ParseException {
		
		if (idx != null)
			this.idx = (int) idx;
		if (user_name != null)
			this.user_name = (String) user_name;//(int) user_idx;
		if (recipe_name != null)
			this.recipe_name = (String) recipe_name;//(int) recipe_idx;
		if (state != null)
			this.state = (int) state;//(int) process;
		if (price != null)
			this.price = (int) price;
		if (time != null)
			this.time = (String) time;//time.toString();
		if (tip != null)
			this.tip = tip.toString();
		if (time_want != null)
			this.time_want = (String) time_want;//String.valueOf(time_want);//time_want.toString();
		if (phone != null)
			this.phone = (String) phone;//time.toString();
		if (address != null)
			this.address = (String) address;//time.toString();
		
	}
	
	public OrderDTO(int idx, int state) throws ParseException {
		this.idx = idx;
		this.state = state;
	}
	
}
