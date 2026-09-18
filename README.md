Resolución del ejercicio N°22 de la unidad 2 de porgramacion 2.
Este programa simula un sistema de transacciones comerciales modular, permitiendo gestionar de manera flexible diferentes métodos de pago a través de una interfaz común, aplicando validaciones de montos y tipos de transacciones.

Clases e Interfaz Utilizadas
ProcesadorPago (Interfaz): Define el contrato abstracto para la ejecución y validación de los pagos.
PagoTarjetaCredito: Implementa la interfaz simulando la verificación de límites y cargos de comisiones bancarias.
PagoCriptomoneda: Implementa la interfaz validando saldos y comisiones de red para transacciones descentralizadas.
PagoBilleteraVirtual: Implementa la interfaz gestionando transferencias digitales con validación de saldo disponible.
ModuloCompras: Clase controladora que utiliza inyección de dependencias para operar con cualquier procesador de pago de forma dinámica.
