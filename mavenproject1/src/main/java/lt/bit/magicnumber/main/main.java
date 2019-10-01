/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.bit.magicnumber.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * unfinished program to get magic number from input it checks if multiplied from 1 to 6
 * number still have magic number properties
 *
 * @author Karolis
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        String smn = sc.nextLine();
        Integer mn = null;
        try {
            mn = Integer.parseInt(smn);

        } catch (Exception e) {
            System.out.println("blogai ivestas skaicius");
        }
        if (mn != null) {
            System.out.println("numeris yra " + mn);
            List<Integer> mnl = toIntegerArray(mn);
            System.out.println(mnl);
            if (mnl != null) {
                Boolean isMagical = false;
                for (int i = 1; i <= mnl.size(); i++) {
                    List<Integer> tempList = new ArrayList<>();
                    List<Integer> multipliedList = toIntegerArray(mn * i);
                    List<Integer> indexes = getIndexes(multipliedList, mnl.get(0));
                    if (!indexes.isEmpty()){
                        indexes.forEach((index) -> {
                            for(int j = index; j<multipliedList.size(); j++){
                                
                            }
                        }); 
                        //take a original number array and check if it's have the same order in multiplied number array from index i to last digit
                        //and from first digit to index
                    }else break;
                }
            }
        }
    }

    /**
     * method to convert integer to array list
     *
     * @param number - number from input
     * @return ArrayList with digits from number
     */
    public static List<Integer> toIntegerArray(Integer number) {
        if (number == 0) {
            return null;
        }

        List<Integer> numbers = new ArrayList<>();

        for (; number != 0; number /= 10) {
            numbers.add(number % 10);
        }
        Collections.reverse(numbers);
        return numbers;
    }
    
    public static List<Integer> getIndexes(List<Integer> multiList, Integer number){
        List<Integer> l = new ArrayList();
        for (int i= 0; i<multiList.size(); i++) {
            if(Objects.equals(multiList.get(i), number)){
                l.add(i);
            }            
        }
        return l;
    }

}
