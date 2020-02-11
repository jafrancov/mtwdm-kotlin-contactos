package dev.alexfranco.mtw.contactos

class Contacto (
    nombre: String,
    puesto: String,
    area: String,
    domicilio: String,
    ciudad: String,
    correo: String,
    telefono: String
) {
    var nombre: String = ""
    var puesto: String = ""
    var area: String = ""
    var domicilio: String = ""
    var ciudad: String = ""
    var correo: String = ""
    var telefono: String = ""

    init {
        this.nombre = nombre
        this.puesto = puesto
        this.area = area
        this.domicilio = domicilio
        this.ciudad = ciudad
        this.correo = correo
        this.telefono = telefono
    }

}

val contacto1 = Contacto(
    "Alejandro Franco",
    "Director de TI",
    "Empresa 1",
    "Domicilio Conocido 1",
    "Guanajuato",
    "alex@empresa1.com",
    "4731234567"
)
val contacto2 = Contacto(
    "Pedro López",
    "Analista de proyectos",
    "Empresa 2",
    "Domicilio Conocido 2",
    "León",
    "pedro@empresa2.com",
    "4771234567"
)
val contacto3 = Contacto(
    "Mario González",
    "Desarrollador",
    "Empresa 3",
    "Domicilio Conocido 3",
    "Salamanca",
    "maria@empresa3.com",
    "4641234567"
)
