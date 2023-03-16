
/*class loops {
  public static void main(String args[]) {
    int counter = 0;
    while (counter < 100) {
      System.out.println("hello world");
      counter++;
    }

  }
}*/
/*class loops {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n:");
    int n = sc.nextInt();
    int i = 0;
    while (i <= n) {
      System.out.print(i);
      i++;

    }

  }
}
*/
/* 
class loops {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n:");
    int n = sc.nextInt();
    int i = 0;
    int sum = 0;
    while (i <= n) {

      sum = sum + i;
      i++;

    }
    System.out.println(+sum);

  }
}
/*
 * import java.util.Scanner;
 * public class loops {
 * public static void main(String args[]){
 * Scanner sc= new Scanner(System.in);
 * System.out.print("Enter value of n: ");
 * int n= sc.nextInt();
 * int sum=0;
 * for(int i=1;i<n;i++){
 * sum=sum+i;
 * }
 * System.out.println("Sum of n numbers:"+sum);
 * }
 * }
 */
/*
 * import java.util.Scanner;
 * public class loops {
 * public static void main(String args[]){
 * int n,count =0;
 * Scanner sc= new Scanner(System.in);
 * System.out.print("Enter value of n: ");
 * n= sc.nextInt();
 * 
 * for(int i=1;i<=n;i++){
 * if(n%i==0){
 * count++;
 * }
 * }if(count==2){
 * System.out.println("prime");
 * 
 * }
 * else{
 * System.out.println("not prime");
 * }
 * }
 * }
 */
/*
 * class loops {
 * public static void main(String[] args) {
 * int i = 0;
 * int num = 0;
 * System.out.println("Prime numbers from 1 to 100 are :");
 * for (i = 1; i <= 100; i++) {
 * int counter = 0;
 * for (num = i; num >= 1; num--) {
 * if (i % num == 0) {
 * counter++;
 * }
 * }
 * if (counter == 2) {
 * System.out.println(+i);
 * }
 * }
 * 
 * }
 * 
 * }
 */
/*
 * class loops {
 * public static void main(String args[]) {
 * int n = 10;
 * String a = "hello world";
 * for (int i = 1; i <= n; i++) {
 * System.out.println(a);
 * }
 * }
 * }
 */
/* 
class loops {
  public static void main(String args[]) {
    for (int i = 1; i < 5; i++) {
      System.out.println("****");
    }

  }
}*/
/*class loops {
  public static void main(String args[]) {
    int n = 100899;
    int rev = 0;
    while (n > 0) {
      int lastdigit = n % 10;
      rev = (rev * 10) + lastdigit;
      n = n / 10;
    }
    System.out.println("Reverse of the given number:" + rev);
  }
}
*/
/*import java.util.*;

class loops {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();
    int rev = 0;
    for (; n > 0; n /= 10) {
      int lastdigit = n % 10;
      rev = rev * 10 + lastdigit;
    }
    System.out.println(+rev);
  }
}*/
/*
 * import java.util.*;
 * 
 * class loops {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number:");
 * int n = sc.nextInt();
 * int rev = 0;
 * while (n > 0) {
 * int lastdigit = n % 10;
 * rev = rev * 10 + lastdigit;
 * n /= 10;
 * }
 * System.out.println(+rev);
 * 
 * }
 * }
 */
/* 
class loops {
  public static void main(String[] args)

  {
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
    }
  }
}
*/
/*import java.util.*;

class loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number:");
    int x = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * x);
    }

  }
}
*/

/*import java.util.Scanner;

public class loops {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n: ");
    int n = sc.nextInt();
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println("factorial of the number:" + fact);
  }
}
*/

import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    int choice;
    int evenSum = 0;
    int oddSum = 0;
    do {
      System.out.print("Enter the number ");
      number = sc.nextInt();
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
      System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
      choice = sc.nextInt();
    } while (choice == 1);
    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);
  }
}