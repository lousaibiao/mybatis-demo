package com.lou.mybatis.mapper;

import com.lou.mybatis.MyDefaultVFS;
import com.lou.mybatis.model.*;
import com.lou.mybatis.model.enums.AccountType;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyBatisTest {

    private IUserMapper userMapper;
    private IAccountMapper accountMapper;
    private SqlSession sqlSession;
    private Logger logger;
    private SqlSessionFactory sqlSessionFactory;

    /**
     * 每个test都会进入构造函数，也会进入before,after
     *
     * @throws IOException
     */
    public MyBatisTest() throws IOException {
        System.out.println("实例化一次" + new Date().getTime());
//        System.setProperty("file.encoding","utf-8");
        VFS.addImplClass(MyDefaultVFS.class);
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        System.out.println("factory 实例是:" + sqlSessionFactory);
    }

    @Before
    public void init() throws Exception {
        System.out.println("");
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(IUserMapper.class);
        accountMapper = sqlSession.getMapper(IAccountMapper.class);

    }

    @After
    public void dispose() {
        if (sqlSession != null) {
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void testUsers() {
        List<User> users = userMapper.allUsers();
        System.out.println(users);
    }

    @Test
    public void testAccounts() {
        List<Account> accounts = accountMapper.allAccounts();
        System.out.println(accounts);
    }

    @Test
    public void findAccountsByCondition() {
        AccountCondition accountCondition = new AccountCondition();
        accountCondition.setUserId(1);
        List<Account> accounts = accountMapper.findAccountByCondition(accountCondition);
        System.out.println(accounts);
    }

    @Test
    public void findByIds() {
        Account account = accountMapper.findByIds(1, 2);
        System.out.println(account);
    }

    @Test
    public void findById() {
        Account account = accountMapper.findById(1);
        System.out.println(account);
    }

    @Test
    public void getUserDetailByIdTest() {
        UserDetail userDetail = userMapper.getUserDetailById(2);
        System.out.println(userDetail);
    }

    @Test
    public void findByUserIdTest() {
        List<Account> accounts = accountMapper.findByUserId(1);
        System.out.println(accounts.get(accounts.size() - 1).getAccountType());
    }

    @Test
    public void addAccountTest() {
        Account account = new Account();
        account.setName("hello");
        account.setUserId(1);
        account.setMoney(BigDecimal.valueOf(1234.5));
        account.setAccountType(AccountType.Advanced);
        accountMapper.addAccount(account);
        System.out.println(account.getId());
    }

    @Test
    public void addAccountsTest() {
        ManyAccounts manyAccounts = new ManyAccounts();
        manyAccounts.setAccounts(new ArrayList<>());
        Account account1 = new Account();
        account1.setAccountType(AccountType.Advanced);
        account1.setMoney(BigDecimal.valueOf(1234));
        account1.setUserId(1);
        account1.setName("name1");
        manyAccounts.getAccounts().add(account1);
        Account account2 = new Account();
        account2.setAccountType(AccountType.Advanced);
        account2.setMoney(BigDecimal.valueOf(111234));
        account2.setUserId(1);
        account2.setName("name2");
        manyAccounts.getAccounts().add(account2);
        accountMapper.addAccounts(manyAccounts);

    }

    @Test
    public void addAccountReturnSum() {
        Account account = new Account();
        account.setName("hello");
        account.setUserId(1);
        account.setMoney(BigDecimal.valueOf(1234.5));
        account.setAccountType(AccountType.Advanced);
        accountMapper.addAccountReturnSum(account);
        System.out.println(account.getTotal());
    }

    @Test
    public void getUserWithAccountsTest() {
        ComplexUser user = userMapper.getUserWithAccounts(1);
        System.out.println(user);
    }

    @Test
    public void getUserWithAccounts2Test() {
        System.out.println(userMapper.getUserWithAccounts2(1));
    }

    @Test
    public void getAccountWithUserTest() {
        System.out.println(accountMapper.findAccountWithUser(3));
    }
}
