package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();		
		kb.close();
		
		if( a == 0 && b == 0 )
			System.out.println( "Not a moose" );
		else if( a == b )
			System.out.println( "Even " + a*2 );
		else 
			System.out.println( "Odd " + Math.max( a, b )*2 );		
	}
}

