/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myfirstbubblesort;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wellington-mariano
 */

public class MyFirstBubbleSort {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        
        int listSize=0;
        int index=0;
       
        String list = reg("How many names on list?"); //Regex validation
        
        listSize = Integer.parseInt(list); //parse to integer if regex valid
        
        String arr[] = new String[listSize]; 
        
        do{
            System.out.println("Type name:");
            arr[index] = mySc.next(); // 1 2 3 4 5
            index++;
        }while(index < listSize); //index goes up to 4
            
        System.out.println("\n");
      
        bubbleSort(arr);
    }
    
    public static void bubbleSort (String[] arr){
        int n = arr.length; //5
        String temp;
        
        int firstLetterFirstName, firstLetterSecondName;
        
        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j < n-1-i; j++){ //Bubble sort is sending the biggest number to the end
                firstLetterFirstName = (int) arr[j].charAt(0);
                firstLetterSecondName = (int) arr[j+1].charAt(0);
                              
                    if(firstLetterFirstName > firstLetterSecondName){ //IF 60 > 30 - Swap
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                        swapped = true;
                    }
                }
            
           if(!swapped)
            {
               break;
            }
        }
        
        for(String arrEl : arr){
                System.out.printf("%s ",arrEl);
        }
    }
    
    public static String reg(String prompt){
        
        Scanner mySc = new Scanner(System.in);
        
        String regex = "^(?:[\\/\\s]?[0-9]){1,12}$"; //Regex non accepting string and only a certain range of numbers
        
        String input;
        
        Pattern pattern = Pattern.compile(regex);
       
        while (true)
        {
            System.out.println(prompt);
            
            input = mySc.next();
            
            Matcher matcher = pattern.matcher(input);
            
            if (matcher.matches()){
                return input;
            }
            else
            {
                System.out.println("Go to bed. Pay attention to input - Come on!!!");//Message if wrong input
            }
        }
    }
}


