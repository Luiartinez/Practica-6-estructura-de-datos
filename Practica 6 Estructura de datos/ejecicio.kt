import java.io.File

fun leerArchivo(ruta: String): String {
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirEnArchivo(ruta: String, contenido: String) {
    val archivo = File(ruta)
    archivo.appendText(contenido)
}

fun main(args: Array<String>) {
    val ruta = "C:\\Users\\georg\\OneDrive\\Escritorio\\Practica 6 Estructura de datos\\Documentos\\archivo.txt"
    
    // Ejemplo 1: Leer archivo
    val contenido = leerArchivo(ruta)
    println(contenido)
    println("\n")

    // Ejemplo 2: Escribir en archivo
    val escritura = "esto es una prueba de appendText."
    escribirEnArchivo(ruta, escritura)
    println("Texto añadido exitosamente")
}
