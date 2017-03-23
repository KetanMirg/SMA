package com.ketan.messenger.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ketan.messenger.beans.Message;

public class Database {
	
	private static List<Message> messageList = new ArrayList<>();
	public static HashMap<Integer,Message> messageMap = new HashMap<>();
			
	
	public static Map getMessageList(){
		Message m = new Message();
		m.setId(1);
		m.setMessage("This is the first message!");
		messageMap.put(m.getId(),m);
		return messageMap;
	}

}
