package tech.fengjian.dao;

import org.dom4j.DocumentException;
import tech.fengjian.pojo.User;

import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface IUserDao {

    // 查询所有用户
    List<User> findAll() throws SQLException, IntrospectionException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, PropertyVetoException, DocumentException;

    // 根据条件进行用户查询
    User findByCondition(User user) throws SQLException, IntrospectionException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, PropertyVetoException, DocumentException;


}
