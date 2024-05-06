package com.mycompany.libropoo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título: ");
        String t = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String a = sc.nextLine();
        System.out.println("Ingrese el año de publicación: ");
        int ap = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el género del libro: ");
        String g = sc.nextLine();

        Libro libro1 = new Libro(t, a, g, ap);
        System.out.println(libro1.mostraInformacion());
        libro1.marcarLeido();
        System.out.println(libro1.antiguo());
        boolean esLeido = libro1.Leido();
        if (esLeido) {
            System.out.println("El libro ya fue leído");
        } else {
            System.out.println("El libro no ha sido leído");
        }
    }
}