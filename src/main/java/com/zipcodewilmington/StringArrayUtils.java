package com.zipcodewilmington;

//import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array)
    {
        String lastElement=array[array.length-1];
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array)
    {
        String result=array[array.length-2];
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
       boolean test=false;
       for (String element:array){
           if (element == value)
           {
               test = true;
               break;
           }
       }
    return test;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> array1 = Arrays.asList(array);
        Collections.reverse(array1);
        String[] reversed = array1.toArray(array);
        return reversed;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i=0; i<array.length/2; i++){
            if(!array[i].equals(array[array.length-1-i])){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String array1=array.toString();
        System.out.println(array1);
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i=0; i< array1.length();i++){
            if ('A'<= array1.charAt(i) && array1.charAt(i) <= 'Z')
            {
                index = array1.charAt(i) - 'A';
            }
            else if ('a'<=array1.charAt(i) && array1.charAt(i)<='z'){
                index = array1.charAt(i) - 'a';
            }
            else continue;
            mark[index] = true;
        }
    for (int i = 0; i<= 25; i++)
        if (mark[i] == false)
        return false;

        return true;


    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        //sorting array
        int size=array.length;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j< array.length;j++){
                if (array[i].compareTo(array[j])>0){
                    String temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        //String array1=Arrays.toString(array);
        //String[] numberOccurrences= new String[]{array1};

        int index = Arrays.binarySearch(array, value);
        if (index<0){
            System.out.println("Value not found in array");
        } else {System.out.println("Value found in array");}
        return index;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
