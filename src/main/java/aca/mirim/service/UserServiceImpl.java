package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.UserVO;
import aca.mirim.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper mapper;
	
	@Override
	public List<UserVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public void insert(UserVO user) {
		// TODO Auto-generated method stub
		mapper.insert(user);
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		mapper.remove(id);
	}

	@Override
	public UserVO login(LoginDTO dto) {
		// TODO Auto-generated method stub
		return mapper.login(dto);
	}

	@Override
	public UserVO read(String id) {
		// TODO Auto-generated method stub
		return mapper.read(id);
	}

}
