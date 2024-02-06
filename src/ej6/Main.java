package ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] nums=new int[8];
		
		int num=0;
		

		for(int i=0;i<nums.length;i++) {
		
			do {
				try {
					
						System.out.println("Introduce 8 numeros: ");
						
						num=sc.nextInt();
						
						nums[i]=num;
						
						
					
				}
				catch(InputMismatchException e) {
					
				}
				
			}while(num<0);
			
		}
		
		//por cada valor dentro de nums
		for(int numero:nums) {
			
			//comprobamos si el valor es par o impar
			if(numero%2==0) {
				System.out.println(numero+": PAR");
			}
			else {
				System.out.println(numero+": IMPAR");
			}
			
		}
		
		
		
	}

}
