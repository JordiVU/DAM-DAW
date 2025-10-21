// Clase hija de Robot encargada de gestionar los robots terrestres.

import { Robot } from "./robot.class.js";

export class MobileRobot extends Robot {
    #speed;

    constructor(model, speed) {
        super(model)
        this.#speed = speed
    }

    get speed() {
        return this.#speed;
    }

    set speed(speed) {
        this.#speed = speed;
    }

    move() {
        console.log(`Moving ${this.model} at ${this.#speed} km/h`)
        this.battery = this.battery - 20;
    }

    toString() {
       return ` Model: ${this.model}\n Type: Mobile\n Speed: ${this.speed}\n Battery: ${this.battery}%\n`;
    }
}