/** 
 * <pre>项目名称:mongodb-bootstrap 
 * 文件名称:Book.java 
 * 包名:com.jk.domain 
 * 创建日期:2018年10月10日下午6:53:31 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/** 
 * <pre>项目名称：mongodb-bootstrap    
 * 类名称：Book    
 * 类描述：    
 * 创建人： 任智伟
 * 创建时间：2018年10月10日 下午6:53:31    
 * 修改人： 任智伟  
 * 修改时间：2018年10月10日 下午6:53:31    
 * 修改备注：       
 * @version </pre>    
 */

public class Book {

	private String bookid;
	
	private String bookname;
	
	private String bookprice;
	
	private String bookimg;
	
	private String imgid;
	
	private String booktypeid;
	
	private List<Book>list;

	private String booktypename;

	public String getBooktypename() {
		return booktypename;
	}

	public void setBooktypename(String booktypename) {
		this.booktypename = booktypename;
	}
	
	
	
	
	
	
	
	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public String getBooktypeid() {
		return booktypeid;
	}

	public void setBooktypeid(String booktypeid) {
		this.booktypeid = booktypeid;
	}

	public String getImgid() {
		return imgid;
	}

	public void setImgid(String imgid) {
		this.imgid = imgid;
	}

	private HashMap<String, Object> map;
	
	
	
	public String getBookimg() {
		return bookimg;
	}

	public void setBookimg(String bookimg) {
		this.bookimg = bookimg;
	}

	public HashMap<String, Object> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createtime;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createtimeMax;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createtimeMin;
	
	

	
	public Date getCreatetimeMax() {
		return createtimeMax;
	}

	public void setCreatetimeMax(Date createtimeMax) {
		this.createtimeMax = createtimeMax;
	}

	public Date getCreatetimeMin() {
		return createtimeMin;
	}

	public void setCreatetimeMin(Date createtimeMin) {
		this.createtimeMin = createtimeMin;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookprice() {
		return bookprice;
	}

	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	
	
	
}
