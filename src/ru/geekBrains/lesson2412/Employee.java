package ru.geekBrains.lesson2412;

public class Employee {

    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String tel;
    private String salary;
    private int age;

    public Employee (String name, String surname, String patronymic, String position, String tel, String salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getTel() {
        return tel;
    }

    public String getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
