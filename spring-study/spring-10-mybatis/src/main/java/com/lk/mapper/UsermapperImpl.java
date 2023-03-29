package com.lk.mapper;

import com.lk.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UsermapperImpl implements UserMapper{
    //我们的所有操作 都使用sqlSession来执行，在原来，现在都使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();

    }
}
