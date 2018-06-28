/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalTest;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class ReverseStringWthoutTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String reverseMe = "Petra!";
        for (int i = 0; i < reverseMe.length(); i++) {
            reverseMe = reverseMe.substring(1, reverseMe.length() - i) 
                    + reverseMe.substring(0, 1) 
                    + reverseMe.substring(reverseMe.length() - i, reverseMe.length());
        }
        System.out.println(reverseMe);
    }

}
