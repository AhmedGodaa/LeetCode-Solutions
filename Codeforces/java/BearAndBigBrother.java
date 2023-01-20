package Codeforces.java;

import java.util.Scanner;
public class BearAndBigBrother{
	public static void main(String[]args){
		int counter = 0 ;
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt() , y = sc.nextInt();
		while (x<=y){
			counter +=1 ;
			x *=3;
			y *=2;
 
		}
		System.out.println(counter);
	}
 
}