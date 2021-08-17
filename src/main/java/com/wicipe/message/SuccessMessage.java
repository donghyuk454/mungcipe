package com.wicipe.message;

public class SuccessMessage extends Message {

	public SuccessMessage(String result) {
		this.code = 200;
		this.message = "";
		this.result = result;
	}
}
