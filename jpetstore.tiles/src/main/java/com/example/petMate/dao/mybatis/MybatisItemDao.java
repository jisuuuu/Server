package com.example.petMate.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.mybatis.mapper.ProductMapper;
import com.example.jpetstore.domain.Product;
import com.example.petMate.dao.ItemDao;
import com.example.petMate.domain.Item;

@Repository
public class MybatisItemDao implements ItemDao{
	@Autowired
	private ItemMapper itemMapper;

	public List<Product> getProductListByCategory(String categoryId) 
			throws DataAccessException {
	    return productMapper.getProductListByCategory(categoryId);
	}

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemByItemIdx(int itemIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemByItemTitle(String itemTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(Item itemIdx, Item Item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getItemnameList() {
		// TODO Auto-generated method stub
		return null;
	}



}
