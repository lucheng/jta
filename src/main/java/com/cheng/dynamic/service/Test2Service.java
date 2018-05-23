package com.cheng.dynamic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cheng.dynamic.entity.Test2;
import com.cheng.dynamic.repository.secondary.Test2Dao;

@Service
@Transactional
public class Test2Service {
	@Autowired
	private Test2Dao test2Dao;

	public void test(){
		System.out.println(test2Dao);
	}
	
	public void add(Test2 t){
		System.out.println(test2Dao.add(t));
		System.out.println(t.getId());
	}
}
