// Clase hija de Robot encargada de gestionar los robots voladores.

import { Robot } from "./robot.class.js";

export class  FlyingRobot extends Robot {
    #altitude;

    constructor(model, altitude) {
        super(model)
        this.#altitude = altitude;
    }

    get altitude() {
        return this.#altitude;
    }

    set speed(altitude) {
        this.#altitude = altitude;
    }
    
    fly() {
        console.log(`Flying ${this.model} to ${this.#altitude} meters`);
        this.battery = this.battery - 50;
    }

    toString() {
        return ` Model: ${this.model}\n Type: Flying\n Altitude: ${this.altitude}\n Battery: ${this.battery}%\n`;
    }
}