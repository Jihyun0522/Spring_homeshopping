package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.UserVO;

public interface UserMapper {
	@Select("select * from user_tbl")
	public List<UserVO> getList();
	
	@Select("select * from user_tbl where id = #{id}")
	public UserVO read(String id);
	
	@Insert("insert into user_tbl(id,password,name) values(#{id}, #{password}, #{name}")
	public void insert(UserVO user);  
	
	@Delete("delete from user_tbl where id = #{id}")
	public void remove(String id);
	
	@Select("select * from tbl_user where id = #{loginId} and password = #{loginPw}")
	public UserVO login(LoginDTO dto);
}
