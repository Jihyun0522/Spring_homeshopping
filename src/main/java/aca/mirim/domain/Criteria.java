package aca.mirim.domain;

public class Criteria {
	private String type;
	private String keyword;
	
	@Override
	public String toString() {
		return "Criteria [type=" + type + ", keyword=" + keyword + "]";
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
