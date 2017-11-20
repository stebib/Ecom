package com.util;

public class Message {
	private String text;

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void appendText(String text) {
		this.text += text;
	}
}
