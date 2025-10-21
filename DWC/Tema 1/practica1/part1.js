// Jordi Vázquez Uribe

import { users } from "./users.js";

console.log("---APARTADO 1---")
const infoAdmins = users.filter(r => r.role === "admin")
                        .sort((a, b) => a.age - b.age)
                        .values()
                        .take(3)
                        .map(({ email, password }) => ({ email, password }))
                        .toArray();
console.table(infoAdmins);

console.log("---APARTADO 2---")
const accesPc1 = new Set(users.filter(u => u.authorizations.includes("PC1"))
                        .map(u => u.name));

const accesPc9 = new Set(users.filter(u => u.authorizations.includes("PC9"))
                        .map(u => u.name));

const accesPcs = accesPc1.intersection(accesPc9);

console.log("PC1: " + [...accesPc1]);
console.log("PC9: " + [...accesPc9]);
console.log("PC1 y PC9: " + [...accesPcs]);

console.log("---APARTADO 3---")
const passwordSegura = users.values().filter(u => u.    password.length >= 5 &&
                                    /[a-z]/.test(u.password) &&
                                    /[A-Z]/.test(u.password) &&
                                     /\d/.test(u.password) &&
                                     /[^a-zA-Z0-9]/.test(u.password))
                            .map(u => u.name + " -> " + u.password)
                            .toArray();

console.log(passwordSegura);

console.log("---APARTADO 4---") 
function getRandomInt(max) {
 return Math.floor(Math.random() * max);
}

const numRandom = getRandomInt(users.length);
const usuarioElegido = users[numRandom];

const now = new Date();
const usuarioFecha = {
    ...usuarioElegido,
    lastAccess: now.toLocaleDateString() + ", " + now.toLocaleTimeString()
};

console.table(usuarioFecha);