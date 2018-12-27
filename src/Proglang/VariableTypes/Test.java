package Proglang.VariableTypes;

public class Test {
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Возраст щенка: " + age);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
