import java.util.Scanner;



public class Excerise5 {
    
public static void main (String[] args) {
Scanner coop = new Scanner(System.in);

String input = " "; 
int high = 0;


System.out.println("What character do you want your triangle made of? ");
input = coop.next();


System.out.print("How tall is your triangle? ");
high = coop.nextInt();


System.out.println("");
System.out.println("Here's your triangle:");
System.out.println("");

System.out.println("Look down boi");


   
for (int i = 1; i <= high; i++) {
 for (int i2 = 1; i2 <= i; i2++) {
 System.out.print(input);

}

   System.out.println(" ");

  }

 }

}

