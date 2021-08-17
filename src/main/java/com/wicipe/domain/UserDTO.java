package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter // Getter 생성
@Setter // Setter 생성
public class UserDTO {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	@JsonProperty("idx")
	private int idx;
	@JsonProperty("id")
	private String id;
	@JsonProperty("address")
	private String address;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("data")
	private String data;
	@JsonProperty("dogname")
	private String dogname;
	
	public UserDTO(int idx_, String id_, String address_, String phone_) {
		this.idx = idx_;
		this.id = id_;
		this.address = address_;
		this.phone = phone_;
	}
	
	public UserDTO(Object idx, Object id, Object address, Object phone) {
		if (idx != null)
			this.idx = (int) idx;
		if (id != null)
			this.id = id.toString();
		if (address != null)
			this.address = address.toString();
		if (phone != null)
			this.phone = phone.toString();
	}
	
	public UserDTO(Object idx, Object id, Object address, Object phone, Object data, Object dogname) {
		if (idx != null)
			this.idx = (int) idx;
		if (id != null)
			this.id = id.toString();
		if (address != null)
			this.address = address.toString();
		if (phone != null)
			this.phone = phone.toString();
		if (data != null)
			this.data = data.toString();
		if (dogname != null)
			this.dogname = dogname.toString();
	}
	
	public UserDTO() {
		
	}
}
