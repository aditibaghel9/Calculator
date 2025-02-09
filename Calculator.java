import java.util.Scanner;

public class Calculator{

Scanner sc = new Scanner(System.in);

public float getNum1(){

    float n1 = sc.nextFloat();

    return n1;
}

public float getNum2(){

    float n2 = sc.nextFloat();

    return n2;
}

public String getOption(){

    String o1 = sc.next();

    return o1;
}


public void Addition(float b1, float b2){

    float sum = b1+b2;

    System.out.println(b1 + "+" + b2 + "=" + sum);
} 

public void Subtraction(float s1, float s2){

float dif = s1-s2;

    System.out.println(s1 + "-" + s2 + "=" + dif);
} 

public void Multiplication(float m1, float m2){

    float product = m1*m2;

    System.out.println(m1 + "*" + m2 + "=" + product);
} 

public void Division(float d1, float d2){

    float divide = d1/d2;

    if(d2==0){

    System.out.println("Error: Divide By Zero");
    }
    else {

    System.out.println(d1 + "/" + d2 + "=" + divide);
}
} 

    public static void main(String[] args) {
        
       Calculator obj = new Calculator();

       System.out.println("Enter two whole numbers");

       float a1 = obj.getNum1();

       float a2 = obj.getNum2();

       System.out.println("Would you like the numbers to perform addition, subtraction, multiplication, or division, put + for addition, - for subtraction, * for multiplication, and / for division?");
       
       String o1 = obj.getOption();

       if(o1.equals("+")){

        obj.Addition(a1, a2);
       }

       if(o1.equals("-")){

        obj.Subtraction(a1, a2);
       }

       if(o1.equals("*")){

        obj.Multiplication(a1, a2);
       }

       if(o1.equals("/")){

        obj.Division(a1, a2);
       }
    }
}