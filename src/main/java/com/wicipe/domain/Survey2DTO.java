package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter 생성
@Setter // Setter 생성
public class Survey2DTO {
	@JsonProperty("username")
	private String username;
	@JsonProperty("q1")
	private int q1;
	@JsonProperty("q2")
	private String q2;
	
	public Survey2DTO(Object username, Object q1, Object q2) {
		if (username != null)
			this.username = (String) username;
		if (q1 != null)
			this.q1 = (int) q1;
		if (q2 != null)
			this.q2 = (String) q2;
	}
}
