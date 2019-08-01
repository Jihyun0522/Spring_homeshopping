package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;

public interface BoardMapper {

	@Select ("select * from board_tbl")
	public List<BoardVO> getList();
	
	@Insert ("insert into board_tbl (title, content, writer) values(#{title}, #{content}, #{writer}")
	public void insert(BoardVO board);
	
	@Select ("select * from board_tbl where bno = #{bno}")
	public BoardVO read(int bno);
	
	@Delete ("delete board_tbl where bno = #{bno}")
	public void delete(int bno);
	
	@Update ("update board_tbl set title=#{title}, content=#{content}, writer=#{writer}, updatedate = sysdate where bno = #{bno} ")
	public void update(BoardVO board);
	
	@Select ("select * from tbl_board where ${type} like '%'||#{keyword}||'%'")
	public List<BoardVO> getSearch(Criteria cri);
	
}