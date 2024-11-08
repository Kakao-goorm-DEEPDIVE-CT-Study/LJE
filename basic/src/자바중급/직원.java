package 자바중급;

import java.io.IOException;
import java.math.BigDecimal;

public class 직원 {

    public static void main(String[] args) throws IOException {
        Employee manager = new Manager("이지은", BigDecimal.valueOf(100000000000L),"관리자");
        System.out.println(manager.printJob());
    }

}

class Employee {
    String name;
    BigDecimal pay;

    public Employee(String name, BigDecimal pay) {
        this.name = name;
        this.pay = pay;
    }

    public String printJob() {
        return "직원입니다";
    }
}

class Manager extends Employee {
    String job;

    public Manager(String name, BigDecimal pay, String job) {
        super(name, pay);
        this.job = job;
    }

    public String printJob() {
        return "관리자입니다";
    }

}