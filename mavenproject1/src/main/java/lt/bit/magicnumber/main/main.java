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
 * unfinished program to get magic number from input it checks if multiplied
 * from 1 to 6 number still have magic number properties
 *
 * @author Karolis
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        //smn - magic number string
        String smn = sc.nextLine();
        //mn - magic number
        Integer mn = null;
        try {
            mn = Integer.parseInt(smn);

        } catch (Exception e) {
            System.out.println("blogai ivestas skaicius");
        }
        if (mn != null) {
            List<Integer> mnl = toIntegerArray(mn);
            if (mnl != null) {
                //isMagical - checks if number is magical
                Boolean isMagical = false;
                //magic number digit count is the same as times number have to be multiplied
                //this loop checks all multiplications
                for (int i = 1; i <= mnl.size(); i++) {
                    List<Integer> multipliedList = toIntegerArray(mn * i);
                    //checking if multiplied list have first original number digit
                    List<Integer> indexes = getIndexes(multipliedList, mnl.get(0));
                    if (!indexes.isEmpty()) {
                        //array list of indexes, for all repeated 
                        for (Integer index : indexes) {
                            // two cycles to get from index to last and from first to index elements of array
                            List<Integer> tempList = new ArrayList<>();
                            for (int j = index; j < multipliedList.size(); j++) {
                                tempList.add(multipliedList.get(j));
                            }
                            for (int j = 0; j < index; j++) {
                                tempList.add(multipliedList.get(j));
                            }
                            if (mnl.equals(tempList)) {
                                isMagical = true;
                                break;
                            }
                        }

                    } else {
                        break;
                    }
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

    public static List<Integer> getIndexes(List<Integer> multiList, Integer number) {
        List<Integer> l = new ArrayList();
        for (int i = 0; i < multiList.size(); i++) {
            if (Objects.equals(multiList.get(i), number)) {
                l.add(i);
            }
        }
        return l;
    }

}
