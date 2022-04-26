package ru.gb.smykov.hm5;

public class Employee {
    private String firstName;
    private String secondName;
    private String position;
    private String email;
    private String phone;
    private int salary;

    public Employee(String firstName, String secondName) {
        this(firstName, secondName, null);
    }

    public Employee(String firstName, String secondName, String position) {
        this(firstName, secondName, position, null);
    }

    public Employee(String firstName, String secondName, String position, String email) {
        this(firstName, secondName, position, email, null);
    }

    public Employee(String firstName, String secondName, String position, String email, String phone) {
        this(firstName, secondName, position, email, phone, 0);
    }

    public Employee(String firstName, String secondName, String position, String email, String phone, int salary) {
        this(firstName, secondName, position, email, phone, salary, 0);
    }

    public Employee(String firstName, String secondName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
    }

    int age;
}
