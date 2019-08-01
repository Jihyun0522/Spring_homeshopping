package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.ReplyVO;
import aca.mirim.mapper.BoardMapper;
import aca.mirim.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	ReplyMapper repMapper;
	
	@Override
	public List<ReplyVO> getList(int bno) {
		return repMapper.getList(bno);
	}

	@Override
	public void insert(ReplyVO vo) {
		repMapper.insert(vo);
	}

	@Override
	public void delete(int rno) {
		repMapper.delete(rno);
	}

	@Override
	public void update(ReplyVO vo) {
		repMapper.update(vo);
	}
	
}
