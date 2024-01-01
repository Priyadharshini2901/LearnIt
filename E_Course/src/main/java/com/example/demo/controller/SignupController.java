package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signup;
import com.example.demo.service.SignupService;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class SignupController 
{
	@Autowired
	   SignupService signSer;
	   @PostMapping("/rpost")
	   public Signup save(@RequestBody Signup s)
	   {
		   return signSer.save(s);
	   }
	   @PostMapping("/logging")
	   public String login(@RequestBody Map<String,String> loginData)
	   {
	 	 String username = loginData.get("username");
	 	 String password = loginData.get("password");
		 String result = signSer.checkLogin(username,password);
		 return result;
	   }

	   @PutMapping("/forgetpassword")
		public String updateRecords (@RequestBody Map<String,String> forgetDataMap) {
			String username = forgetDataMap.get("username");
			String password = forgetDataMap.get("password");
			String result = signSer.forgetData(username, password);
		    return result;
		}
}



   
   
