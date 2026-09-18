public class PagoCriptomoneda implements  ProcesadorPago{
    String direccionBilletera;
    double saldoCriptoUSD;

    public PagoCriptomoneda(String direccionBilletera, double saldoCriptoUSD){
        this.direccionBilletera = direccionBilletera;
        this.saldoCriptoUSD = saldoCriptoUSD;
    }

    public boolean procesarPago(double monto){
        if(monto <= 0){
            System.out.println("ERROR. El monto debe ser mayor a cero");
            return false;
        }
        if(monto < 5.0){
            System.out.println("ERROR. El monto minimo de transacción en la red es de $5.00");
            return false;
        }
        if(monto > this.saldoCriptoUSD){
            System.out.println("ERROR. Saldo insuficiente");
            return false;
        }

        this.saldoCriptoUSD -= monto;
        System.out.println("Procesando pago por $" + monto);
       return true;
    }
}
