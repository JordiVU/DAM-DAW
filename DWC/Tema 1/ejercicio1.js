/**
Parte 1
Crea una funciÃ³n que reciba 2 cadenas de texto. La segunda cadena debe contener solo una letra.
Debe devolver la cantidad de veces que esa letra (segundo parÃ¡metro) estÃ¡ incluida en la cadena (primer parÃ¡metro).
No debe diferenciar entre letras mayÃºsculas y minÃºsculas.
Comprueba que ambos parÃ¡metros sean cadenas de texto y que la segunda cadena tenga solo 1 carÃ¡cter. Si hay un error, imprime un mensaje y devuelve -1.
Ejemplo: timesChar("CaracterÃ­stica", "c") -> 3
*/
console.log("EJERCICIO 1 - PARTE 1");

function cuentaLetras(palabra, letra)
{
    if(letra <= 1)
    {
        let contador = 0;

        for(let i = 0; i < palabra.lenght; i++)
        {
            if(palabra[i].toUpperCase() == letra.toUpperCase())
            {
                contador++;
            }
        }

        return contador;
    }
    else{
        console.log("Añade solo una letra a buscar.");
    }
}

 // return (palabra.match(new RegExp(CharacterData, "ig")) ?? []).lenght; (Forma pro)

console.log(cuentaLetras("Carambolas", "a"));

/**
 * Parte 2
 * Crea una funciÃ³n que tome una cadena como entrada y compruebe si es un palÃ­ndromo (es igual cuando se invierte).
 * Haz esto sin usar bucles (puedes usar Array.from para convertir una cadena en un array).
 * Comprueba que el tipo del parÃ¡metro es "string" y que la longitud es al menos 1 o muestra un error.
 * Ejemplo: esPalindromo("abeceba") -> true
 */

console.log("EJERCICIO 1 - PARTE 2");

const reversedStr = charArray.reverse().join('');


/**
Parte 3
Crea un array de cadenas de texto.
Filtra el array para incluir solo las cadenas de texto que tengan al menos 5 caracteres.
Transforma todas las cadenas de texto en el array filtrado a MAYÃšSCULAS.
Imprime el array resultante, utilizando ";" como separador.
Â¡No utilices bucles tradicionales! (while, for, ...)
 */
console.log("EJERCICIO 1 - PARTE 3");


/**
 * Parte 4
 * Desarrolla una funciÃ³n que comprima una cadena reemplazando caracteres repetitivos consecutivos con
 * el carÃ¡cter y el nÃºmero de repeticiones. Por ejemplo, "AAAABBBCC" se convertirÃ­a en "4A3B2C".
 * Ejemplo: stringCompression("GGGHHRRRRRRRUIIIOOOO") -> 3G2H7R1U3I4O
 */

console.log("EJERCICIO 1 - PARTE 4");


/**
Parte 5
Crea un array con 4 valores y realiza lo siguiente (utiliza los mÃ©todos de array adecuados).
Agrega 2 elementos al principio.
Agrega 2 mÃ¡s al final.
Elimina las posiciones 3, 4 y 5.
Inserta 2 elementos antes del Ãºltimo elemento.
En cada cambio, muestra el array resultante con sus elementos separados por '=>' (no uses ningÃºn bucle).
 */
console.log("EJERCICIO 1 - PARTE 5");


/**
 * Parte 6
 * Crea una funciÃ³n que tome un array de nÃºmeros que contenga valores duplicados. DeberÃ­a devolver el
 * primer nÃºmero que se repite en el array, o -1 si no hay duplicados.
 * No uses bucles, y si no sabes cÃ³mo hacerlo sin bucles, solo puedes usar un bucle
 * (.forEach cuenta como un bucle).
 * Ejemplo: encuentraRepetido([1,4,7,3,8,7,4,5,5,1]) -> 7 (se repite antes que el 4)
 */

console.log("EJERCICIO 1 - PARTE 6");


/**
Parte 7
Crea un array con varias cadenas de texto. Utilizando el mÃ©todo reduce, devuelve una cadena de texto
que sea una concatenaciÃ³n de la primera letra de cada cadena en el array.
 */

console.log("EJERCICIO 1 - PARTE 7");


/**
 * Parte 8
 * Crea una funciÃ³n que tome un array de cadenas como primer parÃ¡metro y una cadena como segundo.
 * DeberÃ­a devolver un nuevo array que contenga las palabras del primer array cuyas letras estÃ©n todas presentes
 * en la segunda cadena. Intenta no usar bucles a no ser que no sepas hacerlo de otra manera.
 * Ejemplo: fitraPalabras(["house", "car", "watch", "table"], "catboulerham") -> ['car', 'table']
 */

console.log("EJERCICIO 1 - PARTE 8");


/**
 * Parte 9
 * Crea una funciÃ³n que tome un array de luces representadas por los caracteres 'ðŸ”´' y 'ðŸŸ¢'.
 * La funciÃ³n debe comprobar si las luces estÃ¡n alternando (por ejemplo, ['ðŸ”´', 'ðŸŸ¢', 'ðŸ”´', 'ðŸŸ¢', 'ðŸ”´']).
 * Devuelve el nÃºmero mÃ­nimo de luces que necesitan ser cambiadas para que las luces alternen.
 * Ejemplo: ajustaLuces(['ðŸ”´', 'ðŸ”´', 'ðŸŸ¢', 'ðŸ”´', 'ðŸŸ¢'])Â  -> 1 (cambia la primera luz a verde)
 */
console.log("EJERCICIO 1 - PARTE 9");


/**
Parte 10
Crea un objeto Map. La clave serÃ¡ el nombre de un estudiante y el valor serÃ¡ un array con todas sus calificaciones en exÃ¡menes.
Itera a travÃ©s del Map y muestra el nombre de cada estudiante, las calificaciones separadas por '-' y el promedio de calificaciones (con 2 decimales).
Ejemplo: Pedro (7.60 - 2.50 - 6.25 - 9.00). Promedio: 6.34

 */
console.log("EJERCICIO 1 - PARTE 10");

/**
 * Parte 11
 * Crea una colecciÃ³n Map donde la clave es el nombre de un plato y el valor es un array de ingredientes.
 * Realiza el cÃ³digo para crear otro Map donde la clave sea el nombre del ingrediente y el valor sea el array de
 * platos donde aparece ese ingrediente.
 */

console.log("EJERCICIO 1 - PARTE 11");


/**
 * Parte 12
 * Crea una funciÃ³n que pueda recibir tantos nÃºmeros como quieras por parÃ¡metro. Utiliza rest para agruparlos en
 * un array e imprimir los que son pares y los que son impares por separado.
 * NO uses bucles (for, while, etc.)
 */

console.log("EJERCICIO 1 - PARTE 12");


/**
 * Parte 13
 * Crea una funciÃ³n que reciba un array y sume los primeros tres nÃºmeros del array.
 * Utiliza desestructuraciÃ³n de arrays en los parÃ¡metros para obtener esos tres nÃºmeros.
 * Si alguno de esos nÃºmeros no estÃ¡ presente en el array, se asignarÃ¡ un valor predeterminado de 0.
 * Devuelve el resultado de sumar esos tres nÃºmeros.
 */

console.log("EJERCICIO 1 - PARTE 13");



/**
 * Parte 14
 * Crea una funciÃ³n que tome un nÃºmero indeterminado de cadenas como argumentos,
 * las agrupa en un array y devuelve un nuevo array que contiene la longitud de cada cadena.
 * No uses bucles.
 * Ejemplo: stringLenghts("potato", "milk", "car", "table") -> [6, 4, 3, 5]
 */

console.log("EJERCICIO 1 - PARTE 14");


/**
 * Parte 15
 * Crea un array y, sin modificarlo, genera los siguientes arrays derivados (cada nuevo array deriva del anterior):
 * - Agrega 2 elementos al principio del array
 * - Elimina las posiciones 4 y 5
 * - Concatena los elementos de otro array al final Muestra el array resultante despuÃ©s de cada operaciÃ³n.
 * Ninguna operaciÃ³n realizada debe modificar el array sobre el que opera. Muestra el array original al final.
 */

console.log("EJERCICIO 1 - PARTE 15");
