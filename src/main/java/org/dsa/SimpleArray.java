package org.dsa;

import java.util.Arrays;

public class SimpleArray {

    public static int lowestValue(){
        int[] numArray={4,9,3,7,1,20};
        int lowestNum=numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (lowestNum>numArray[i]){
                lowestNum=numArray[i];
            }

        }
        return lowestNum;
    }

    public static int[] bubbleSort(){
        int[] numArray={4,9,3,7,1,20,1,2,5};

        for(int i = 0; i < numArray.length-1; i++) {
            boolean swapped = false;
            for(int j = 0; j < numArray.length-i-1; j++) {
                if(numArray[j]>numArray[j+1]){
                    int prevValue=numArray[j];
                    int currValue=numArray[j+1];
                    numArray[j+1]=prevValue;
                    numArray[j]=currValue;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        return numArray;
    }

    public static int[] selectionSort(){
        int[] numArray={4,9,3,7,1,20,1,2,5};
        int arrayLength=numArray.length;
        for (int i = 0; i <arrayLength ; i++) {
            int minIndex=i;
            for (int j = i+1; j < arrayLength; j++) {
                if(numArray[j]<numArray[minIndex]){
                    minIndex=j;
                }
            }
            int tempValue=numArray[i];
            numArray[i]=numArray[minIndex];
            numArray[minIndex]=tempValue;
        }
        return numArray;
    }


    public static void main(String[] args) {
        System.out.println(lowestValue());
    }
}
