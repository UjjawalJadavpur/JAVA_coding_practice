
public class kadane {

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, -6, 8, 5, 3, -2, 7};

        int sum = arr[0], maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);

    }

}
