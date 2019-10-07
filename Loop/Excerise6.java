import java.util.Scanner;

  class Excerise6 {

    public static void main (String[] args) {
        
        Scanner gyoza = new Scanner(System.in);
        String coop = "yee";
        
        int input = 0;
        int rand = 0;
        int answer = 0;
   
        
        
        while (coop.equals("P")) {

            System.out.println("ROLL THE DICE:");
            System.out.println("------------------------------------");
            while (coop.equals("P")) {

            System.out.println("HOW MANY ROLLS:");
            input = gyoza.nextInt();

            System.out.println("You roll: ");
            System.out.println(" ");

            for (int i = 0; i < input; i++) {

              rand = (int) (Math.random() * 6) + 1;
              answer = answer + rand;
              System.out.println(rand + " ");

            }

            System.out.println(" ");
            System.out.println("Total rolls: " + answer);
            System.out.println(" ");
            
            System.out.println("Again?");
            System.out.println("yee or nah");
            coop = gyoza.next();

            System.out.println(" ");            

        }

    }
  }
 
}
    