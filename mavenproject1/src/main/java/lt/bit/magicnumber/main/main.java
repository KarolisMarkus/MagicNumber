/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.bit.magicnumber.main;

import java.util.Scanner;

/**
 *
 * @author Karolis
 */
public class main {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in); 
        String smn = sc.nextLine(); 
        Integer mn;
        try {
           mn = Integer.parseInt(smn);

        } catch (Exception e) {
        }
    }

}
