public class PagoBilleteraVirutal implements  ProcesadorPago {
    String correoTitular;
    double saldoBilletera;


    public PagoBilleteraVirutal(String correoTitular, double saldoBilletera){
        this.correoTitular = correoTitular;
        this.saldoBilletera = saldoBilletera;
    }

    public boolean procesarPago(double monto){
        if(monto <= 0 ){
            System.out.println("Ingrese una cantidad mayor a cero");
            return false;
        }

        if(monto > this.saldoBilletera){
            System.out.println("Dinero insuficiente en la billetera virtual");
            return false;
        }

        this.saldoBilletera -= monto;
        System.out.println("Procesando pago. Dinero debitado : " + monto);
        return true;
    }
}
