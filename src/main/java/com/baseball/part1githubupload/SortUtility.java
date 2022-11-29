package com.baseball.part1githubupload;
/**
 * **********************************************************************************
 * Title: SortUtility
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: SortUtility.java
 * Description: Uses merge sort to sort a list of players
 * **********************************************************************************
 */
import java.io.Serializable;
import java.util.Comparator;

public class SortUtility {
    //The method for sorting the numbers
    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        mergeSort(list, (e1, e2) -> ((Comparable<E>) e1).compareTo(e2));
    }

    //The method for sorting the numbers
    public static <E extends Comparator<E>> void mergeSort(E[] list) {
        mergeSort(list, (e1, e2) -> ((Comparable<E>) e1).compareTo(e2));
    }

    public static<E> void sort(E []list, Comparator<? super E>comparator){

    }

    //------------------------------------------------------------------------------
    /* Generic mergeSort method */
    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
        if (list.length > 1) {
            // Merge sort the first half
            E[] firstHalf = (E[]) new Object[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf, comparator);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            E[] secondHalf = (E[]) new Object[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf, comparator);

            // Merge firstHalf with secondHalf
            E[] temp = merge1(firstHalf, secondHalf, comparator);
            System.arraycopy(temp, 0, list, 0, temp.length);
        }
    }

    private static <E> E[]
    merge1(E[] list1, E[] list2, Comparator<? super E> comparator) {
        E[] temp = (E[]) new Object[list1.length + list2.length];

        int current1 = 0; // Index in list1
        int current2 = 0; // Index in list2
        int current3 = 0; // Index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (comparator.compare(list1[current1], list2[current2]) < 0) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }
        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }
        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
        return temp;
    } // mergeSort (Method)

    //------------------------------------------------------------------------------
}
// Class for comparing Hitters batting average (AVG)
class HitterAverageComparator implements Comparator<Player>, Serializable {
    public int compare(Player o1, Player o2) {
        double avg1 = Double.parseDouble(o1.getAverage());
        double avg2 = Double.parseDouble(o2.getAverage());
        if (avg1 < avg2)
            return 1;
        else if (avg1 == avg2)
            return 0;
        else
            return -1;
    }
}
// Class for comparing pitchers ERA (earned run average)
class ERAComparator implements Comparator<Player>, Serializable {
    public int compare(Player o1, Player o2) {
        double avg1 = Double.parseDouble(o1.getERA());
        double avg2 = Double.parseDouble(o2.getERA());
        if (avg1 < avg2)
            return -1;
        else if (avg1 == avg2)
            return 0;
        else
            return 1;
    }
}