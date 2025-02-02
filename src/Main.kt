fun main() {

    val cuenta1 = Cuenta(1)
    val cuenta2 = Cuenta(2, 700.0)

    val persona1 = Persona("52417827E", arrayOf())
    persona1.agregarCuenta(cuenta1)
    persona1.agregarCuenta(cuenta2)
    cuenta1.recibirAbono(1100.0)
    cuenta2.realizarPago(750.0)

    if (Persona.esMorosa(persona1)) {
        println("Hay cuentas con saldo negativo, es moroso")
    }
    else {
        println("No es moroso")
    }

    println("")

    cuenta2.recibirAbono(1000.0)

    val cuenta3 = Cuenta(3)
    val cuenta4 = Cuenta(4, 1000.0)

    val persona2 = Persona("41345134Q", arrayOf())
    persona2.agregarCuenta(cuenta3)
    persona2.agregarCuenta(cuenta4)
    println("")

    Persona.transferencia(persona1, persona2, 2, 4, 300.0)

    println("")
    println(persona1)
    println(persona2)
}