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
public class MaxMin {

    static void max(int[] arr) {
        int x = arr.length;
        int currentmax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (currentmax < arr[i]) {
                currentmax = arr[i];
            }
        }
        System.out.println(currentmax);
    }

    static void min(int[] arr) {
        int x = arr.length;
        int currentmin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (currentmin > arr[i]) {
                currentmin = arr[i];
            }
        }
        System.out.println(currentmin);
    }

    public static void main(String[] args) {
        int[] angka = {0, 2, 4, 120, 12, 32, 201, 121, 200, 17};
        max(angka);
        min(angka);
    }
}
