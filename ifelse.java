
/*import java.util.Scanner;
public class ifelse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}*/
/*import java.util.Scanner;
class ifelse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income:");
        int a=sc.nextInt();
        int tax;
        if(a<500000){
            tax=0;   
        }
        else if(a<500000 && a>1000000){
            tax=(a-a*20/100);
        }
        else{
            tax=(a-a*30/100);
        }
        System.out.println("total income=" +tax);
    }
}*/
/*
import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("Enter value of c:");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is largest");
        } else if (b > c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }

    }
}*/
/*import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        String result = marks >= 33 ? "pass" : "fail";
        System.out.println(result);
    }
}*/
/* 
import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr value of a:");
        int a = sc.nextInt();
        System.out.println("Entr value of b:");
        int b = sc.nextInt();
        System.out.println("Enter operator(+,-,*,/,%):");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
        }
    }
}*/

/* 
import java.util.*;

class iflesle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is positive");
        }
    }
}
*/
/* 
import java.util.*;

class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your temperature:");
        int tem = sc.nextInt();

        if (tem >= 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("You donot have fever");
        }
    }
}*/
/* 
import java.util.*;

class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number(1-7):");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Enter number between (1-7):");

        }
    }

}*/
import java.util.*;

class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year:");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }

            }
        }
    }
}
