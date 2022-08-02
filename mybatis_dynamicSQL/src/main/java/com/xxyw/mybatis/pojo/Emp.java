package com.xxyw.mybatis.pojo;

public class Emp {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;

    public Emp() {
    }

    public Emp(Integer emp_id, String emp_name, Integer age, String gender) {
        this.empId = emp_id;
        this.empName = emp_name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer emp_id) {
        this.empId = emp_id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String emp_name) {
        this.empName = emp_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
