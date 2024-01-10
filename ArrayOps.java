public class ArrayOps {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 2, 3, 4, 6 };
        // System.out.println(findMissingInt(arr));

        // int[] arr1 = { 6, 9, 4, 7, 3, 4 };
        // System.out.println(secondMaxValue(arr1));
        // int[] arr2 = { 1, 2, 3, 4, 5 };
        // System.out.println(secondMaxValue(arr2));
        // int[] arr3 = { 2, 8, 3, 7, 8 };
        // System.out.println(secondMaxValue(arr3));
        // int[] arr4 = { 1, -2, 3, -4, 5 };
        // System.out.println(secondMaxValue(arr4));
        // int[] arr5 = { -202, 48, 13, 7, 8 };
        // System.out.println(secondMaxValue(arr5));

        // System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}));
        // System.out.println(containsTheSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3}));
        // System.out.println(containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
        // System.out.println(containsTheSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5}));

        // System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
        // System.out.println(isSorted(new int[] {1, 2, 3}));
        // System.out.println(isSorted(new int[] {1, -2, 3}));
        // System.out.println(isSorted(new int[] {1, 1, 500}));
        // System.out.println(isSorted(new int[] {1, 3, 2}));
    }
    
    public static int sumUpUpToNumber (int num) {
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    public static int findMissingInt (int [] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sumUpUpToNumber(array.length) - sum;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = max;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                secondMax = max;
                max = array[i];
            }
            else if (array[i] >= secondMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean existsInOtherArray;

        for (int i = 0; i < array1.length; i++) {
            existsInOtherArray = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    existsInOtherArray = true;
                }
            }
            if (!existsInOtherArray) {
                return false;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            existsInOtherArray = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    existsInOtherArray = true;
                }
            }
            if (!existsInOtherArray) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean didIncrease = false;
        boolean didDecrease = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                didIncrease = true;
            }
            else if (array[i] < array[i - 1]) {
                didDecrease = true;
            }
        }

        if (didIncrease && didDecrease) {
            return false;
        }
        return true;
    }

}
