package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter 생성
@Setter // Setter 생성
public class Survey3DTO {
	@JsonProperty("username")
	private String username;
	@JsonProperty("q1")
	private String q1;
	@JsonProperty("q2")
	private String q2;
	@JsonProperty("q3")
	private String q3;
	
	public Survey3DTO(Object username, Object q1, Object q2, Object q3) {
		if (username != null)
			this.username = (String) username;
		if (q1 != null)
			this.q1 = (String) q1;
		if (q2 != null)
			this.q2 = (String) q2;
		if (q3 != null)
			this.q3 = (String) q3;
	}
}
