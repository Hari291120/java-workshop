package workshop;

public class StringExample {
    public static void main(String[] args) {
         String firstName="HARI";
         String lastName="HARAN";

         String fullName = firstName+ " " +lastName;

         System.out.println(fullName.toUpperCase());
    

        String sentance = "This program show how can we split a string into multiple";
        String words[]  = sentance.split("");

        for (String word : words){
    
            System.out.println();
        }
    }
}