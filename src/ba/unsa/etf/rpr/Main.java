package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int broj) {
        int suma = 0;
        do {
            suma += broj % 10;
            broj = broj / 10;
        } while(broj != 0);
        return suma;
    }

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0)
                    System.out.println(i);
        }
    }
}
