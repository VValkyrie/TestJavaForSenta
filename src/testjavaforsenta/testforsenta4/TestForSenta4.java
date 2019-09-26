/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavaforsenta.testforsenta4;

import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class TestForSenta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String message;
        String word;
        
        System.out.println("Введите предложение: ");
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();
        word = sc.nextLine();
        message = message.toLowerCase();
        word = word.toLowerCase();
        sc.close();
        
        System.out.println("Слово повторяется " + searchWord(message, word) + " раз");
    }
    
    public static int searchWord(String message, String word) {
        String[] words = message.replaceAll("[-.?!)(,:]", "").split("\\s");
        int counter = 0;
        
        for(String anyWord : words){
              if (word.equals(anyWord)) counter++;
         }
      
        return counter;
    }
}
