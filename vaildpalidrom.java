package leetcode;

public class vaildpalidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="race a car";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		StringBuilder str=new StringBuilder();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
				str.append(s.charAt(i)); 
			}
		}
		String str1=str.toString();
		StringBuilder rev=new StringBuilder();
		rev=str.reverse();
		String revstr=rev.toString();
		if(str1.equals(revstr)){
			return true;
		} 
		return false;
	}

}
