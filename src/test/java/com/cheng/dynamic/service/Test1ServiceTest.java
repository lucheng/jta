package com.cheng.dynamic.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest()
@Transactional(transactionManager = "xatx")
@Rollback(false)
public class Test1ServiceTest {
	@Autowired
	private Test1Service test1Service;
	@Test
	public void testTest() throws Exception {
		test1Service.save();
	}

}
