/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KompilasiLiveCodingJavaInterview;


/**
 *
 * @author ASUS ROG GL552JX
 */
public class DiffBuzz {

    public static void main(String[] args) {
        int i;
     
        
        for (i = 0; i <= 100; i++) {
            if(i%3==0) {
                System.out.println("diff" + " " + i); 
            }else if(i%5==0) {
                System.out.println("buzz"+" "+ i);
            }else if (i%i==0) {
                System.out.println("diff buzz" +" "+ i);
            }else {
                System.out.println(i);
            }
        }
    }

}

