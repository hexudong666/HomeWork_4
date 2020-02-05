package com.hexudong.mapper;

import java.util.List;

import com.hexudong.entity.Applicant;

public interface AppMapper {

	List<Applicant> getList();

	void del(int id);

	void tj(Applicant a);

	List<Applicant> zc();

	List<Applicant> getPjf(Applicant a);

	List<Applicant> getYjs(Applicant a);

}
