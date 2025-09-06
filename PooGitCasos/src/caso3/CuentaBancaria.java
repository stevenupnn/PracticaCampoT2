package caso3;

import java.util.Scanner;

/**
 * Clase CuentaBancaria
 * Permite realizar operaciones de depósito y retiro
 * validando que no se retire más del saldo disponible.
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero con validación
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso. Saldo restante: " + saldo);
            } else {
                System.out.println("Saldo insuficiente. Su saldo actual es: " + saldo);
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método principal con menú interactivo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta de ejemplo
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);

        int opcion;
        do {
            System.out.println("\n===== MENÚ CUENTA BANCARIA =====");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double montoDep = scanner.nextDouble();
                    cuenta.depositar(montoDep);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double montoRet = scanner.nextDouble();
                    cuenta.retirar(montoRet);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
