import java.util.Scanner;

public class Calculator{

Scanner sc = new Scanner(System.in);

public int getNum1(){

    int n1 = sc.nextInt();

    return n1;
}

public int getNum2(){

    int n2 = sc.nextInt();

    return n2;
}

public String getOption(){

    String o1 = sc.next();

    return o1;
}


public void Addition(int b1, int b2){

    int sum = b1+b2;

    System.out.println(b1 + "+" + b2 + "=" + sum);
} 

public void Subtraction(int s1, int s2){

    int dif = s1-s2;

    System.out.println(s1 + "-" + s2 + "=" + dif);
} 

    public static void main(String[] args) {
        
       Calculator obj = new Calculator();

       System.out.println("Enter two whole numbers");

       int a1 = obj.getNum1();

       int a2 = obj.getNum2();

       System.out.println("Would you like the numbers to perform addition or subtraction, put + for addition or - for subtraction?");
       
       String o1 = obj.getOption();

       if(o1.equals("+")){

        obj.Addition(a1, a2);
       }

       if(o1.equals("-")){

        obj.Subtraction(a1, a2);
       }
    }
}