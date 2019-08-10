package day01_00_practice.StaffDemo;

import javax.crypto.interfaces.PBEKey;

/*
      公司类
 */
public class Company {
    private String CompanyName;//公司名称

    public Company() {
    }

    public Company(String companyName, String employeeName) {
        CompanyName = companyName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }


    public void show(employee ee){
        System.out.println("公司名称:"+CompanyName);
        System.out.println("员工姓名:"+ee.getName());
        if (ee instanceof Coder){
            System.out.println("员工职位:程序员");
        }
        if (ee instanceof Manager){
            System.out.println("员工职位:项目经理");
        }
        System.out.println("员工工号:"+ee.getId());
        System.out.println("员工工资:"+ee.jisuan());


    }
}
