package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.UserVO;

public interface UserService {
	public List<UserVO> getList();
	public UserVO read(String id);
	public void insert(UserVO user);  
	public void remove(String id);	
	public UserVO login(LoginDTO dto);
}
