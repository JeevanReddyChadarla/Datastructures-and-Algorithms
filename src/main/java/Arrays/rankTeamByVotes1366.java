package Arrays;

import java.util.Arrays;

public class rankTeamByVotes1366 {
//	https://leetcode.com/problems/rank-teams-by-votes/
	
	public static String rankTeamsByVotes(String votes[]) {
		char ch[]=votes[0].toCharArray();
		int val[]=new int[ch.length];
		int start=0, end=votes.length-1, i=0;
		int sortStart=0, sortEnd=ch.length-1, temp=0;
		char c='a';
		while(start<=end && i<ch.length) {
			val[i]+=votes[start].indexOf(ch[i]);
			start++;
			if(start==end+1) {
				start=0;
				i++;
			}
		}
		while(sortStart<sortEnd) {
			if(val[sortStart]>val[sortStart+1]) {
				c=ch[sortStart+1];
				temp=val[sortStart+1];
				ch[sortStart+1]=ch[sortStart];
				val[sortStart+1]=val[sortStart];
				ch[sortStart]=c;
				val[sortStart]=temp;
			}
			sortStart++;
		}
		String str=new String(ch);
		System.out.println(Arrays.toString(val));
		System.out.println(Arrays.toString(ch));
		System.out.println(str);
		return str;
	}
	
	public static void main(String[] args) {
		String arr[]= {"ABC","ACB","ABC","ACB","ACB"};//{"BCA","CAB","CBA","ABC","ACB","BAC"};
		rankTeamsByVotes(arr);

	}

}
