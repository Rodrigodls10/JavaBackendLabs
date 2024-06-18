package com.gestorcuentas.cuentas;
import com.gestorcuentas.usuarios.Usuario;


public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Usuario usuario;

    // Constructor con parametros
    public Cuenta(String numeroCuenta, Usuario usuario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // cuando creo una cuenta el saldo inicial es 0
        this.usuario = usuario;
    }

    //constructor vacio, para crear objetos sin inicializarlos
    public Cuenta() {

    }

    // metodos getter y setter


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // metodo para depositar dinero
    public void depositar (double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Deposito realizado con exito. Saldo actual: " + saldo);
        }else {
            System.out.println("La cantidad a depositar debe ser positiva");
        }
    }

    // metodo para retirar dinero
    public void retirar (double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retirado con exito. Saldo actual: " + saldo);
        }else {
            System.out.println("Fondos insuficientes o cantidad no valida");
        }
    }
}
