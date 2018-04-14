package array;

public class ReverseArrayUtil {

    public static int[] reverseArray(int[] arr) {

        if (arr == null)
            return null;

        if (arr.length == 1)
            return arr;

        if (arr.length == 2 || arr.length == 3) {
            swap(arr, 0, arr.length - 1);
            return arr;
        }

        int firstIndex1 = 0;
        int lastIndex1 = arr.length-1;
        while (firstIndex1 < lastIndex1) {
            int temp = arr[firstIndex1];
            arr[firstIndex1] = arr[lastIndex1];
            arr[lastIndex1] = temp;
            firstIndex1++;
            lastIndex1--;
        }

        return arr;

    }

    private static void swap(int[] arr, int startPoint, int destinationPoint) {

        int temp = arr[startPoint];
        arr[startPoint] = arr[destinationPoint];
        arr[destinationPoint] = temp;

    }
}
