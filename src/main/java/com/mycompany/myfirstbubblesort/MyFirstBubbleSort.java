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
        
        System.out.println("How many students are you ordering:");
        int namesNumber = mySc.nextInt(), index = 1;
        String arr[] = new String[namesNumber]; //5
        
        do{
            System.out.println("Type name:");
            arr[index-1] = mySc.next();
            index++;
        }while(index <= namesNumber);
            
        System.out.println("\n");
        //do a for to print unordered loop
        bubbleSort(arr);
    }
    
    public static void bubbleSort (String[] arr){
        int n = arr.length; //5
        String temp;
        int firstLetterFirstName, firstLetterSecondName;
        
        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++){ //Bubble sort is sending the biggest number to the end
                firstLetterFirstName = (int) arr[j].charAt(0);
                firstLetterSecondName = (int) arr[j+1].charAt(0);
                    if(firstLetterFirstName > firstLetterSecondName){ //IF 60 > 30 - Swap
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
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



