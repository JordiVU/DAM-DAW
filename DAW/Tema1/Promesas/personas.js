// 📘 Ejercicio 2 usando async/await y try/catch

// Función asíncrona que devuelve una promesa al añadir una persona
let nuevaPersona = (datos, persona) => {
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
let borrarPersona = (datos, telefono) => {
  return new Promise((resolve, reject) => {
    const existePersona = datos.filter(p => p.telefono === telefono);
    if (existePersona.length > 0) {
        datos = datos.filter(persona => persona.telefono != telefono);
        resolve(existePersona[0]);        
    } else {
      reject("Error: no se encontraron coincidencias");
    }
  });
};

module.exports = {
    nuevaPersona: nuevaPersona,
    borrarPersona: borrarPersona
}
