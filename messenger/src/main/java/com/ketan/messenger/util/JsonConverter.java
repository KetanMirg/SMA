package com.ketan.messenger.util;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ketan.messenger.beans.Message;

public class JsonConverter {

	
	public static String getJSONFromMap(Map<String, Message> inputMap) {
		Writer writer = new StringWriter();
		JsonGenerator jsonGenerator;
		String outputResponse = null;
		try {
			jsonGenerator = new JsonFactory().createJsonGenerator(writer);
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(jsonGenerator, inputMap);
			jsonGenerator.close();
			outputResponse = writer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputResponse;
	}
	
	
	public static void main(String[] args) {
		HashMap<String, Message> testMap = new HashMap<>();
		Message m = new Message();
		m.setId(3);
		m.setMessage("my message");
		testMap.put("msg", m);
		System.out.println("Map value as JSON:"+getJSONFromMap(testMap));
		
	}
}
