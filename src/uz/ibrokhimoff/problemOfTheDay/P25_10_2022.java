package uz.ibrokhimoff.problemOfTheDay;

import java.util.ArrayList;

public class P25_10_2022 {
    public static void main(String[] args) {
        max_of_subarrays(new int[]{},0,0);
    }
        //Function to find maximum of each subarray of size k.
        static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
        {
            ArrayList<Integer> max_of_subarray=new ArrayList<>();
            for (int i=0;i<n;i++){
                int max=0;
                for (int j=i;j<k;j++){
                    if (arr[j]>max)
                        max=arr[j];
                }
                max_of_subarray.add(max);
            }
            // Your code here
            return max_of_subarray;
        }

}
