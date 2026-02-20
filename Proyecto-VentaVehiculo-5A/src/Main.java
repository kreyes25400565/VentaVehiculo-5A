/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kiberly
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE VENTAS - FLOTILLAS URBANAS ===");

        // Vehículos
        Vehiculo v1 = new Vehiculo("Nissan", "NP300", 2024, 285000.0, 1000.0);
        Vehiculo v2 = new Vehiculo("Toyota", "Hilux", 2024, 320000.0, 1200.0);

        // Clientes
        Cliente c1 = new Cliente("Transportes Rápidos S.A. de C.V.", "TRA950615XY3", "3331234567", "contacto@transportes.com");
        Cliente c2 = new Cliente("Logística Express", "LOG850920AB7", "3339876543", "info@logistica.com");
        Cliente c3 = new Cliente("Distribuidora del Norte", "DIS900315CD2", "3335558888", "ventas@distribuidora.com");

        // Ventas
        Venta venta1 = new Venta("VTA-001", 3, v1, c1);
        Venta venta2 = new Venta("VTA-002", 8, v1, c2);
        Venta venta3 = new Venta("VTA-003", 12, v2, c3);

        Venta[] ventas = {venta1, venta2, venta3};

        int contador = 1;

        for (Venta venta : ventas) {

            System.out.println("\n========================================");
            System.out.println("           VENTA #" + contador);
            System.out.println("========================================");

            System.out.println("Folio: " + venta.getFolio());
            System.out.println("Cliente: " + venta.getCliente().getNombre());
            System.out.println("RFC: " + venta.getCliente().getRfc());
            System.out.println("Vehículo: " + venta.getVehiculo().getMarca() + " "
                    + venta.getVehiculo().getModelo() + " "
                    + venta.getVehiculo().getAnio());
            System.out.println("Capacidad de Carga: " + venta.getVehiculo().getCapacidadCarga() + " kg");
            System.out.println("Cantidad: " + venta.getCantidadVehiculos() + " unidades");
            System.out.println("Precio Unitario: " + String.format("$%,.2f", venta.getVehiculo().getPrecio()));

            System.out.println("----------------------------------------");

            System.out.println("Subtotal: " + String.format("$%,.2f", venta.calcularTotal()));
            System.out.println("Descuento: " + String.format("$%,.2f", venta.obtenerMontoDescuento())
                    + " (" + venta.obtenerPorcentajeDescuento() + "%)");

            System.out.println("========================================");
            System.out.println("TOTAL A PAGAR: " + String.format("$%,.2f", venta.aplicarDescuentoPorVolumen()));
            System.out.println("========================================");

            contador++;
        }

        System.out.println("\nTotal de ventas procesadas: " + ventas.length);
    }
}
