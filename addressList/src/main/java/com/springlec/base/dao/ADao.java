package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.ADto;

public interface ADao {

	public List<ADto> listDao() throws Exception;
	public void writeDao(String aName,String aContent,
			String aAddress, String aEmail, String aRelation) 
			throws Exception;
	public ADto viewPage(int seq)throws Exception;
	public void deleteDao(int seq) throws Exception;
	public void updatelist(int seq, String aName, String aContent,
			String aAddress, String aEmail, String aRelation)
			throws Exception;
	public List<ADto> search(String searchoption,String keyword) throws Exception;
}