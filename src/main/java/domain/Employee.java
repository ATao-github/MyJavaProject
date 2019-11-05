package domain;

import java.util.Date;

/**
 * Created by Administrator on 2019/9/29 0029.
 * Date :2019年09月29日 09点02分
 */
public class Employee {
    private int eid;               //员工编号
    private String name;           //员工姓名
    private String sex;            //员工性别
    private int age;               //员工年龄
    private Date joinTime;         //入职日期
    private int eno;               //员工部门编号
    private String username;       //员工账号
    private String password;       //员工密码
    private Department department; //所属部门


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
