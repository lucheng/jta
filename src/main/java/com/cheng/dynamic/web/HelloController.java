package com.cheng.dynamic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cheng.dynamic.service.Test1Service;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private Test1Service test1Service;
	
	@RequestMapping("")
	@ResponseBody
	public String index(){
		test1Service.save();
		return "";
	}
}
