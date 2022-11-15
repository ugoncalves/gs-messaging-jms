package com.example;

public class MyMessage {
	private String body;

	public MyMessage() {
	}

	public MyMessage(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Data{body=%s}", getBody());
	}

}
