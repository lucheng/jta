package com.cheng.dynamic.repository.secondary;

import org.springframework.stereotype.Repository;

import com.cheng.dynamic.entity.Test2;
@Repository
public interface Test2Dao {
	
	Test2 getById(Long id);
	
	Long add(Test2 t);
}
