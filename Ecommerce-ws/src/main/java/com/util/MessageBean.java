package com.util;

public class MessageBean {

	private Message msg;
	private boolean success;

	public MessageBean(Message msg, boolean success) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
		this.success = success;
	}

	public MessageBean() {
		// TODO Auto-generated constructor stub
	}

	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
