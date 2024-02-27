package leetcode;

import java.util.Scanner;

public class Addbinary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		StringBuilder sBuilder=new StringBuilder();
		String str1="11",str2="1";
		int i=str1.length()-1,j=str2.length()-1;
		int sum=0;
		while(i>=0 || j>=0 || sum==1) {
			if(i>=0)
				sum+=str1.charAt(i--)-'0';
			if(j>=0)
				sum+=str1.charAt(j--)-'0';
			sBuilder.append(sum%2);
			sum/=2;
		}

		System.out.println(sBuilder.reverse().toString());


	}

}





//static int integervalue(String a){
//	int sum=0,power=0;
//	for(int i=a.length()-1;i>=0;i--){
//		int c=a.charAt(i)-'0';
//
//		if(c==1) {
//			sum+=Math.pow(2, power);
//		}
//		power++;
//	}
//
//	return sum;
//}
//static String intintobinary(int result) {
//	StringBuilder sb=new StringBuilder();
//	while(result>0) {
//		sb.insert(0,result%2);
//		result=result/2;
//	}
//	return sb.toString();
//}