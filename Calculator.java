import java.util.Scanner;

public class Calculator{

Scanner sc = new Scanner(System.in);

public void Addition(){

    System.out.println("Enter two whole numbers");

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int sum = n1+n2;

    System.out.println(n1 + "+" + n2 + "=" + sum);
} 

    public static void main(String[] args) {
        
       Calculator obj = new Calculator();

       obj.Addition();
    }
}