package encryption;

import java.util.Scanner;

public class Caesar implements Cipher {
    
    private int shift;

    /* initialize this Caesar object by getting the shift */
    public Caesar(Scanner keyboard) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter the Caesar shift value (0-25): "); 
        
        try{
            shift = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Invalid input! Enter an integer next time. Try again.");
            System.exit(0);
        }
        if(shift < 0 || shift > 25){
            System.out.println("Invalid input! Enter 0-25 next time. Try again.");
            System.exit(0);
        }
    }

    /* encrypt plainText */
    @Override public String encrypt(String plainText) {
        String encrypString = "";
        plainText = plainText.toUpperCase();

        for(int i = 0; i < plainText.length(); i++){
            int letter = (int)plainText.charAt(i);

            if(letter < 65 || letter > 90){
                encrypString += (char)letter;
            }
            else{
                char encrypChar = (char)((((letter - 65)+shift) % 26) + 65);
                encrypString += encrypChar;
            }
        }
        return encrypString;
    }

    /* decrypt cipherText */
    @Override public String decrypt(String cipherText) {
        String decrypString = "";
        cipherText = cipherText.toUpperCase();

        for(int i = 0; i < cipherText.length(); i++){
            int letter = (int)cipherText.charAt(i);

            if(letter < 65 || letter > 90){
                decrypString += (char)letter;
            }
            else{
                char decrypChar = (char)(((letter - 65 - shift) % 26) + 65);
                decrypString += decrypChar;
            }
        }
    return decrypString;
    }
}
