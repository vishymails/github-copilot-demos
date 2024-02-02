package org.example;

public class Employee {
    
    //create an attributes name, age, address, phone, email, salary, department
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;
    private double salary;
    private String department;


    //create a constructor with all attributes
    public Employee(String name, int age, String address, String phone, String email, double salary, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    //create mutator and accessor methods for all attributes
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
}

//create object of Employee class and print all attributes
class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "123 Main St", "1234567890", "mymail@gmail.com", 100000, "IT");

        //create another 5 employee objects and print all attributes with all field values
        Employee employee1 = new Employee("John", 30, "123 Main St", "1234567890", "jdksjd@kjkdj.com", 100000, "IT");
        Employee employee2 = new Employee("John", 30, "123 Main St", "1234567890", "ksdksdj@ksdjks.com", 100000, "IT");

        System.out.println("Name: " + employee.getName());
    }
}