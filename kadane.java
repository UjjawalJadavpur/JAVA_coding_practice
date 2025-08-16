
public class kadane {

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, -6, -8, 5, 3, -2, 7};

        int sum = arr[0], maxSum = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        //     sum = Math.max(arr[i], sum + arr[i]);
        //     maxSum = Math.max(maxSum, sum);
        // }
        // System.out.println(maxSum);
        
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) 
        {
            sum = sum + arr[i];

            if (arr[i] > sum + arr[i]) {
                tempStart = i;
                sum = arr[i];
            }

            if (sum > maxSum) {
                start = tempStart;
                end = i;
                maxSum = sum;
            }
        }

        System.out.println(start + " " + end + " " + maxSum);

    }

}
