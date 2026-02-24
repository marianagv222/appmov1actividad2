package com. example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria (String titular, double saldo) {
        this.titular = "titular";
        if (saldo < 0){
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }    
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
        
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo = cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado. Saldo actual: $" + this.saldo);
        } else {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
        }
    }
    
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
        } else if (cantidad > this.saldo) {
            System.out.println("Error: Fondos insuficientes. Saldo disponible: $" + this.saldo);
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado. Saldo actual: $" + this.saldo);
        }
    }
}
