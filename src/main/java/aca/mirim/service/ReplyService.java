package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> getList(int bno);
	public void insert(ReplyVO vo);
	public void delete(int rno);
	public void update(ReplyVO vo);
	
}
