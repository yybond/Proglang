package Proglang.Operators;

public class OperatorSwitch {
    public static void main(String[] args) {
        //char grade = args[0].charAt(0);

        char grade = 'D';

        switch (grade){
            case 'A' :
                System.out.println("Great!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Perfectly executed!");
                break;
            case 'D' :
                System.out.println("You passed!");
                break;
            case 'F' :
                System.out.println("Better try again!");
                break;
            default:
                System.out.println("Incorrect grade!");
        }
        System.out.println("Your grade is " + grade);
    }
}
