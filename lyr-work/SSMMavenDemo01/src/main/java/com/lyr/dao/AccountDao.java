package com.lyr.dao;

import com.lyr.po.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
