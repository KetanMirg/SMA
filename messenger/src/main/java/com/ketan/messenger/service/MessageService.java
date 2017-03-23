package com.ketan.messenger.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ketan.messenger.beans.Message;
import com.ketan.messenger.database.Database;

public class MessageService {
	 HashMap<Integer,Message> messageMap  = null;
	public MessageService() {
		// TODO Auto-generated constructor stub
		messageMap = (HashMap<Integer, Message>) Database.getMessageList();
		
	}
	
	public Map getAllMessages(){
		return messageMap;
	}
	
	public void addMessage(Message msg){
		messageMap.put(msg.getId(),msg);
	}
	
	public Message getMessage(int id){
		return messageMap.get(id);
	}
}
