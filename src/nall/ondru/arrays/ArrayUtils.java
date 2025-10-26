package nall.ondru.arrays;

public class ArrayUtils {
    // Array - Store multiple values in  single variable

    // Array Initialization - Type 1

    int [] vowelsASCII = {65, 69, 73, 79, 85};
    int [] tempASCII = new int[vowelsASCII.length];
    // temp[] size = vowels.length

    // Array Declaration - Type 2

    String[] passwords = new String[10];
    // each element of the array is initialised to 0


    byte[] digits = new byte[256];
    // digit[] = new byte[array size];
    // new keyword allocate the space in heap memory during compile time

    // Array Declaration - Type 3
    int[] serialNumbers = new int[]{26565, 3223, 3244, 12121};


    void traverse(int[] arrayAsArg) {
        System.out.print("[");
        for (int indexValue : arrayAsArg) {   //indexValue is a local  variable we can reuse as a variable (outside traverse()/for-loop)
            System.out.print(" " + indexValue + " ");
        }
        System.out.print("]");
    }

        void copyArrayTraditional()
        {
            for (int indexValue= 0; indexValue<vowelsASCII.length;indexValue++) {
                tempASCII[indexValue] = vowelsASCII[indexValue];
            }
            System.out.println("\nTraversing TempArray (Traditional):");
            traverse(tempASCII);
        }

        void copyArrayModern()
        {
            System.arraycopy(vowelsASCII, 0, tempASCII, 0, vowelsASCII.length);
            System.out.println("\nTraversing TempArray (Modern):");
            traverse(tempASCII);
        }


    public static void main(String[] args) {
        ArrayUtils array = new ArrayUtils();
        array.traverse(array.serialNumbers);
        array.copyArrayTraditional();
        array.copyArrayModern();
    }
}
