import java.util.Scanner;
public class Personality
{
    static String multiChoice1[] = {"B"};
    static int Mexico;
    static int America;
    static int Japan;
    static int Germany;
    public static void main(String[] args) {
            String[] multiChoice1;
            Scanner input = new Scanner(System.in);

            multiChoice1 = new String[5];
            multiChoice1[0] = "1. What's your favorite dish?\n";
            multiChoice1[1] = "2. Pick the first word that speaks to you.\n";
            multiChoice1[2] = "3. Choose an animal.";
            multiChoice1[3] = "4. What's the most important to you out of these?";
            multiChoice1[4] = "5. Which of these do you hate the most?";

            String userSelect0 = multiChoice1[0];

            if(userSelect0==multiChoice1[0]){
                System.out.println(multiChoice1[0]);
                System.out.println("A. Sushi");
                System.out.println("B. Hot dogs");
                System.out.println("C. Tacos");
                System.out.println("D. Sausage");
                System.out.println();
                System.out.print("Your answer: ");
                String uSelect0 = input.next();

                switch (uSelect0.toUpperCase()){
                    case "A":
                        uSelect0 = "Sushi";
                        Japan++;
                    case "B":
                        uSelect0 = "Hot dogs";
                        America++;
                    case "C":
                        uSelect0 = "Tacos";
                        Mexico++;
                        
                    case "D":
                        uSelect0 = "Sausage";
                        Germany++;
                    
           String userSelect1 = multiChoice1[1];
           
           if(userSelect1==multiChoice1[1]){
               System.out.println(multiChoice1[1]);
               System.out.println("A. Word");
               System.out.println("B. Hungry");
               System.out.println("C. Selena");
               System.out.println("D. Wanderlust");
               System.out.println();
               System.out.print("Your answer: ");
               String uSelect1 = input.next();

               switch (uSelect1.toUpperCase()){
                   case "A":
                       uSelect1 = "Word";
                       Japan++;
                   case "B":
                       uSelect1 = "Hungry";
                       America++;
                   case "C":
                       uSelect1 = "Selena";
                       Mexico++;
                       
                   case "D":
                       uSelect1 = "Wanderlust";
                       Germany++;
                       
          String userSelect2 = multiChoice1[2];
                       
          if(userSelect2==multiChoice1[2]){
              System.out.println(multiChoice1[2]);
              System.out.println("A. Cicada");
              System.out.println("B. Eagle");
              System.out.println("C. Bird of Paradise");
              System.out.println("D. Tiger");
              System.out.println();
              System.out.print("Your answer: ");
              String uSelect2 = input.next();

              switch (uSelect2.toUpperCase()){
                  case "A":
                      uSelect2 = "Cicada";
                      Japan++;
                  case "B":
                      uSelect2 = "Eagle";
                      America++;
                  case "C":
                      uSelect2 = "Bird of Paradise";
                      Mexico++;             
                  case "D":
                      uSelect2 = "Tiger";
                      Germany++;
           
           String userSelect3 = multiChoice1[3];

           if(userSelect3==multiChoice1[3]){
               System.out.println(multiChoice1[3]);
               System.out.println("A. Education");
               System.out.println("B. Money");
               System.out.println("C. Family");
               System.out.println("D. Nature");
               System.out.println();
               System.out.print("Your answer: ");
               String uSelect3 = input.next();

               switch (uSelect3.toUpperCase()){
                   case "A":
                       uSelect3 = "Education";
                       Japan++;
                   case "B":
                       uSelect3 = "Money";
                       America++;
                   case "C":
                       uSelect3 = "Family";
                       Mexico++;
                                  
                   case "D":
                       uSelect3 = "Nature";
                       Germany++; 
          
            String userSelect4 = multiChoice1[4];

            if(userSelect4==multiChoice1[4]){
                System.out.println(multiChoice1[4]);
                System.out.println("A. Conflict");
                System.out.println("B. Unambitious People");
                System.out.println("C. Bad food");
                System.out.println("D. Loneliness");
                System.out.println();
                System.out.print("Your answer: ");
                String uSelect4 = input.next();

                switch (uSelect4.toUpperCase()){
                    case "A":
                    	uSelect3 = "Conflict";
                    	Japan++;
                    case "B":
                        uSelect3 = "Unambitious People";
                        America++;
                    case "C":
                        uSelect3 = "Bad food";
                        Mexico++;                         
                    case "D":
                        uSelect3 = "Loneliness";
                        Germany++; 
                        
                        
                }
            }
            // more multiple choice questions with similar structure
        }
            }
    }
}
    }
}
    }
}
    }
}