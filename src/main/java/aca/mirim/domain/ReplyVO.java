package aca.mirim.domain;

import java.util.Date;

public class ReplyVO {

	private int num;
	private String content;
	private String writer;
	private Date date;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [num=" + num + ", content=" + content + ", writer=" + writer + ", date=" + date + "]";
	}
	
}
