// Jordi Vázquez Uribe
// Programa principal que muestra un menu de opciones para interactuar sobre robots.

import { MobileRobot } from "./mobile-robot.class.js";
import { FlyingRobot } from "./flying-robot.class.js";

import * as readline from "node:readline/promises";
import { stdin as input, stdout as output } from "node:process";
const r1 = readline.createInterface({ input, output });


const robots = [];
let resp;
do {
    console.log("---------------------------\n  MENU\n--------------------------------");
    console.log("1) Show Mobile robots");
    console.log("2) Show flying robots");
    console.log("3) Create a robot");
    console.log("4) Move robots");
    console.log("5) Fly robots");
    console.log("6) Show robot info");
    console.log("0) Exit");
    resp = await r1.question("Option: ");

    switch(resp){
        case "1":
            if(robots.length > 0){
                robots.filter(r => r instanceof MobileRobot)
                    .forEach(r => console.log(r.toString()));
            } else {
                console.log("There are no robots to show.");
            }

            break;

        case "2":
            if(robots.length > 0){
                robots.filter(r => r instanceof FlyingRobot)
                        .forEach(r => console.log(r.toString()));
            } else {
                console.log("There are no robots to show.");
            }
            break;

        case "3":
            let model = await r1.question("Enter the robot model: ");
            let valorIncorrecto;
            do{
                let tipo = await r1.question("Enter the type of robot M -> Mobile / F -> Flying: ");
                let valorUnico = await r1.question("Enter the speed if it is mobile or the altitude if it is flying: ");
                valorIncorrecto = false;
                if(tipo.toLowerCase() == "m") {
                    robots.push(new MobileRobot(model, Number(valorUnico)));
                } else if(tipo.toLowerCase() == "f") {
                    robots.push(new FlyingRobot(model, Number(valorUnico)));
                } else {
                    console.log("ERROR: Invalid type");
                    valorIncorrecto = true;
                }
            } while(valorIncorrecto != false)
            break;

        case "4":
            robots.forEach(r => r.move?.());
            break;

        case "5":
            robots.forEach(r => r.fly?.());
            break;

        case "6":
            let pos = await r1.question("Robot position: "); //Empieza a contar desde 0
            console.log(robots[pos]?.toString() ?? `Robot not found at position ${pos}`);
            break;

        default:
            console.log("ERROR: Enter a valid option");
            break;
    }
} while(resp != 0)

r1.close(); // Finalmente cerramos el stream de entrada/salida