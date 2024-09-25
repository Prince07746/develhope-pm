package companySystem;

import java.util.*;

public class MyCompany {

    public static void main(String[] args) {

        // Create Companies
        Company com1 = new Company("ACCENTURE");

        // Create Departments
        Departement dep1 = new Departement("IT");
        Departement dep6 = new Departement("ENGINEERING");

        // Add departments to Company 1 (ACCENTURE)
        com1.addDepartement(dep1);  // Adding IT department
        com1.addDepartement(dep6);  // Adding ENGINEERING department

        // Create Employees
        Employee emp1 = new Employee("Prince Matongo", "EMP001", 2560.25);
        Employee emp2 = new Employee("John Mark", "EMP002", 2100.72);
        Employee emp3 = new Employee("Elie Davis", "EMP003", 1900.80);

        // Add employees to departments
        com1.addEmployee(dep1.copy(), emp1); // Adding employee 1 to IT department
        com1.addEmployee(dep1.copy(), emp2); // Adding employee 2 to IT department
        com1.addEmployee(dep6.copy(), emp3); // Adding employee 3 to ENGINEERING department

        // Display the current state of the company and departments with employees
        System.out.println(com1.toString());

    }
}

class Company {
    String name;
    HashMap<String, Departement> departements;

    // Constructor to initialize company
    public Company(String name) {
        this.name = name;
        departements = new HashMap<>();
    }

    // Add department to company
    public void addDepartement(Departement departement) {
        if (departements.containsKey(departement.getName())) {
            System.out.println("⚠️  Department \"" + departement.getName() + "\" already exists in " + name);
        } else {
            departements.put(departement.name, departement);
            System.out.println("✅ New Department \"" + departement.name + "\" added to " + name);
        }
    }

    // Add employee to department
    public void addEmployee(Departement departement, Employee employee) {
        if (departements.containsKey(departement.getName())) {
            Departement dept = departements.get(departement.getName());
            dept.addEmployee(employee);
            departements.put(dept.getName(), dept);
        } else {
            System.out.println("❌ Department \"" + departement.getName() + "\" does not exist in " + name);
        }
    }

    // String representation of the company
    @Override
    public String toString() {
        StringBuilder companyInfo = new StringBuilder();
        companyInfo.append("\n========== COMPANY DETAILS ==========\n");
        companyInfo.append("Company Name : ").append(name).append("\n");
        companyInfo.append("-------------------------------------\n");
        companyInfo.append("Departments :\n");

        for (Map.Entry<String, Departement> entry : departements.entrySet()) {
            companyInfo.append("\n").append(entry.getValue().toString()).append("\n");
        }
        companyInfo.append("=====================================\n");
        return companyInfo.toString();
    }
}

class Departement {
    String name;
    Set<Employee> employees;

    // Constructor to initialize department
    public Departement(String name) {
        this.name = name;
        this.employees = new LinkedHashSet<>();
    }

    // Add employee to department
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("👤 Employee \"" + employee.getName() + "\" added to " + name);
    }

    // Create a copy of the department
    public Departement copy() {
        Departement newDeep = new Departement(this.name);
        newDeep.employees = new HashSet<>(this.employees); // Deep copy of employees set
        return newDeep;
    }

    // String representation of the department
    @Override
    public String toString() {
        StringBuilder deptInfo = new StringBuilder();
        deptInfo.append("Department : ").append(name).append("\n");
        deptInfo.append("Employees  : \n");
        for (Employee employee : employees) {
            deptInfo.append(employee.toString()).append("\n");
        }
        deptInfo.append("-------------------------------------");
        return deptInfo.toString();
    }

    public String getName() {
        return  name;
    }
}

class Employee {
    String name;
    String employeeId;
    double salary;

    // Constructor to initialize employee
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // String representation of the employee
    @Override
    public String toString() {
        return String.format("   %-15s %-10s %10.2f", "Name: " + name, "ID: " + employeeId, salary);
    }

    public String getName() {
        return name;
    }
}
