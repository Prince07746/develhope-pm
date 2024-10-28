package EmployeeSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Employee> Employees = new ArrayList<>();

        Employee employee1 = new Employee("prince","IT",2000);
        Employee employee2 = new Employee("Melissa","IT",3400);
        Employee employee3 = new Employee("Alpha","IT",5700);

        employee2.setSalary(7500);
        employee3.setSalary(4500);


        Employees.add(employee1);
        Employees.add(employee2);
        Employees.add(employee3);
        System.out.println("Employees List");
        System.out.println("===============");
        for (Employee emp:Employees){
            System.out.println(emp.toString());
            System.out.println("NET PAY: "+emp.calculate());
        }




    }
}
