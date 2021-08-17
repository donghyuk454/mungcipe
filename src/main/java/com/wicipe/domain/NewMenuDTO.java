package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter 생성
@Setter // Setter 생성
public class NewMenuDTO {
	@JsonProperty("idx")
	private int idx;
	@JsonProperty("user_name")
	private String user_name;
	@JsonProperty("text")
	private String text;
	@JsonProperty("new_menu")
	private String new_menu;
	
	public NewMenuDTO(Object idx, Object user_name, Object text, Object new_menu) {
		if (idx != null)
			this.idx = (int) idx;
		if (user_name != null)
			this.user_name = user_name.toString();
		if (text != null)
			this.text = text.toString();
		if (new_menu != null)
			this.new_menu = new_menu.toString();
	}
}
