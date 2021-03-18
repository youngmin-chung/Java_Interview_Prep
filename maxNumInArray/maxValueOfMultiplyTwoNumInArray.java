import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] t1 = {5, 3, 2, 5, 7, 0, 1};
        int[] t2 = {-2, -1, -3, 4, 8, 0};
        int[] t3 = {-20, -10, 3, 9, -8};

        System.out.println(maximumProduct1(t1));
        System.out.println(maximumProduct1(t2));
        System.out.println(maximumProduct1(t3));

        System.out.println(maximumProduct2(t1));
        System.out.println(maximumProduct2(t2));
        System.out.println(maximumProduct2(t3));

        System.out.println(maximumProduct3(t1));
        System.out.println(maximumProduct3(t2));
        System.out.println(maximumProduct3(t3));

    }

    // Time complexity : O(n-square)
    private static int maximumProduct1(int[] arr) {

        int length = arr.length;
        int max = Integer.MIN_VALUE;

        if(length < 2){
            System.out.println("No Maximum exists, returning sentinel value");
            return max;
        }

        for (int i = 0; i < length; i++){
            for (int j = i+1; j <length; j++){
                if(arr[i] * arr[j] > max){
                    max = arr[i] * arr[j];
                }
            }
        }
        return max;
    }

    // Time complexity : O(n)
    private static int maximumProduct2(int[] arr) {
        int length = arr.length;

        if(length < 2) {
            System.out.println("No Maximum exists, returning sentinel value");
            return Integer.MIN_VALUE;
        }

        // Using quick sort
        Arrays.sort(arr);

        int maxProduct = arr[length - 2] * arr[length - 1];
        int minProduct = arr[0] * arr[1];

        if (maxProduct > minProduct){
            return maxProduct;
        } else {
            return minProduct;
        }
    }

    private static int maximumProduct3(int[] arr) {
        int length = arr.length;

        if(length < 2){
            System.out.println("No maximum exists, returning sentinel value");
            return Integer.MIN_VALUE;
        }

        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;

        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] < min2){
                min2 = arr[i];
            }
            else if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2){
                max2 = arr[i];
            }
        }

        int maxProduct = max1 * max2;
        int minProduct = min1 * min2;

        if(maxProduct > minProduct){
            return maxProduct;
        } else {
            return minProduct;
        }
    }
}
