class Persona{
    #nombre;
    #edad;

    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    get nombre() {
        return this.#nombre;
    }
    set nombre(nombre) {
        this.#nombre = nombre;
    }
    get edad() {
        return this.#edad;
    }
    set edad(edad) {
        if(edad < 0) throw RangeError("La edad no puede ser menor a 0")
        this.#edad = edad;
    }

    saluda() {
        console.log("Me llamo ${this.nombre} y tengo ${this.edad}");
    }

    valueOf()
    {
        return this.edad;
    }
}

class Hombre extends Persona{
    #sexo;
    constructor(nombre, edad, sexo){
        super(nombre, edad);
        this.#sexo = sexo;
    }

    valueOf()
    {
        return this.edad;
    }
}

let p = new Persona("Pepe", 23);
p.saluda();
console.log(p.edad);
console.log(p + 5)