// Clase padre con los atributos basicos de los robots.

export class Robot {
    #model;
    #battery;

    constructor(model)
    {
        this.#model = model;
        this.#battery = 100;
    }

    get model() {
        return this.#model;
    }

    get battery() {
        return this.#battery;
    }

    set model(model) {
        this.#model = model;
    }

    set battery(battery) {
        if(battery <= 100 && battery >= 0){
            this.#battery = battery;
        } else {
            console.log("ERROR: Invalid value");
        }
    }

    charge() {
        this.#battery = 100;
    }
}