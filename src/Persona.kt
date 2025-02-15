import java.time.LocalDate
import java.time.Period

open class Persona(
    nombre: String,
    private val fechaNacimiento: LocalDate
) {
    var nombre: String = nombre
        set(value) {
            require(value.isNotBlank()) { "El nombre no puede estar vacío." }
            field = value
        }

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(!fechaNacimiento.isAfter(LocalDate.now())) { "La fecha de nacimiento no puede ser en el futuro." }
    }

    private var _edad: Int = Period.between(fechaNacimiento, LocalDate.now()).years

    open val edad: Int
        get() = _edad

    open fun cumple() {
        _edad++
        println("¡Feliz cumpleaños, $nombre! Ahora tienes $_edad años.")
    }

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
}