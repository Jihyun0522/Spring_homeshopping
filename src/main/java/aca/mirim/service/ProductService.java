package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.Criteria;
import aca.mirim.domain.ProductVO;

public interface ProductService {
	
	public List<ProductVO> getList();
	public void insert(ProductVO product);
	public ProductVO read(String proname);
	public void remove(String proname);
	public void update(String proname);
	public List<ProductVO> getSearch(Criteria cri);
	
}
