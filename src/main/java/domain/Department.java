package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2019/9/29 0029.
 * Date :2019年09月29日 09点02分
 */
public class Department {
      private int did;          //部门id
      private String dname;     //部门名称
      private String desc;      //部门描述
      private Set<Employee>  employees = new HashSet<Employee>();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
