package vectores;

import java.util.Scanner;

public class Plantilla {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8();
		//p9();
		//p10();
		//p11();
		//p12();
		//p13();
		//p14();
		//p15();
		//p16();
		//p17();
		//p18();
		//p19();
		//p20();
		//p21();
		//p22();
		//p23();
		//p24();
		//p25();
		//p26();
		
		
	}

	public static void p1() {
		
		String fruits[] = new String[]{"Pineapple", "Apple", "Orange", "Banana"};
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		for(String s: fruits) {
			System.out.println(s);
		}
	
		}
	public static void p2() {
		
	}

	public static void p3() {}
	public static void p4() {
		int vector1[] = new int[] {1,2,3};
		int vector2[] = new int[] {4,5,6};
		
		for(int i=0; i<vector1.length;i++) {
			System.out.println("componente"+ i + ":"+ vector1[i]);
		}
		for(int i=0; i<vector2.length;i++) {
			System.out.println("componente"+ i + ":"+ vector2[i]);
		}
		int suma = 0;
		for(int i=0; i<vector2.length;i++) {
			suma = suma + vector1[i] * vector2[i];
		}
		System.out.println("El resultado del producto escalar es "+ suma);
	}
	public static void p5() {}
	public static void p6() {
		Scanner lector = new Scanner(System.in);
		int vector1[] = new int[] {1,2,3,4,5,6};
		System.out.print("Introduce el numero que quieras buscar: ");
		int num = lector.nextInt();
		for(int i=0; i<vector1.length;i++) {
			if (num == vector1[i]) {
				System.out.println("tu numero esta en la posicion " + i);
				break;}
			else if(i == vector1.length-1)
				System.out.println("No se ha encontrado tu numero");
		}
	}
	public static void p7() {
		int vector[] = {21,2,44,24,12,34,15};
		int num = vector[vector.length-1];
		int sum = 0;
		for(int i=0; i<num; i++) {
		if(vector[i]>num) { 
		sum += vector[i];
		}
		}
		System.out.println("La suma es"+ sum);
	}
	public static void p8() {
		int v1[] = {21,2,44,24,12,34,15};
		int v2[] = {21,2,44,24,12,34,15};
		if(v1.length != v2.length)
			return;
		boolean iguales = true;
		for(int i=0; i<v1.length; i++) {
			if(v1[i] != v2[i]) {
				iguales = false;
				System.out.println("No son iguales");
				break;
			}else if(i==v1.length-1) {
				System.out.println("Son iguales");
			}
		}
	}
	public static void p9() {
		}
	public static void p10() {
		Scanner lector = new Scanner(System.in);

		int matriz[][] = {{1,2,3},
				  		  {4,5,6},
				  		  {7,8,9}};
		System.out.print("Introduce la fila: ");
		int fila = lector.nextInt();
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += matriz[i][j];
			}
		}
		System.out.println("la suma es "+ sum);
	}
	public static void p11() {}
	public static void p12() {}
	public static void p13() {}
	public static void p14() {}
	public static void p15() {}
	public static void p16() {}
	public static void p17() {}
	public static void p18() {}
	public static void p19() {}
	public static void p20() {}
	public static void p21() {}
	public static void p22() {}
	public static void p23() {}
	public static void p24() {}
	public static void p25() {}
	public static void p26() {}
}
