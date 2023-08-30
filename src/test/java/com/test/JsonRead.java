package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	public static void main(String[] args) throws IOException, ParseException {
		
	
	FileReader fr = new FileReader("C:\\Users\\Praveen\\eclipse-workspace\\JsonRead\\src\\test\\resources\\Sample.json");
	JSONParser jsonParser = new JSONParser();
	Object rootobject = jsonParser.parse(fr);
	
	//type casting object jsonobject (loweroder)obj=(lowerorder)higher order ref;
	
	JSONObject jsonObject = (JSONObject)rootobject;
	Object object = jsonObject.get("name");
	Object object2 = jsonObject.get("age");
	Object object3 = jsonObject.get("status");
	Object object4 = jsonObject.get("address");
	Object object5 = jsonObject.get("courses");
	
	System.out.println(object);
	System.out.println(object2);
	System.out.println(object3);
	System.out.println(object4);
	System.out.println(object5);
	
	String name =(String)object;
	System.out.println("Ravi");
	
	
	//object4=type cast from object - jsonobject
	JSONObject jsonObject2= (JSONObject)object4;
	Object object6 = jsonObject2.get("city");
	Object object7 = jsonObject2.get("state");
	
	System.out.println(object6);
	System.out.println(object7);
	
	//Typecast -object5 from object to JsonArray
	JSONArray jsonArray = (JSONArray)object5;
	
	// use for loop
	
	for (int i = 0; i < jsonArray.size(); i++) {
		Object object8 = jsonArray.get(i);
		System.out.println(object8);
		
	}
	
}

	
}