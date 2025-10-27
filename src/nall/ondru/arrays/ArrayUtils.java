package nall.ondru.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayUtils {
    // Array - Store multiple values in  single variable
    // Array values are mutable/reassignable but size is immutable.

    //Primitive datatype default size
    // int[] = 0           char[] = /u0000
    // float[] = 0.0f      string[] = ""
    // double[] = 0.0      boolean[] = false

    // Array Initialization - Type 1

    int[] vowelsASCII = {65, 69, 73, 79, 85};
    int[] tempASCII = new int[vowelsASCII.length];
    // temp[] size = vowels.length

    // Array Declaration - Type 2

    String[] passwords = new String[10];
    // passwords = new String[array size];
    // each element of the array is initialised to 0
    // new keyword allocate the space in heap memory during compile time

    // Array Declaration - Type 3
    int[] serialNumbers = new int[]{26565, 3223, 3244, 12121};

    //Multi-Dimensional Array

    int[][] OGMatrix = {{2, 3}, {4, 5}};
    //Assigning OGMatrix Value into DummyMatrix
    int[][] DummyMatrix = OGMatrix;

    //Method use for Array traverse
    void traverse(int[] arrayAsArg) {
        System.out.print("[");
        for (int indexValue : arrayAsArg) {   //indexValue is a local  variable we can reuse as a variable (outside traverse()/for-loop)
            System.out.print(" " + indexValue + " ");
        }
        System.out.print("]");
    }

    //Traditional or Standard Strategy
    void copyArrayTraditional() {
        for (int indexValue = 0; indexValue < vowelsASCII.length; indexValue++) {
            tempASCII[indexValue] = vowelsASCII[indexValue];
        }
        System.out.println("\nTraversing TempArray (Traditional):");
        traverse(tempASCII);
    }

    //Modern Strategy
    void copyArrayModern() {
        System.arraycopy(vowelsASCII, 0, tempASCII, 0, vowelsASCII.length);
        System.out.println("\nTraversing TempArray (Modern):");
        traverse(tempASCII);
    }

    //Compare two Array SourceArray,DestinationArray
    String compareArray() {
        if (Arrays.compare(vowelsASCII, tempASCII) > 0) {
            return "vowelsArray is greater than destination";
        } else if (Arrays.compare(vowelsASCII, tempASCII) < 0) {
            return "vowelsArray is less than destination";
        } else {
            return "both arrays are equal";
        }
    }

    public static void main(String[] args) {
        ArrayUtils array = new ArrayUtils();
        array.copyArrayTraditional();
        array.copyArrayModern();

        System.out.println("\nBefore Sort:");
        array.traverse(array.serialNumbers);
        System.out.println("\nAfter Sort:");
        Arrays.sort(array.serialNumbers);
        //Primitive Array - Dual pivot quick sort
        //Object Array - Adaptive merge sort [Tim sort -Merge sort & Insertion sort]
        array.traverse(array.serialNumbers);

        System.out.println("\nBefore fill:");
        System.out.print("[");
        for (String password : array.passwords) {
            System.out.print(password + "\t");
        }
        System.out.println("]");

        Arrays.fill(array.passwords, "$$$$$$$");
        System.out.println("After fill:");
        System.out.print("[");
        for (String password : array.passwords) {
            System.out.print(password + "\t");
        }
        System.out.println("]");

        System.out.println(array.compareArray());
        System.out.println("Search the Element in the Sorted Array :");
        // Before Element search Array must be sorted form
        int index = Arrays.binarySearch(array.serialNumbers, 12121);
        if (index > 0) {
            System.out.println("Search Element is spotted on " + index);
            //method return index position
        } else {
            System.out.println("Element not found in the given array");
            //if method return -1
        }

        System.out.println("VowelsASCII, tempASCII are Equal :" + Arrays.equals(array.vowelsASCII, array.tempASCII));
        //It checks the equality of Single dimensional array

        System.out.println("OGMatrix, DummyMatrix are Equal :" + Arrays.deepEquals(array.OGMatrix, array.DummyMatrix));
        //It works on all arrays irrespective of the dimension

        System.out.println("Array length: " + array.serialNumbers.length);
        //length is a built-in java property

        //List<int[]> serialKey = Arrays.asList(array.serialNumbers);
        Iterator<Integer> it = Arrays.stream(array.serialNumbers).iterator();
        System.out.print("[ ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.print("]");
    }
}
