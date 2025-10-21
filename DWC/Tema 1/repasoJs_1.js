const nums = [112, 17, 221, 26, 34, 7, 9];
console.log(nums.sort((n1, n2) => n1 - n2)); //[7, 9, 17,26,34,112,221]
console.log(nums.sort((n1, n2)=> n2- n1)); //[221, 112, 34, 26, 17, 9, 7]

const strs = ["perro", "gato", "abejorro", "caballo", "zorro"];
console.log(strs.sort((s1, s2) => s2.localeCompare(s1))); //['zorro', 'perro', 'gato', 'caballo', 'abejorro']
console.log(strs.sort((s1,s2) => s1.length - s2.length)); //['gato', 'zorro', 'perro', 'caballo', abejorro']
console.log("aro".localeCompare("sandia")); //-1
console.log("sandia".localeCompare("aro")); //1

let nums2 = [1,2,3,4];
console.log(nums2.with(0,99)); //99,2,3,4
console.log(nums2); // 1,2,3,4

//array.filter().map().forEach()

console.log(strs.map(s => s[0])); // La primer letra de cada palabra
console.log(nums.filter(n => n % 2 === 0)); // 112, 34, 26
//Array con las palabras de menos de 6 caracteres en mayúsculas
console.log(strs.filter(p => p.length < 6).map((p) => p.toLocaleUpperCase())); // PERRO, GATO, ZORRO

//Conectar la primera letra de cada cadena del array
console.log(strs.reduce((acum, s) => acum + s[0], ""));

// Si el resultado de la funcion es un array, mete todos los elemenos en un array
console.log(strs.map(s => Array.from(s)).flat());
console.log(strs.flatMap(s => Array.from(s)));

const personas = [
    {nombre: "Pepe", edad: 23},
    {nombre: "Jorge", edad: 13},
    {nombre: "Mireya", edad: 40},
    {nombre: "Santi", edad: 17},
]

// Devuelve la suma de las edades de las personas mayores de edad
const suma = personas
    .filter(p => p.edad >= 18)
    .map(p => p.edad)
    .reduce((t, e) => t + e, 0);

console.log(suma);

function getMedia(...notas) {
    console.log(notas); // Imprime [5, 7, 8.5, 6.75, 9] (está en un array)
    let total = notas.reduce((total,notas) => total + notas, 0);
    return total / notas.length;
}

console.log(getMedia(5, 7, 8.5, 6.75, 9)); // Imprime 7.25

function imprimirUsuario(nombre, ...lenguajes) {
    console.log(nombre + " sabe " + lenguajes.length + " lenguajes: " + lenguajes.join(" - "));
}

// Imprime "Pedro sabe 3 lenguajes: Java - C# - Python"
imprimirUsuario("Pedro", "Java", "C#", "Python");
// Imprime "María sabe 5 lenguajes: JavaScript - Angular - PHP - HTML - CSS"
imprimirUsuario("María", "JavaScript", "Angular", "PHP", "HTML", "CSS");

let numers = [12, 32, 6, 8, 23];
console.log(numers.reduce((max, n) => Math.max(max, n))); // 32 
console.log(Math.max(numers)); // Nan
console.log(Math.max(...numers)); // 32

const a1 = [1,2,3,4];
const a2 = [...a1];
a2[0] = 99;
console.log(a1);
console.log(a2);

//concatenar arrays
const l1 = ["a","b","c"];
const l2 =["A", "B", "C"];
const l3 = l1.concat("-", l2);
console.log(l3);
const l4 = [...l1, "-", ...l2];
console.log(l4);

// Iterador
const a = [23, 45, 67, 89, 12];
const iterador = a.values();

console.log(iterador.next()); // {value: 23, done: false}
console.log(iterador.next()); // {value: 45, done: false}
console.log(iterador.next()); // {value: 67, done: false}
console.log(iterador.next()); // {value: 89, done: false}
console.log(iterador.next()); // {value: 12, done: false}
console.log(iterador.next()); // {value: undefined, done: true}

const w = "Cebra";
const wIt = Iterator.from(w);

console.log(wIt.next());
console.log(wIt.next());

const nombres = [
    "Luis",
    "Alba",
    "Albarito",
    "Manuel",
    "Jose",
    "Antonio",
]


const nombresA = nombres
    .toSorted((n1, n2) => n2.length - n1.length)
    .values()
    .filter((n) => n.startsWith("A"))
    .take(2)
    .map(v => v.toUpperCase())
    .toArray();


// Objetos
const o = new Object();
console.log(o);
o.precio = 23;
o.nombre = "Silla";
console.log(o);