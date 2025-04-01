package encryption;

import java.util.Scanner;
import java.lang.Math;

public class Vigenere implements Cipher {
    
    private String key;

    /* initialize this Vigenere object by getting the key string */
    public Vigenere(Scanner keyboard) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter the key string: "); 
        
        key = input.nextLine().toUpperCase();
        
        if(key.length() <= 0){
            System.out.println("Invalid input! key must be at least one letter long. Try again.");
            System.exit(0);
        }
        for(int i = 0; i < key.length(); i++){
            int letter = key.charAt(i);
            if(letter < 65 || letter > 90){
                System.out.println("Invalid input! key must only have letters. Try again.");
                System.exit(0);
            }
        }
    }
    
    private static String lengthSame(String key, String message){
        key = key.toUpperCase();
        message = message.toUpperCase();
        String keyString = "";
        int i = 0;

        while (keyString.length() != message.length()){
          int letter = message.charAt(keyString.length());

          if(letter < 65 || letter > 90){
            keyString += (char)letter;
          }
          else{
            if(i == key.length()){i=0;}
            keyString += key.charAt(i);
            i++;
          }
        }
        return keyString;
      }

    /* encrypt plainText */
    @Override public String encrypt(String plainText) {
        String encrypString = "";
        plainText = plainText.toUpperCase();
        key = key.toUpperCase();

        for(int i = 0; i < plainText.length(); i++){
          int mLetter = (int)plainText.charAt(i);
          String newKey = lengthSame(key, plainText);
          int kLetter = (int)newKey.charAt(i);


          if(mLetter < 65 || mLetter > 90){
            encrypString += (char)mLetter;
          }
          else{
            char encrypChar = (char)(((mLetter + kLetter) % 26) + 65);
            encrypString += encrypChar;
          }
        }
        return encrypString;
    }

    /* decrypt cipherText */
    @Override public String decrypt(String cipherText) {
        String decrypString = "";
        cipherText = cipherText.toUpperCase();
        key = key.toUpperCase();

        for(int i = 0; i < cipherText.length(); i++){
          int mLetter = (int)cipherText.charAt(i);
          String newKey = lengthSame(key, cipherText);
          int kLetter = (int)newKey.charAt(i);


          if(mLetter < 65 || mLetter > 90){
            decrypString += (char)mLetter;
          }
          else{
            char decrypChar = (char)((Math.abs(mLetter - kLetter +26) % 26) + 65);
            decrypString += decrypChar;
          }
        }
        return decrypString;
    }
}
