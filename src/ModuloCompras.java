public class ModuloCompras {
    private ProcesadorPago procesadorPago;

    public ModuloCompras(ProcesadorPago procesadorPagoInicial) {
        this.procesadorPago = procesadorPagoInicial;
    }

    public void setProcesadorPago(ProcesadorPago nuevoProcesador) {
        this.procesadorPago = nuevoProcesador;
        System.out.println("[Sistema] Cambiando proveedor de pago...");
    }

    public void realizarCompra(double monto) {
        System.out.println("ModuloCompras: Iniciando transacción de compra por un valor de $" + monto);

        boolean pagoExitoso = procesadorPago.procesarPago(monto);

        if (pagoExitoso) {
            System.out.println("¡Resultado: Compra realizada con éxito!\n");
        } else {
            System.out.println("Resultado: La transacción fue rechazada.\n");
        }
    }
}
