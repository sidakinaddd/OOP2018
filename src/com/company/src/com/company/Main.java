package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Scanner scan=new Scanner(System.in);
        double a=scan.nextInt();
        double b=scan.nextInt();
        System.out.print(Math.sqrt((a*a)+(b*b)));

    }
}
