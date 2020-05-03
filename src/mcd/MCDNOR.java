/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.util.Scanner;

/**
 *
 * @author Abisai
 */



public class MCDNOR {
    static int MCD (int n, int m){
        while (n != m){
            if (n > m){
                n = n - m;
            }else{
                m = m - n;
            }
        }
        return n;
    }
    
    static void MATRANDOM (int arre[]){
            for (int x=0;x<arre.length;x++){
                arre[x] = (int) (Math.random()*1000)+1;
                //System.out.print("["+x+"] = "+ arre[x]);
            }
        }
    
    public static void main(String[] args) {
        /*int n, m;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        n=num.nextInt();
        
        System.out.println("Ingresa m: ");
        m=num.nextInt();
        
        MCD(n,m);*/
        
        //int n, m;
        int arre1[] = new int [1000];
        int arre2[] = new int [1000];
        //int res[] = new int [1000];
        //Scanner num = new Scanner(System.in);
        //System.out.println("Ingresa n: ");
        //n=num.nextInt();
        
        //System.out.println("Ingresa m: ");
        //m=num.nextInt();
        
        //GCD(n,m);
        
        MATRANDOM(arre1);
        MATRANDOM(arre2);
        
        for(int x=0;x<arre1.length;x++){
            for(int y=0;y<arre1.length;y++){
                MCD(arre1[x],arre2[y]);
            }
        }
        
    }
}
