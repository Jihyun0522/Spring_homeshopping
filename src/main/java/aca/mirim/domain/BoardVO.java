package aca.mirim.domain;

import java.util.Date;

public class BoardVO {
	
	private String title;
	private String writer;
	private String content;
	private Date date;
	private int cnt;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", writer=" + writer + ", content=" + content + ", date=" + date + ", cnt="
				+ cnt + "]";
	}
	
}