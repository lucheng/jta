package com.cheng.dynamic.repository.primary;

import org.springframework.stereotype.Repository;

import com.cheng.dynamic.entity.Test1;
@Repository
public interface Test1Dao {
	
	Test1 getById(Long id);

	Long add(Test1 t);
}
