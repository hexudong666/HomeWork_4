package com.hexudong.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexudong.entity.Applicant;
import com.hexudong.mapper.AppMapper;
import com.hexudong.service.AppService;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	AppMapper mapper;
	
	@Override
	public List<Applicant> getList() {
		return mapper.getList();
	}
	
	
	@Override
	public void tj(Applicant a) {
		mapper.tj(a);
	}
	
	
	@Override
	public void del(int id) {
		mapper.del(id);
	}
	
	
	@Override
	public List<Applicant> zc() {
		
		return mapper.zc();
	}
	
	@Override
	public void pjf(Applicant a) {
		mapper.getPjf(a);
	}
	
	@Override
	public void yjs(Applicant a) {
		mapper.getYjs(a);
	}
}
