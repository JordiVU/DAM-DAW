const prod = {
    nombre: "Silla",
    precio: 23,
    verDetalle() {
        console.log(`${this.nombre} - ${this.precio}€`);
    }
}

console.log(prod);
prod.verDetalle();

const persona =  {
    nombre: "Juan",
    telefonos: ["12831287371", "18925123"],
    direccion: {
        calle: "Calle Pepe",
        numero: 24,
        ciudad: "Albacete"
    }
}

persona.telefonos.push("1239120934");
console.log(persona);

console.log(persona.direccion.ciudad);