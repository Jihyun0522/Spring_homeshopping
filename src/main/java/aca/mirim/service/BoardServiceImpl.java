package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper brdMapper;
	
	@Override
	public List<BoardVO> getList() {
		return brdMapper.getList();
	}

	@Override
	public void register(BoardVO board) {
		brdMapper.insert(board);		
	}

	@Override
	public void read(int bno) {
		brdMapper.read(bno);
	}

	@Override
	public void remove(int bno) {
		brdMapper.delete(bno);
	}

	@Override
	public void modify(BoardVO board) {
		brdMapper.update(board);
	}

	@Override
	public List<BoardVO> getSearch(Criteria cri) {
		return brdMapper.getSearch(cri);
	}
	
}