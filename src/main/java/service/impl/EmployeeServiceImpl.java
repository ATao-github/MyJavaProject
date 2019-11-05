package service.impl;

import com.test.ssh.dao.impl.EmployeeDaoImpl;
import com.test.ssh.domain.Employee;
import com.test.ssh.service.EmployeeService;

/**
 * Created by Administrator on 2019/10/10 0010.
 * Date :2019年10月10日 15点46分
 */
public class EmployeeServiceImpl implements EmployeeService {

    //先对Employee进行注入
    private EmployeeDaoImpl employeeDao;

    @Override
    public Employee login(Employee employee) {

        return employeeDao.login(employee);
    }
    public void setEmployeeDao(EmployeeDaoImpl employeeDao){
        this.employeeDao = employeeDao;
    }

}
