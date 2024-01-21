package Arrays.SlidingWindows;

import java.util.HashMap;

public class leetcode904 {
	
	public static int fruitCollection(int fruits[]) {
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		int i=0,j=0,end=fruits.length-1,count=0,ans=0,res=0;
		while(j<=end) {// 3,3,3,1,2,1,1,2,3,3,4
			map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);
			if(map.size()<=2) {
				res=Math.max(j-i+1, res);
				
			}else {
				map.put(fruits[i], map.getOrDefault(fruits[i], 0)-1);
				if(map.get(fruits[i])<=0) {
					map.remove(fruits[i]);
				}
				i++;
			}
			j++;
		}
		System.out.println(res);
		return res;
	}
	
	public static int sumOfFreq(HashMap<Integer, Integer>map) {
		int total=0;
		for(int i:map.values()) {
			total+=i;
		}
		return total;
	}

	public static void main(String[] args) {
		int arr[]= {3,3,3,1,2,1,1,2,3,3,4};
		fruitCollection(arr);
	}

}
