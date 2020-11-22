import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        // SETUP VARIABLES
        boolean success = false;
        int count = 0;

        // OBTAIN USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you want java to guess: ");

        // THIS IS THE WORD YOU WANT JAVA TO RECREATE
        String word = input.next();

        while (!success) {
            // WORD JAVA WILL CREATE
            String create = "";

            for (int i = 0; i < word.length(); i++) {
                // RNG
                int rand = (int)(Math.random() * word.length() );

                // LETTER AT INDEX rand WILL BE USED TO CREATE OUR WORD
                for (int j = 0; j < word.length(); j++) {
                    if (rand == j) create += word.charAt(j);
                }

            }

            // KEEP COUNT OF THE WORDS JAVA MAKES
            count++;
            System.out.println(count + "\t\t" + create);

            // SUCCESS!
            if (word.equals(create) ) {
                success = true;
                System.out.println("It took " + count + " tries!");
            }
        }

    }

}