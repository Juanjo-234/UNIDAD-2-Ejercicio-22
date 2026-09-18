public class PagoTarjetaCredito implements  ProcesadorPago{
    String numeroTarjeta;
    String nombreTitular;
    double saldo;

    public  PagoTarjetaCredito(String numeroTarjeta, String nombreTitular){
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }


    void agregarSaldo(double monto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Saldo de la tarjeta: " + this.saldo);
        }
    }

    public boolean procesarPago(double monto){
        if(monto <= 0 ){
            System.out.println("Ingrese una cantidad mayor a cero");
            return false;
        }

        if(monto > this.saldo){
            System.out.println("Dinero insuficiente en la tarjeta");
            return false;
        }

        this.saldo -= monto;
        System.out.println("Procesando pago.");
        System.out.println("Dinero debitado: " + monto);
        System.out.println("Dinero restante: " + this.saldo);
        return true;
    }
}
