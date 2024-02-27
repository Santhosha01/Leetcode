package leetcode;

public class Addbinary {

	public static void main(String[] args) {
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





