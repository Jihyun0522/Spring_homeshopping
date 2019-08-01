package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;

public interface BoardService {
	
	public List<BoardVO> getList();
	public void register(BoardVO board);
	public void read(int bno);
	public void remove(int bno);
	public void modify(BoardVO board);
	public List<BoardVO> getSearch(Criteria cri);
	
}
