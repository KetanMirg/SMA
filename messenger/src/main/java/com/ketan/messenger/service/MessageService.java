package com.ketan.messenger.service;

import java.util.List;

import com.ketan.messenger.beans.Message;
import com.ketan.messenger.database.Database;

public class MessageService {
	List<Message> messageList = null;
	public MessageService() {
		// TODO Auto-generated constructor stub
		messageList = Database.getMessageList();
		
	}
	
	public List<Message> getAllMessages(){
		return messageList;
	}
	
	public void addMessage(Message msg){
		messageList.add(msg);
	}
}
