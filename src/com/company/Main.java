package com.company;

public class Main {

    boolean isSorted;
    public static void main(String[] args) {

        boolean isSorted = false;

        int dummyInt;
        int[] intArray = new int[]{5,4,8,6,7,10,13,17,2,3,5};

        while (!isSorted) {
            isSorted = true;

            for(int x = 0; x < intArray.length - 1; x++) {

                if (intArray[x] < intArray[x+1]) {

                    isSorted = false;

                    dummyInt = intArray[x];
                    intArray[x] = intArray[x+1];
                    intArray[x+1] = dummyInt;

                }
            }
        }

        for (int y : intArray) {
            System.out.print(y + " ");
        }
    }
}
