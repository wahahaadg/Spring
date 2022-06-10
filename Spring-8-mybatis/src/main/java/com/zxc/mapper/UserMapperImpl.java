package com.zxc.mapper;

import com.zxc.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //在Mybatis中用sqlSession执行的操作，在Spring中都是用SqlSessionTemplate来操作
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    public int addUser(User user) {
        return 0;
    }

    public int deleteUser(int id) {
        return 0;
    }


}
