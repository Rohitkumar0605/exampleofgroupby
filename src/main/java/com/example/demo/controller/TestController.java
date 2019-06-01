package com.example.demo.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepository;

@RestController("/test")
public class TestController {
	
	@Autowired
	TestRepository testRepository;
	
	@GetMapping(value ="/getlist", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getList() throws JSONException {
		
		List<String> list = testRepository.findactualStatus();
		String provider = "";
		String partyId = "";
		String productCode = "";
		String actualStatusCount = "";
		
		JSONObject json = new JSONObject();
		for (String string : list) {
			String[] values = string.split(",");
			
			provider =values[0];
			partyId =values[1];	
			productCode =values[2];
			actualStatusCount =values[3];	
		}
		json.put("provider", provider);
		json.put("partyId", partyId);
		json.put("productCode", productCode);
		json.put("actualStatusCount", actualStatusCount);
		
		//return testRepository.findactualStatus();
		return json.toString();
	}
	
	@PostMapping("/add")
	public void add () {
		TestEntity testEntity = new TestEntity(1L,1234,345,12,"Lisa",true);
		TestEntity testEntity2 = new TestEntity(1L,1234,345,12,"Lisa",true);
		TestEntity testEntity3 = new TestEntity(1L,1234,345,12,"Lisa",false);
		TestEntity testEntity4 = new TestEntity(1L,1234,345,12,"Lisa",false);
		TestEntity testEntity5 = new TestEntity(1L,1234,345,12,"Lisa",true);
		testRepository.save(testEntity);
		testRepository.save(testEntity2);
		testRepository.save(testEntity3);
		testRepository.save(testEntity4);
		testRepository.save(testEntity5);	
	}
}
