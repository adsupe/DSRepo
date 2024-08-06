package com.codedecode.KafkaDemo.service;

public class MessageBodyEx {

	String msg;
	
	int id;
	
	
	
	
	public MessageBodyEx() {
	}

	public MessageBodyEx(String msg, int id) {
		super();
		this.msg = msg;
		this.id = id;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
