package com.zipcodewilmington;

//import com.sun.tools.javac.util.ArrayUtils;

//import com.sun.tools.javac.util.ArrayUtils;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

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
        int arrayCount=0;
        int charCount=0;
        int found=0;
        int charValue='a';
        String temp;
        while(charValue<='z') {
            while (arrayCount < array.length) {
                temp = array[arrayCount].toLowerCase();
                while (charCount < temp.length()) {
                    if (temp.charAt(charCount) == charValue) {
                        found = 1;
                    }
                    charCount++;
                }
                charCount = 0;
                arrayCount++;
            }

            if (found == 0) {
                return false;
            }
            arrayCount = 0;
            found = 0;
            charValue++;
        }
return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        Integer counter=0;
        for (int i=0;i< array.length;i++){
            if (array[i]==value){
                counter++;
            }

        }
        return counter;

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

       String[] copy=new String[array.length-1];
        int count=0;
        for(int i=0;i< array.length;i++){
            if(array[i]!=valueToRemove){
                copy[count++]=array[i];
            continue;}

        }
        //array= ArrayUtils.remove(array,valueToRemove);

        return copy;
    }

    /**
     *
     *
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> l= new ArrayList<String>();
     for (int i = 0; i < array.length-1; i++) {
         if (array[i] != array[i + 1]) {
             l.add(array[i]);
         }
     }
    l.add(array[array.length-1]);
     String[] result = new String[l.size()];
     result = l.toArray(result);
     return result;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
