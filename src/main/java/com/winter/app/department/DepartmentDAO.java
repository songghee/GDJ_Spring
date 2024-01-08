package com.winter.app.department;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String naespace="com.winter.app.departmentDAO";
	
	//update

		
	}


