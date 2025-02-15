import java.time.LocalDate

fun main() {
    println("=== Creación y uso de un objeto Persona ===")
    try {
        val persona = Persona("Lucía", LocalDate.of(2000, 3, 15))
        println("Nombre: ${persona.nombre}")
        println("Edad: ${persona.edad}")
        persona.cumple()
        println(persona)
        persona.actividad()
    } catch (e: IllegalArgumentException) {
        println("Error creando Persona: ${e.message}")
    }

    println("\n=== Creación y uso de un objeto Estudiante ===")
    try {
        val estudiante = Estudiante("Andrés", LocalDate.of(1998, 6, 10), "Ingeniería Informática")
        println(estudiante)
        estudiante.cumple()
        estudiante.actividad()
    } catch (e: IllegalArgumentException) {
        println("Error creando Estudiante: ${e.message}")
    }

    println("\n=== Ejemplo de validación con edad negativa (fecha de nacimiento en el futuro) ===")
    try {
        val estudianteInvalido = Estudiante("María", LocalDate.now().plusYears(1), "Medicina")
        println(estudianteInvalido)
    } catch (e: IllegalArgumentException) {
        println("Error creando Estudiante: ${e.message}")
    }
}
