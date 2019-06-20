package com.example.petMate.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.petMate.command.MyPageAdoptCommand;
import com.example.petMate.command.MyPageBuyCommand;
import com.example.petMate.command.MyPageItemCommand;
import com.example.petMate.command.MyPagePetCommand;
import com.example.petMate.dao.AccountDao;
import com.example.petMate.dao.mybatis.mapper.AccountMapper;
import com.example.petMate.domain.Account;
import com.example.petMate.domain.Adopt;
import com.example.petMate.domain.Item;
import com.example.petMate.domain.Pet;
import com.example.petMate.domain.buy;

@Repository
public class MybatisAccountDao implements AccountDao{

	@Autowired
	private AccountMapper accountmapper;
	
	@Override
	public void insertAccount(Account account) throws DataAccessException{
		// TODO Auto-generated method stub
		accountmapper.insertAccount(account);
		
	}

	@Override
	public void updateAccount(Account account) throws DataAccessException{
		// TODO Auto-generated method stub
		accountmapper.updateAccount(account);
		
	}

	@Override
	public Account getAccount(String username, String password) throws DataAccessException{
		// TODO Auto-generated method stub
		return accountmapper.getAccount(username, password);
	}

	@Override
	public Account getAccountById(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return accountmapper.getAccountById(username);
	}

	@Override
	public List<MyPageItemCommand> getItem(String u_idx) {
		// TODO Auto-generated method stub
		return accountmapper.getItem(u_idx);
	}

	@Override
	public List<MyPageBuyCommand> getBuyIamBuyer(String u_idx) {
		// TODO Auto-generated method stub
		return accountmapper.getBuyIamBuyer(u_idx);
	}

	@Override
	public List<MyPageAdoptCommand> getIamAdopter(String u_idx) {
		// TODO Auto-generated method stub
		return accountmapper.getIamAdopter(u_idx);
	}

	@Override
	public List<MyPagePetCommand> getPet(String u_idx) {
		// TODO Auto-generated method stub
		return accountmapper.getPet(u_idx);
	}
	
	
}
