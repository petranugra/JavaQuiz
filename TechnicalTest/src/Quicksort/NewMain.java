/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quicksort;

import static Quicksort.QuickSort.quickSort;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int tabInt[]={24,17,18,15,22,26, 13, 21, 16, 28};
        int i,n=10;
        
            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+ " ");
           }
            System.out.print("\n");
            quickSort(tabInt,0,n-1);
        
        for(i=0;i<n;i++){
            System.out.print(tabInt[i]+" ");
        }

    }

}
