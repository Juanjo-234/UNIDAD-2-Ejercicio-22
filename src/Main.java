//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
PagoTarjetaCredito mitarjeta = new PagoTarjetaCredito("EJKG-39240", "JUAN PEREZ");
PagoCriptomoneda miCripto = new PagoCriptomoneda("0xABC123", 100.0);
PagoBilleteraVirutal miBilletera = new PagoBilleteraVirutal("usuario@email.com", 100.0);

    ModuloCompras carrito = new ModuloCompras(mitarjeta);


System.out.println("================================");
System.out.println("PRUEBA----TARJETA EXITOSA");
mitarjeta.agregarSaldo(1000);
mitarjeta.procesarPago(500);

System.out.println("================================");
System.out.println("PRUEBA----FALLO EN COMPRA POR MINIMO DE RED");
miCripto.procesarPago(1.0);

System.out.println("================================");
System.out.println("PRUBEA----BILLETERA VIRUTAL POR FALTA DE FONDOS");
miBilletera.procesarPago(110.0);


}
