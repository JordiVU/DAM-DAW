class Persona
{
    #nombre;
    #edad;

    constructor (nombre, edad)
    {
        this.#nombre = nombre;
        this.#edad = edad;
    }

    get nombre()
    {
        return this.#nombre;
    }

    set nombre(nombre)
    {
        this.#nombre = nombre ?? this.#nombre;
    }

    set edad(edad) {
        if(edad < 0) throw RangeError("La edad no puede ser negativa");
        this.#edad = edad;
    }
}

const p = new Persona("Juan", 25);
p.edad = 45;

class Rectangulo {
    #ancho;
    #alto;
    constructor(ancho, alto)
    {
        this.#alto = alto;
        this.#ancho = ancho;
    }

    get area() {
        return this.#alto * this.#ancho;
    }
}

const rect = new Rectangulo(4, 6);
console.log(rect.area);
