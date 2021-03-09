import com.Dao.UserMapper;
import com.pojo.User;
import com.util.MybatisUtils;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 517
 * @date 2021-03-09 - 11:15
 */
public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserId(2);
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(6, "snr", "11111"));
        sqlSession.commit();//增删改提交事务
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(new User(6, "shaniryo", "214213"));
        sqlSession.commit();//增删改提交事务
        sqlSession.close();
    }

    @Test
    public void testUpdateMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId",6);
        map.put("userPwd","nuclear-mission");
        mapper.update2(map);
        sqlSession.commit();//增删改提交事务
        sqlSession.close();
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(2);
        sqlSession.commit();//增删改提交事务
        sqlSession.close();
    }
}
