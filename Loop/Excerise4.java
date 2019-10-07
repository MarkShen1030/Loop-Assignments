import java.util.Scanner;


class Excerise4 {

public static void main (String[] args) {
Scanner coop = new Scanner(System.in);

String P = " "; 
int bar = 0;  


System.out.println("What character do you want your bar made of? ");
P = coop.next();

System.out.println("How long do you want your bar? ");

bar = coop.nextInt();
System.out.println("");

System.out.println("Here's your bar:");
System.out.println("");

for (int i = 0; i < bar; i++) {
System.out.print(P);

       
    }

}
}