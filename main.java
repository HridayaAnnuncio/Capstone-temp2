import operation.*;
import java.io.*;
class main{
public static void main(String[] args){
multiplication mult = new multiplication();
addition add = new addition();
subtraction sub = new subtraction();
division div = new division();

int number1, number2;
Scanner obj = new Scanner(System.in);
do{
System.out.println("Enter two numbers:");
number1 = obj.nextInt();
number2 = obj.nextInt();
System.out.println("Choose the operation");
System.out.println("Enter Addition --> 1, Subtraction --> 2, Division --> 3, Multiplication --> 4");
int choice = obj.nextInt();
if(choice == 1){
int result = add.addition(number1,number2);
System.out.println(result);
}
else if(choice == 2){
int result = sub.subtract(number1,number2);
System.out.println(result);
}
else if(choice == 3){
int result = mult.multiply(2,3);
System.out.println(result);
}
else{
int result = mult.multiply(2,3);
System.out.println(result);
}


}
}
