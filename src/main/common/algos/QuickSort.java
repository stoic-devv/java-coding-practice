package common.algos;

public class QuickSort {

    public static void solution(int[] someArray) {
        someArray = quickSort(someArray,0,someArray.length);
        for (int num: someArray) {
            System.out.print(num + " " );
        }
        System.out.println("");
    }

    private static int[] quickSort(int[] someArray, int start , int end) {
        return new int[0];
    }
}
