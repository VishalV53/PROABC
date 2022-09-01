package CalculationsProjects;

import java.util.Scanner;

public class MultiplyingTheInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input : " );
		int num=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}

}
