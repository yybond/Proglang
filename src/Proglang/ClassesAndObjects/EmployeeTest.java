package Proglang.ClassesAndObjects;

public class EmployeeTest {
    public static void main(String[] args) {
        //Создание двух объектов с помошью конструктора.
        Employee empOne = new Employee("Олег Олегов");
        Employee empTwo = new Employee("Иван Иванов");

        //Вызов метода для каждого созданного объекта.
        empOne.empAge(26);
        empOne.empDesignation("Старший инжинер-программист");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Инжинер-программист");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
