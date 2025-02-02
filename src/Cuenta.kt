class Cuenta(val numCuenta: Int, var saldo: Double = 0.0) {
    fun consultarSaldo() = println("Tú saldo actual es de $saldo")

    fun recibirAbono(dinero: Double) {
        saldo += dinero
        return
    }

    fun realizarPago(dinero: Double) {
        saldo -= dinero
        return
    }
}