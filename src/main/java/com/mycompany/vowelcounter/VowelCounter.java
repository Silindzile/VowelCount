/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcounter;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class VowelCounter {

    public static void main(String[] args) {
        //Importing our scanner
        Scanner sc = new Scanner(System.in);
        
        //Declarations
        String sentence;
        int vowelCount;
        
        System.out.println("Enter a sentence: ");
        sentence = sc.next();
        
        vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: "+ vowelCount);
        
      
    }
    
    public static int countVowels(String sentence){
       int count=0;
       sentence = sentence.toLowerCase();
       for (int i=0; i<sentence.length();i++){
           char ch = sentence.charAt(i);
           if( ch == 'a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
               count++;
           }
       }
       return count;
    }
}
