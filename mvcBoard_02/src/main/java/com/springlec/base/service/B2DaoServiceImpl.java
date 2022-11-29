package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.B2Dao;
import com.springlec.base.model.B2Dto;


@Service
public class B2DaoServiceImpl implements B2DaoService {

	@Autowired
	B2Dao dao;
	
	
	@Override
	public List<B2Dto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return dao.listDao();
	}

}
