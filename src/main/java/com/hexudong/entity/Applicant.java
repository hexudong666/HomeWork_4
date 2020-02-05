package com.hexudong.entity;

import java.util.Date;


public class Applicant{

	/** 主键 **/
	private Integer id;
	/** 应聘人 **/
	private String name;
	/** 性别:1男；2女 **/
	private String gender;
	/** 出生日期 **/
	private Date birthday;
	/** 毕业大学 **/
	private String college;
	/** 所学专业 **/
	private String major;
	/** 学历:1-专科，2-本科，3-研究生 **/
	private Integer edu;
	/** 学位:1-学士，2-硕士，3-博士 **/
	private Integer degree;
	/** 创建日期 **/
	private Date created;
	/** 各门课程的成绩 **/
	private String scoreDesc;
	/** 平均分 **/
	private Integer argScore;
	/** 主持分 **/
	private Integer zcScore;
	
	
	
	public String getScoreDesc() {
		return scoreDesc;
	}
	public void setScoreDesc(String scoreDesc) {
		this.scoreDesc = scoreDesc;
	}
	public Integer getArgScore() {
		return argScore;
	}
	public void setArgScore(Integer argScore) {
		this.argScore = argScore;
	}
	public Integer getZcScore() {
		return zcScore;
	}
	public void setZcScore(Integer zcScore) {
		this.zcScore = zcScore;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Integer getEdu() {
		return edu;
	}
	public void setEdu(Integer edu) {
		this.edu = edu;
	}
	public Integer getDegree() {
		return degree;
	}
	public void setDegree(Integer degree) {
		this.degree = degree;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Applicant [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", college="
				+ college + ", major=" + major + ", edu=" + edu + ", degree=" + degree + ", created=" + created
				+ ", scoreDesc=" + scoreDesc + ", argScore=" + argScore + ", zcScore=" + zcScore + "]";
	}
	
	
	
	
}
