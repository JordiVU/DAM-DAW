# Gestor de Canciones en Java

Este proyecto permite **escanear carpetas en busca de archivos MP3**, leer sus metadatos (cabecera ID3v1) y almacenarlos de forma serializada en un archivo `.bin`. También permite leer los archivos serializados para mostrar la información de la canción.

---

## Funciones principales

- Escaneo recursivo de carpetas en busca de archivos `.mp3`.
- Lectura de metadatos ID3v1:
  - Título
  - Artista
  - Álbum
  - Año
  - Comentario
  - Género
  - Fecha de creación del archivo
- Serialización de objetos `Cancion` en archivos `.bin`.
- Lectura de archivos `.bin` para recuperar la información de la canción.

---

## Funcionamiento

El programa se ejecuta desde la terminal con los siguientes **modos de operación**:

- Escanear carpetas y generar archivos binarios
```

```bash
 -E ruta_del_fichero.txt
 ```
 
- Lectura de archivos binarios:

```bash
 -L ruta_del_fichero.bin
```

---

# Estructura del proyecto
```bash
.
├── Main.java           # Clase principal con la lógica de escaneo y lectura
├── practica1
│   └── Cancion.java    # Clase serializable para almacenar la información de la canción
└── rutas.txt           # Ejemplo de archivo con rutas a escanear
```