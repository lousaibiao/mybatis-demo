package com.lou.mybatis.mapper;

import com.lou.mybatis.model.Account;
import com.lou.mybatis.model.AccountCondition;
import com.lou.mybatis.model.ComplexAccount;
import com.lou.mybatis.model.ManyAccounts;

import java.util.List;

public interface IAccountMapper {
    List<Account> allAccounts();

    List<Account> findAccountByCondition(AccountCondition condition);

    Account findByIds(Integer accountId, Integer userId);

    Account findById(Integer accountId);
    List<Account> findByUserId(Integer userId);

    void addAccount(Account account);

    void addAccounts(ManyAccounts accounts);

    void addAccountReturnSum(Account account);

    /**
     * 通过用户名称查询account，虽然这个方法是错的。
     * @param name
     */
    void findByUserName(String name);

    ComplexAccount findAccountWithUser(Integer id);

}
