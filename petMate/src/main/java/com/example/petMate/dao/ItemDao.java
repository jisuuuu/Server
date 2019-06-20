package com.example.petMate.dao;

import java.util.List;

import com.example.petMate.command.ItemCommand;
import com.example.petMate.domain.Item;
import com.example.petMate.domain.ItemImage;

public interface ItemDao {

	  List<Item> getAllItemList();// throws DataAccessException;
	  
	  List<Item> getItemListByCategory(int sort);// throws DataAccessException;

	  Item getItemByItemIdx(int item_idx);// throws DataAccessException;

	  Item getItemByItemTitle(String item_title);// throws DataAccessException;

	  int updateItem(ItemCommand Item);// throws DataAccessException;
	  
	  int updateItemStock(Item item_idx, int Stock);// throws DataAccessException;

	  List<String> getItemnameList(); // throws DataAccessException;
	  
	  
	  boolean isItemInStock(int itemId);
	  
	  //void deleteItem(int item_idx);
	  
	  //void deleteItemImage(int item_idx);
	  
	  void updateItemByIdx(int item_idx);

	  String[] getItemImageUrls(int item_idx); // throws DataAccessException;
	  
	  int createItem(ItemCommand itemCommand); // throws DataAccessException;
	  
	  int createItemImage(String ii_url, int i_idx); // throws DataAccessException;
	  
	  int deleteItem(int i_idx); // throws DataAccessException;
	  
	  int deleteItemImages(int i_idx); // throws DataAccessException;
}
