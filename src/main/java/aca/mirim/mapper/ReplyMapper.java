package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import aca.mirim.domain.ReplyVO;

public interface ReplyMapper {
	
	@Select ("select * from reply_tbl where bno=#[bno}")
	public List<ReplyVO> getList(int bno);
	
	@Insert ("insert into tbl_reply (bno, reply, replyer) values (#{bno}, #{reply}, #{replyer})	")
	public void insert(ReplyVO vo);
	
	@Delete ("delete from tbl_reply where rno = #{rno}")
	public void delete(int rno);
	
	@Update ("update tbl_reply set reply=#{reply}, updateDate = sysdate where rno = #{rno}")
	public void update(ReplyVO vo);
	
	@Select ("select * from tbl_reply where rno = #{rno}")
	public ReplyVO read(int rno);
	
}