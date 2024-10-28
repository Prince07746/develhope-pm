package EmployeeSystem;


//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods
// to calculate and update salary.



public class Employee implements EmployeesInterface{
    String name;
    String jobTitle;
    double salary;
    public Employee(String name,String jobTitle,double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getJobTitle() {
        return jobTitle;
    }
    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double calculate(){
        return salary - (0.30*salary);
    }
    @Override
    public String toString() {
        return "Employee: " + "name=  " + name + " jobTitle= " + jobTitle + " salary= " + salary;
    }
}
