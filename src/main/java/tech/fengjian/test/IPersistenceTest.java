package tech.fengjian.test;

import org.dom4j.DocumentException;
import org.junit.Test;
import tech.fengjian.dao.IUserDao;
import tech.fengjian.io.Resources;
import tech.fengjian.pojo.User;
import tech.fengjian.sqlSession.SqlSession;
import tech.fengjian.sqlSession.SqlSessionFactory;
import tech.fengjian.sqlSession.SqlSessionFactoryBuilder;

import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class IPersistenceTest {

    @Test
    public void test() throws PropertyVetoException, DocumentException, SQLException, IntrospectionException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        User user = new User();
//        user.setId(1);
//        user.setUsername("jack");
//        User u = sqlSession.selectOne("user.selectOne", user);
//        System.out.println(u);
//
//        List<Object> objects = sqlSession.selectList("user.selectList");
//        for (Object object : objects) {
//            System.out.println(object);
//        }

        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList = userDao.findAll();
        for (User user1 : userList) {
            System.out.println(user1);
        }

    }
}
