// Ejercicio 2 con top-level await y try/catch

// Array inicial de personas
let datos = [
  {nombre: "Nacho", telefono: "966112233", edad: 40},
  {nombre: "Ana",   telefono: "911223344", edad: 35},
  {nombre: "Mario", telefono: "611998877", edad: 15},
  {nombre: "Laura", telefono: "633663366", edad: 17}
];

// Función asíncrona que devuelve una promesa al añadir una persona
let nuevaPersona = persona => {
  return new Promise((resolve, reject) => {
    const existe = datos.filter(p => p.telefono === persona.telefono);
    if (existe.length === 0) {
      datos.push(persona);
      resolve(persona);
    } else {
      reject("Error: el teléfono ya existe");
    }
  });
};

// Función asíncrona que devuelve una promesa al borrar una persona
let borrarPersona = telefono => {
  return new Promise((resolve, reject) => {
    const existePersona = datos.filter(p => p.telefono === telefono);
    if (existePersona.length > 0) {
      datos = datos.filter(p => p.telefono !== telefono)
      resolve(existePersona[0]);
    } else {
      reject("Error: no se encontraron coincidencias");
    }
  });
};

// Programa principal con top-level await 

try {
  // Inserciones
  let p1 = await nuevaPersona({nombre: "Juan", telefono:"965661564", edad: 60});
  console.log("Añadida persona:", p1);

  let p2 = await nuevaPersona({nombre: "Rodolfo", telefono:"910011001", edad: 20});
  console.log("Añadida persona:", p2);

  // Inserción repetida → error
  let p3 = await nuevaPersona({nombre: "Rodolfo", telefono:"910011001", edad: 20});
  console.log("Añadida persona:", p3);

} catch (error) {
  console.error(error);
}

try {
  // Borrado correcto
  let borrada = await borrarPersona("910011001");
  console.log("Borrada persona:", borrada);

  // Borrado con número inexistente (error) 
  let borrada2 = await borrarPersona("000000000");
  console.log("Borrada persona:", borrada2);

} catch (error) {
  console.error(error);
}

console.log("Estado final del array:", datos);
