package com.springlec.base.model;

public class ADto {

	int seq;
	String aName;
	String aContent;
	String aAddress;
	String aEmail;
	String aRelation;
	
	public ADto() {
		
	}

	public ADto(int seq, String aName, String aContent, String aAddress, String aEmail, String aRelation) {
		super();
		this.seq = seq;
		this.aName = aName;
		this.aContent = aContent;
		this.aAddress = aAddress;
		this.aEmail = aEmail;
		this.aRelation = aRelation;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaContent() {
		return aContent;
	}

	public void setaContent(String aContent) {
		this.aContent = aContent;
	}

	public String getaAddress() {
		return aAddress;
	}

	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getaRelation() {
		return aRelation;
	}

	public void setaRelation(String aRelation) {
		this.aRelation = aRelation;
	}
	
	
}
