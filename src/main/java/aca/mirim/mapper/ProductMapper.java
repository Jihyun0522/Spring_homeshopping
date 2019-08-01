package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import aca.mirim.domain.Criteria;
import aca.mirim.domain.ProductVO;

public interface ProductMapper {
	
	@Select ("select * from product_tbl")
	public List<ProductVO> getList();
	
	@Insert ("insert into product_tbl (proname, amount, price, imgsrc, content) values(#{proname}, #{amount}, #{price}, #{imgsrc}, #{content})")
	public void insert(ProductVO product);
	
	@Select ("select * from product_tbl where proname = #{proname}")
	public ProductVO read(String proname);
	
	@Delete ("delete product_tbl where proname = #{proname}")
	public void delete(String proname);
	
	@Update ("update product_tbl set amount=#{amount}, price=#{price}, imgsrc=#{imgsrc}, content=#{content} where proname=#{proname}")
	public void update(String proname);
	
	@Update ("update product_tbl set amount = amount-1 where proname=#{proname}")
	public void buy(String proname);
	
	@Select ("select * from product_tbl where ${type} like '%'||#{keyword}||'%'")
	public List<ProductVO> getSearch(Criteria cri);
	
}