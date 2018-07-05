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
public class Fibbonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);

        for (int i = 0; i < 8; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;

        }
    }

}
