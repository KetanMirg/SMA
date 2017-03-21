package com.ketan.messenger.database;

import java.util.ArrayList;
import java.util.List;

import com.ketan.messenger.beans.Message;

public class Database {
	
	private static List<Message> messageList = new ArrayList<>();
	
	public static List getMessageList(){
		Message m = new Message();
		m.setId(1);
		m.setMessage("This is the first message!");
		return messageList;
	}

}
