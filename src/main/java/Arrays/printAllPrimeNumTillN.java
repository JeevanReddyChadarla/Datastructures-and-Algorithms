package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

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
