package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Approach : Seive of eratosthenes algorithm
        // 1. initilise an array with size n+1 and fill it will true
        // 2. traverse from i=2 to root of N -- check for prime numbers
        // 3. assign false to all the multiples of i -- this makes the rest of the prime numb as true
        // 4. print the true index.
public class printAllPrimeNumTillN {
    public static ArrayList<Integer> printAllPrimes(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i=2;i*i<n+1;i++){
            if(arr[i]==true){
                for(int p=i*i;p<n+1;p+=i){
                    arr[p]=false;
                }
            }
        }
        for(int i=2;i<n+1;i++){
            if(arr[i]==true){
                list.add(i);
            }
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        printAllPrimes(30);
    }
}
