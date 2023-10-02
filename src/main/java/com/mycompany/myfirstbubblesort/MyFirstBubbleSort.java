/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myfirstbubblesort;

import java.util.Scanner;

/**
 *
 * @author wellington-mariano
 */
public class MyFirstBubbleSort {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int namesNumber=0;
        int index = 0;
        
        System.out.println("How many students are you ordering:");
        namesNumber = mySc.nextInt();
        
        String arr[] = new String[namesNumber]; //0 1 2 3 4
        
        do{
            System.out.println("Type name:");
            arr[index] = mySc.next(); // 1 2 3 4 5
            index++;
        }while(index < namesNumber); //index goes up to 4
            
        System.out.println("\n");
       /* 
        for (String arrEl : arr) {
            System.out.println(arrEl);
        }*/
        
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
}



