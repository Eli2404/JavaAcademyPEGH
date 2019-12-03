package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class StarExercise {
	public static void main (String[] args){
int n;

	System.out.println("Que cantidad de filas quiere impimir");
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();

for(int i=0;i<n;i++) {
	for(int j=0;j<i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
System.out.println(n);
}


}