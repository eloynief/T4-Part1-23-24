package ej7;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int[] ano=new int[12];
		
		//variable para el mes de cada año. esta va a aumentar hasta que llega al ultimo tamaño del array del año
		int mes=0;
		
		//variable para introducir valores
		int num=0;
		
		


		System.out.println("DIME LA TEMPERATURA MEDIA DE CADA MES");
		
		for(int i=0;i<ano.length;i++) {
			
			System.out.println("TEMPERATURA PARA MES "+(i+1));
			num=sc.nextInt();
			
			
			
		}
		
		//por cada mes del año
		for(int temperatura:ano) {
			//mientras que el mes sea menor que el tamaño del array
			if(mes<ano.length) {
				
				System.out.println("_");
				//podemos introducir el valor del mes
				System.out.println("[TEMPERATURA: "+temperatura+"|MES: "+(mes+1)+"]");
				
			}
			mes++;
		}
		
	}
}
