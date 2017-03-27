package com.ketan.messenger.Endpoints;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ketan.messenger.beans.Message;
import com.ketan.messenger.service.MessageService;
import com.ketan.messenger.util.JsonConverter;



@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageEndpoints {
	
	MessageService ms = new MessageService();
	@GET
	public List<Message> getAllMessages(){
		List<Message> msgList = new ArrayList<>();
		Set<Map.Entry<Integer, Message>> set =  ms.getAllMessages().entrySet();
		for(Map.Entry<Integer, Message> e : set){
			msgList.add(e.getValue());
		}
		return  msgList;
	}
	

	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") int id){
		Message msg = ms.getMessage(id);
		return msg;
	}
	
	//Returning map as string\json example
	@GET
	@Path("/allmessages")
	public String getMessages(){
		List<Message> msgList = new ArrayList<>();
		Set<Map.Entry<Integer, Message>> set =  ms.getAllMessages().entrySet();
		for(Map.Entry<Integer, Message> e : set){
			msgList.add(e.getValue());
		}
		JsonConverter.getJSONFromMap(ms.getAllMessages());
		return  JsonConverter.getJSONFromMap(ms.getAllMessages());
	}
	
	

	@POST
	public Message addMessage( Message msg){

		ms.addMessage(msg);
		return msg;
	}

}
