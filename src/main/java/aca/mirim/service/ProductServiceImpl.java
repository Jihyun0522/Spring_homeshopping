package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.Criteria;
import aca.mirim.domain.ProductVO;
import aca.mirim.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductMapper mapper;
	
	@Override
	public List<ProductVO> getList() {
		return mapper.getList();
	}

	@Override
	public void insert(ProductVO product) {
		mapper.insert(product);
	}

	@Override
	public ProductVO read(String proname) {
		return mapper.read(proname);
	}

	@Override
	public void remove(String proname) {
		mapper.delete(proname);
	}

	@Override
	public void update(String proname) {
		mapper.update(proname);
	}

	@Override
	public List<ProductVO> getSearch(Criteria cri) {
		return mapper.getSearch(cri);
	}

	@Override
	public void buy(String proname) {
		// TODO Auto-generated method stub
		mapper.buy(proname);
	}

}
