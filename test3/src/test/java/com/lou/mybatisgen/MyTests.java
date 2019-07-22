package com.lou.mybatisgen;

import com.lou.mybatisgen.mapper.AccountMapper;
import com.lou.mybatisgen.mapper.UserMapper;
import com.lou.mybatisgen.model.User;
import com.lou.mybatisgen.model.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyTests {

    private UserMapper userMapper;
    private AccountMapper accountMapper;
    private SqlSession sqlSession;

    @Before
    public void doBefore() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        this.sqlSession = sqlSessionFactory.openSession();
        this.userMapper = sqlSession.getMapper(UserMapper.class);
        this.accountMapper = sqlSession.getMapper(AccountMapper.class);
    }

    @After
    public void doAfter() {
        if (sqlSession != null) {
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void test0() {
        System.out.println("hello tests");
        System.out.println("hello tests");
        System.out.println("hello tests");
    }

    @Test
    public void test1(){
        System.out.println(userMapper.selectByPrimaryKey(1));
    }

    @Test
    public void test2(){
        UserExample userExample = new UserExample();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        ids.add(5);
        UserExample.Criteria criteria = userExample.createCriteria().andAgeEqualTo(13).andNameLike("%3%");
        criteria.andIdIn(ids);
        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);
    }

    @Test
    public void test3(){
        UserExample userExample = new UserExample();
        userExample.setOrderByClause("id asc, name desc");
        userExample.createCriteria().andAgeGreaterThan(12);
        RowBounds rowBounds = new RowBounds(1,2);
        List<User> users = userMapper.selectByExampleWithRowbounds(userExample, rowBounds);
        System.out.println(users);
    }

//    public UserExample.Criteria addNameSoudsLike(String value){
//        StringBuilder builder = new StringBuilder("SOUNDEX(FIRST_NAME) = SOUNDEX('");
//        builder.append(value);
//        builder.append("')");
//        addCriterion(builder.toString());
//
//    }

}
