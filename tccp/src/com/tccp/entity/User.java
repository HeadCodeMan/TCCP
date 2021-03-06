package com.tccp.entity;

import java.util.Date;

public class User {
	private int user_id;
	private String username;
	private String password;
	private int sex;
	private String phonenum;
	private String mail;
	private String qq;
	private String blog;
	private String github;
	private String grade;
	private String major;
	private Date birthday;
	private String workplace;
	private String job;
	private int priority;
	private String image;
	
	public User(){
		super();
	}
	
	public User(int user_id, String username, String password, int sex,
			String phonenum, String mail, String qq, String blog,
			String github, String grade, String major, Date birthday,
			String workplace, String job, int priority, String image) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.phonenum = phonenum;
		this.mail = mail;
		this.qq = qq;
		this.blog = blog;
		this.github = github;
		this.grade = grade;
		this.major = major;
		this.birthday = birthday;
		this.workplace = workplace;
		this.job = job;
		this.priority = priority;
		this.image = image;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username
				+ ", password=" + password + ", sex=" + sex + ", phonenum="
				+ phonenum + ", mail=" + mail + ", qq=" + qq + ", blog=" + blog
				+ ", github=" + github + ", grade=" + grade + ", major="
				+ major + ", birthday=" + birthday + ", workplace=" + workplace
				+ ", job=" + job + ", priority=" + priority + ", image=" + image + "]";
	}
	
	
}
