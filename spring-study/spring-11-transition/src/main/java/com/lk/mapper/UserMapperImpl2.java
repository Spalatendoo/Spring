package com.lk.mapper;

import com.lk.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(7, "hxf", "123456");
       // mapper.addUser(user);

         mapper.deleteUser(7);
        return mapper.selectUser();
    }



    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
