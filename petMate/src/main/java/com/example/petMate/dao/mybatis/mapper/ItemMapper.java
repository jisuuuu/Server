package com.example.petMate.dao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.petMate.domain.Item;

//@Mapper
public interface ItemMapper {

	@Select("SELECT * FROM item ORDER BY i_date")
	List<Item> getItemList();

	@Select("SELECT * FROM item WHERE i_category=#{sort} ORDER BY i_date")
	List<Item> getItemListBy(int sort);
	
	@Select("SELECT * FROM item WHERE i_idx=#{item_idx}")
	Item getItemByItemIdx(int item_idx);

	Item getItemByItemTitle(String item_title);

	void updateItem(Item item_idx, Item Item);

	List<String> getItemnameList();
	
	@Select("SELECT ii_url FROM item, item_image WHERE item.i_idx = item_image.item_i_idx AND item.i_idx= #{item_idx}")
	String[] getItemImageUrls(int item_idx);
	
	boolean isItemInStock(int itemId);
	
	int getInventoryQuantity(int itemId);
}
