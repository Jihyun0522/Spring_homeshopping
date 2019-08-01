package aca.mirim.domain;

public class LoginDTO {
	
	private String loginId;
	private String loginPw;
	private boolean loginCookie;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getLoginPw() {
		return loginPw;
	}
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}
	
	public boolean isLoginCookie() {
		return loginCookie;
	}
	public void setLoginCookie(boolean loginCookie) {
		this.loginCookie = loginCookie;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [loginId=" + loginId + ", loginPw=" + loginPw + ", loginCookie=" + loginCookie + "]";
	}
	
}
