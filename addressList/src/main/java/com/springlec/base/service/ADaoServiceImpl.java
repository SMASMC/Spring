package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ADao;
import com.springlec.base.model.ADto;
@Service
public class ADaoServiceImpl implements ADaoService {

	@Autowired
	ADao dao;
	
	
	@Override
	public List<ADto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return dao.listDao();
	}


	@Override
	public void writeDao(String aName, String aContent, String aAddress, String aEmail, String aRelation)
			throws Exception {
		dao.writeDao(aName, aContent, aAddress, aEmail, aRelation);
		
	}

	@Override
	public ADto viewPage(int seq) throws Exception {
		return dao.viewPage(seq);
	}

	@Override
	public void deleteDao(int seq) throws Exception {
		dao.deleteDao(seq);
	}


	@Override
	public void updatelist(int seq, String aName, String aContent, String aAddress, String aEmail, String aRelation)
			throws Exception {
		dao.updatelist(seq, aName, aContent, aAddress, aEmail, aRelation);
	}


	@Override
	public List<ADto> search(String searchoption, String keyword) throws Exception {
		keyword='%'+keyword+'%';
		return dao.search(searchoption, keyword);
	}







}
