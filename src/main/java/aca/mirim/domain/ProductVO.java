package aca.mirim.domain;

public class ProductVO {

	private String proname;
	private int amount;
	private int price;
	private String imgsrc;
	private String content;
	
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "ProductVO [proname=" + proname + ", amount=" + amount + ", price=" + price + ", imgsrc=" + imgsrc
				+ ", content=" + content + "]";
	}
	
}
