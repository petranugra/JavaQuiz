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
public class StarSegitiga {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) { //spasi
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //bintang
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
