package com.util;

import java.util.List;

public class ResponseBody {
	private List<?> list;
	private MessageBean msgbean;

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public MessageBean getMsgbean() {
		return msgbean;
	}

	public void setMsgbean(MessageBean msgbean) {
		this.msgbean = msgbean;
	}

}
