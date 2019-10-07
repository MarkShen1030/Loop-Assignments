import java.util.Scanner;

class Excerise3 {

 public static void main (String[] args) {  
 Scanner coop = new Scanner(System.in);

 int input = 0; 
 int answer = 0;
 
 System.out.println("Let's add some numbers! [Type a negative number to quit!]");
 System.out.println("");

 while (input >= 0) {
 System.out.println("Add: ");

 input = coop.nextInt();

 if (input >= 0) {
 answer = answer + input;    

}

}

 System.out.println("");
 System.out.println("The total is: " + answer);

    }

}