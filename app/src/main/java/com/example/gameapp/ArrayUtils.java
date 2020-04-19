package com.example.gameapp;


public class ArrayUtils {
    /**
     * Removes the specified index to the specified array of integer and returns the result
     * @param array the array on which to remove the specified index
     * @param index the index to remove from the specified array
     * @return the result of the deletion
     */
    public static int[] removeIndex(int[] array, int index){
        int[] result = new int[array.length - 1];
        for(int i=0; i<array.length; i++){
            if(i < index)
                result[i] = array[i];
            else if(i > index)
                result[i] = array[i];
        }
        return result;
    }
}
