package com.linkedin.model;

import java.util.Scanner;

public class Factoriel {

    public static void main( String [] args){

        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int n = 999999999;

        int fac = 1;

        for(int i=1; i<= n;i++){
            fac = fac*i;

        }
        System.out.println(fac);
    }
}
