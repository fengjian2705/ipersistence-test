//package tech.fengjian.dao;
//
//import org.dom4j.DocumentException;
//import tech.fengjian.io.Resources;
//import tech.fengjian.pojo.User;
//import tech.fengjian.sqlSession.SqlSession;
//import tech.fengjian.sqlSession.SqlSessionFactory;
//import tech.fengjian.sqlSession.SqlSessionFactoryBuilder;
//
//import java.beans.IntrospectionException;
//import java.beans.PropertyVetoException;
//import java.io.InputStream;
//import java.lang.reflect.InvocationTargetException;
//import java.sql.SQLException;
//import java.util.List;
//
//public class UserDaoImpl implements IUserDao {
//
//    @Override
//    public List<User> findAll() throws SQLException, IntrospectionException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, PropertyVetoException, DocumentException {
//        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        List<User> users = sqlSession.selectList("user.selectList");
//        for (User user : users) {
//            System.out.println(user);
//        }
//        return users;
//    }
//
//    @Override
//    public User findByCondition(User user) throws SQLException, IntrospectionException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, PropertyVetoException, DocumentException {
//        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        User u = sqlSession.selectOne("user.selectOne", user);
//        System.out.println(u);
//        return u;
//
//    }
//}
