class Persona(val DNI: String, cuentas: Array<Cuenta?>) {

    var cuentas: Array<Cuenta?> = Array(3) { null }

    fun agregarCuenta(cuenta: Cuenta) {
        var cambios = 0

        if (cuentas.size !in 0..3) {
            println("No puedes agregar más de tres cuentas")
            return
        }

        if (cuenta in cuentas) {
            println("Esta cuenta ya ha sido introducida")
            return
        }

        cuentas.forEachIndexed { index, elemento ->
            if (elemento == null) {
                cuentas[index] = cuenta
                cambios++
                return@forEachIndexed
            }
        }
    }

    companion object {

        fun esMorosa(persona: Persona): Boolean {
            for (cuenta in persona.cuentas) {
                if (cuenta?.saldo != null && cuenta.saldo < 0) {
                    return true
                }
            }
            return false
        }

        fun transferencia(personaA: Persona, personaB: Persona, id1: Int, id2: Int, cantidad: Double): Boolean {
            if (personaA.cuentas[id1] == null || personaB.cuentas[id2] == null) {
                println("Alguna de las cuentas introducidas no fue encontrada")
                return false
            }

            personaA.cuentas[id1]?.saldo ?: (0 - cantidad)
            personaB.cuentas[id2]?.saldo ?: (0 - cantidad)
            return true
        }
    }
}