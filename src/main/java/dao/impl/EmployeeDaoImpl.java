package dao.impl;

import dao.EmployeeDao;
import domain.Employee;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * 这里继承了HibernateDaoSupport,该类主要提供两个方法,方便 DAO 的实现
 * public final void setSessionFactory(SessionFactory sessionFactory)
 *          用来接收Spring的ApplicationContext的依赖注入
 * public final HibernateTemplate getHibernateTemplate()
 *          用来根据刚才的SessionFactory产生Session，最后生成HibernateTemplate来完成数据库访问。
 */

/**
 * Created by Administrator on 2019/10/10 0010.
 * Date :2019年10月10日 15点45分
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
    @Override
    public Employee login(Employee employee) {
        //hql注入
        //查询不是数据库的表名，而是实体类的类名
        String hql = "FROM Employee WHERE USERNAME = ? AND PASWORD = ?";
        List<Employee> list = this.getHibernateTemplate().find(hql, employee.getUsername(), employee.getPassword());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
