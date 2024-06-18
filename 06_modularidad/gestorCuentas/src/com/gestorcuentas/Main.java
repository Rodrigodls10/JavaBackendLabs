package com.gestorcuentas;
import com.gestorcuentas.cuentas.Cuenta;
import com.gestorcuentas.usuarios.Usuario;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creo un usuario
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del usuario: ");
        String idUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombre, idUsuario);

        // creo una cuenta
        System.out.println("Ingrese el numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        Cuenta cuenta = new Cuenta(numeroCuenta, usuario);

        // menu de opciones
        int opcion=0;
        while(opcion!=4) {
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar dinero");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    cuenta.depositar(cantidadDeposito);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    double cantidadRetirada = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirada);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        scanner.close();


    }
}
