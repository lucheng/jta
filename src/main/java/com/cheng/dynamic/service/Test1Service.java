package com.cheng.dynamic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cheng.dynamic.entity.Test1;
import com.cheng.dynamic.entity.Test2;
import com.cheng.dynamic.repository.primary.Test1Dao;

@Service
@Transactional
public class Test1Service {
	@Autowired
	private Test1Dao test1Dao;
	@Autowired
	private Test2Service test2Service;
	
	public void test(){
		System.out.println(test1Dao);
	}
	
	public void add(Test1 t){
		System.out.println(test1Dao.add(t));
		System.out.println(t.getId());
	}
	
	public void save(){
		Test1 t1 = new Test1();
		t1.setName("t1");
		add(t1);
//		System.out.println(1/0);
		Test2 t2 = new Test2();
		t2.setName("t2");
		test2Service.add(t2);
	}
}
