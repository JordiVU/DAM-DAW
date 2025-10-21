const m = require('moment');
let ahora = m();
let antes = m("07/10/2015", "DD/MM/YYYY");
let antesV2 = m("03/10/2015", "DD/MM/YYYY");

console.log(m.duration(ahora.diff(antes)).years());

if (antes.isBefore(ahora)) {
    console.log("La fecha de antes es anterior a la de ahora");
}

if (antes.isAfter(antesV2)) {
    console.log("La fecha de antes es posterior a la de antesV2");
}

const fechaDentroDeUnMes = ahora.add(1, 'months');
console.log(fechaDentroDeUnMes.format('DD/MM/YYYY'));