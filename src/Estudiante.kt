import java.time.LocalDate

open class Estudiante(
    nombre: String,
    fechaNacimiento: LocalDate,
    open val carrera: String
) : Persona(nombre, fechaNacimiento) {

    // Se vuelve a exponer la propiedad edad de Persona (ya es de solo lectura)
    override val edad: Int
        get() = super.edad

    override fun actividad() {
        println("$nombre, estudiante de $carrera, está asistiendo a clases y estudiando.")
    }

    override fun toString(): String {
        // Se reutiliza el toString() de Persona y se le añade la información de la carrera.
        return super.toString().replace(")", ", carrera = $carrera)")
    }
}