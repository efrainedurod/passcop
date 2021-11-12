package com.passcop.source.dao;

import javax.ejb.Stateless; 

import com.passcop.source.model.Member;

@Stateless
public class MemberDao extends AbstractFacade<Member> {

	private static final long serialVersionUID = 1L;

	public MemberDao() {
		super(Member.class);
	}

	@Override
	public void configure(String filter) {
		initialize();

	} 
}
