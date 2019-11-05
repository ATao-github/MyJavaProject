package action;

/**
 * Created by Administrator on 2019/10/10 0010.
 * Date :2019年10月10日 15点44分
 */

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Employee;
import service.EmployeeService;


public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {


    //模型驱动使用的对象
    private Employee employee = new Employee();

    //进入业务层
    private EmployeeService employeeService;
    //编写login代码
    public String login() {
        //此时，还未定义public Employee login(Employee employee)方法，会有报错
        Employee existEmployee = employeeService.login(employee);
        if(existEmployee == null){
            //方法返回值为空，登陆失败
            this.addActionError("用户名或密码错误");
            return INPUT;
        }else {
            //成功查询并返回，登陆成功
            ActionContext.getContext().getSession().put("existEmployee",existEmployee);
            return SUCCESS;
        }
    }

    @Override
    public Employee getModel() {
        return employee;
    }


    //Employee 和 EmployeeService 的 setter，可以使 Spring 进行注入
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



}

