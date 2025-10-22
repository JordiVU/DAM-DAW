//mongo.exe --dbpath mongo-data

const mongoose = require('mongoose');
//const Libro = require(__dirname + '/models/libros')

mongoose.connect("mongodb://127.0.0.1:27017/libros");