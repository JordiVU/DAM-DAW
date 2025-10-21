const jordi = require('lodash');
const cadenas = ['Nacho', 'Ana', 'Maria', 'Laura'];
const resultado = jordi.join(cadenas, ',');
console.log(resultado); // "Nacho,Ana,Maria,Laura"