package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                result = true;
                break;
            }
        }
        return result;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        for(int i = 0; i < array.length; i++){
          newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean result = false;
        for(int i = 0; i < array.length/2; i++){
            if(array[i] == array[array.length - (i + 1)]){
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean result = false;
        String aToS = "";
        aToS = aToS.join("", array).replaceAll("\\s+","");
        int letChk = 0;
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
              letChk = aToS.toLowerCase().indexOf(alphabet);
              if(letChk == -1){
                  result = false;
                  break;
              }
              else{
                  result = true;
              }
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
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
        int index = 0;
        String[] newArray = new String[array.length - 1];

        //Find Index of Value to Remove
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == valueToRemove){
                index = i;
                System.out.println(index);
                break;
            }
        }
        //Remove Value
        boolean removeSwitch = false;
        for(int i = 0; i <= array.length - 2; i++){
            if(i == index || removeSwitch == true){
                newArray[i] = array[i + 1];
                removeSwitch = true;
            }
            else{
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
//        int counter = 0;
//        int elementOrder = 0;
//        String[] sortArray = new String[array.length];
//        for(int i = 0; i < array.length - 1; i++){
//            sortArray[i] = array[i];
//        }
//        Arrays.sort(sortArray);
//
//
//        for (int i = 0; i < array.length - 1; i++) {
//                if (sortArray[i] != sortArray[i + 1]) {
//                    counter++;
//                }
//            }
//
//        String[] newArray = new String[counter + 1];
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] != array[i + 1]) {
//                newArray[elementOrder] = array[i];
//                elementOrder++;
//            }
//        }
//
//        if(array[array.length - 1] == array[array.length - 2])
//        System.out.print(counter);
//        System.out.print(Arrays.toString(newArray));

        List<String> aToAl = new ArrayList<String>();
        Collections.addAll(aToAl, array);
        List<String> newAToAl = new ArrayList<String>();
        int i = 0;
        for (; i < array.length - 1; i++) {
            if (aToAl.get(i) != aToAl.get(i + 1)) {
                newAToAl.add(aToAl.get(i));
            }
        }
        newAToAl.add(aToAl.get(i));

        String[] newArray = newAToAl.toArray(new String[0]);


        System.out.print(Arrays.toString(newArray));
            return newArray;
        }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayLst = new ArrayList<>();
        String result = "";

        for (int i = 0; i < array.length-1; i++)
            if ((array[i] == array[i+1]))  {
                result += array[i];
            } else {
                result += array[i];
                arrayLst.add(result);
                result = "";
            }
        result = result+array[array.length-1];
        arrayLst.add(result);
        return arrayLst.toArray(new String[arrayLst.size()]);
    }

    public static void main(String[] args) {
        String getFirstElement;
    }





}
