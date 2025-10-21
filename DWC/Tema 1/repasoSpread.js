const objt1 = {
    a: 1,
    b: 2
}

const objt2 = {...objt1} //Copia
console.log(objt2);

const otro = {
    b: 10,
    c: 20
}

const concatenado = {...objt1, ...otro, d:100};
console.log(concatenado);