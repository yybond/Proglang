package Proglang.VariableTypes;

public class EmployeeVar {
    //переменная экземляра открыта для любого дочерного класса.
    public String name;

    //переменная salary видна только EmployeeVar.
    private double salary;

    //Константа
    public static final String DEPARTMENT = "QA";

    //имя переменной присваевается в конструкторе.
    public EmployeeVar(String empName){
        name = empName;
    }

    //переменной salary присваевается зарплата
    public void setSalary(double empSal){
        salary = empSal;
    }

    //это метод выводит на экран данные сотрудников
    public void printEmp(){
        System.out.println("имя: " + name + " " + DEPARTMENT);
        System.out.println("зарплата: " + salary);
    }

    public static void main(String[] args) {
        EmployeeVar empOne = new EmployeeVar("Олег");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
