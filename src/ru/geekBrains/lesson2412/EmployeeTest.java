package ru.geekBrains.lesson2412;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("James" , "Bond", "unknown", "special agent", "007", "1kk$", 40);
        staff[1] = new Employee("Jack" , "Bauer", "unknown", "special agent", "24", "1kk$", 45);
        staff[2] = new Employee("Jason" , "Bourne", "unknown", "special agent", "XXX", "1kk$", 39);
        staff[3] = new Employee("Ethan" , "Hunt", "Matthew", "special agent", "XXX", "1kk$", 38);
        staff[4] = new Employee("Austin" , "Powers", "unknown", "special agent", "XXX", "1kk$", 35);

//        printInfo(staff[1]);



        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() >= 40) {
                printInfo(staff[i]);
                System.out.println();
            }
        }

    }

    private static void printInfo (Employee employee) {
        System.out.printf("Employee name: '%s'; Employee surname: '%s'; Employee patronymic: '%s'; Employee position: %s; Employee telephone: %s; Employee salary: %s; Employee age: %s",
                employee.getName(), employee.getSurname(), employee.getPatronymic(), employee.getPosition(), employee.getTel(), employee.getSalary(), employee.getAge());
    }

}
