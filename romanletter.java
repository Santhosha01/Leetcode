package leetcode;

import java.util.Scanner;

public class romanletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(romanToInt(str));
	}
	public static int romanToInt(String s) {
		int sum = 0;
		for (int i=0; i<s.length(); i++) {
			int temp1 = roman(s.charAt(i));
			if (i+1 <s.length()) {
				int temp2 = roman(s.charAt(i+1));
				if (temp1 >= temp2) {
					sum = sum + temp1;
				}
				else {
					sum = sum - temp1;
				} 
			}
			else {
				sum = sum + temp1;
			} 
		}
		return sum;
	}
	static int roman(char s){
		switch(s){
		case 'I':
		{
			return 1;
		}     
		case 'V':
		{
			return 5;
		}
		case 'X':
		{
			return 10;
		}case 'L':
		{
			return 50;
		}
		case 'C':
		{
			return 100;
		}    
		case 'D':
		{
			return 500;
		}
		case 'M':
		{
			return 1000;           
		}
		default:{
			return -1;
		}
		}
	}
}























//public static int romanToInt(String s) {
//		int sum=0;
//		for(int j=0;j<s.length();j++){
//			if(j<s.length()&&roman(s.substring(j,j+2))==0){	
//				sum=sum+roman(s.substring(j,j+1));
//			}else{
//
//				sum=sum+roman(s.substring(j,j+2));
//			}
//		}
//		return sum;
//	}
//	static int roman(String s){
//		switch(s){
//		case "IV":
//		{
//			return 4; 
//		}
//		case "IX":
//		{
//			return 9; 
//		}
//		case "XL":
//		{
//			return 40; 
//		}
//		case "XC":
//		{
//			return 90; 
//		}
//		case "CD":
//		{
//			return 400; 
//		}
//		case "CM":
//		{
//			return 900; 
//		}
//		case "I":
//		{
//
//			return 1;
//		}     
//		case "V":
//		{
//			return 5;
//		}
//		case "X":
//		{
//			return 10;
//		}case "L":
//		{
//			return 50;
//		}
//		case "C":
//		{
//			return 100;
//		}    
//		case "D":
//		{
//			return 500;
//		}
//		case "M":
//		{
//			return 1000;           
//		}
//		default:{
//			System.out.println("default");
//			return 0;
//		}
//		}
//	}