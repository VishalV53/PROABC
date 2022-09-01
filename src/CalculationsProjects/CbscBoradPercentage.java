package CalculationsProjects;

import java.util.Scanner;

public class CbscBoradPercentage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your physics mark : " );
		int physics=scan.nextInt();
		
		System.out.println("Enter your English mark : ");
		int english=scan.nextInt();
		
		System.out.println("Enter your maths mark : ");
		int  maths=scan.nextInt();
		
		System.out.println("Enter your chemistry mark : " );
		int chemistry=scan.nextInt();
		
		System.out.println("Enter your Hindi mark : ");
		int hindi=scan.nextInt();
		
		System.out.println("Enter your Computer mark : ");
		int computer=scan.nextInt();
		
		float percentage=((physics+english+maths+chemistry+hindi+computer)/600.0f)*100;
		System.out.println("Final percentage : "+percentage);
		
	}

}
