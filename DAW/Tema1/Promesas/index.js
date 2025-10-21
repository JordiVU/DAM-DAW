const personas = require(__dirname + '/personas');

let datos = [
  {nombre: "Nacho", telefono: "966112233", edad: 40},
  {nombre: "Ana",   telefono: "911223344", edad: 35},
  {nombre: "Mario", telefono: "611998877", edad: 15},
  {nombre: "Laura", telefono: "633663366", edad: 17}
];

console.log(datos);

personas.nuevaPersona(datos, {nombre: "Juan", telefono:"922334433", edad: 20}).then(resultado => {
  console.log("Añadida persona:", resultado);
}).catch(error => {
  console.log(error);
});

personas.nuevaPersona(datos, {nombre: "Buan", telefono:"955336633", edad: 22}).then(resultado => {
  console.log("Añadida persona:", resultado);
}).catch(error => {
  console.log(error);
});

personas.borrarPersona(datos, {nombre: "Laura", telefono: "633663366", edad: 17}).then(resultado => {
  console.log("Añadida persona:", resultado);
}).catch(error => {
  console.log(error);
})