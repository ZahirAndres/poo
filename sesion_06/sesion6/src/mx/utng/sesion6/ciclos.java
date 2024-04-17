package mx.utng.sesion6;

import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("¿Qué tabla deseas?");
int n = scanner.nextInt();
        scanner.close();
        System.out.println("Ciclo FOR-FOREACH");
        //ciclo for
        for (int i = 1; i <= 10; i++) {
            //System.out.println("5 x "+i+" = "+5*i);
        System.err.printf("%d x %d = %d\n",n,i,n*i);
        }
        Short[] valores= {1,2,3,4,5,6,7,8,9,10};
        for (Short s : valores) {
            System.out.printf("%d x %d = %d\n",n,s,n*s);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%d x %d = %d\n",n,valores[i],n*valores[i]);
        }
        System.out.println("Ciclo WHILE");
        //ciclo while
        Short i = 0;
        while (++i<=10) {
            System.out.println(i);
        }
        System.out.println("Ciclo DO-WHILE");
        //ciclo do-while
        i = 1;
        do {
            System.out.println(i);
        } while (i++<10);
    }
}
