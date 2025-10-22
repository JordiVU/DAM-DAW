import mongoose from "mongoose";

let librosSchema = new mongoose.Schema({
    title: {
        type: String,
        required: true,
        minlength: 1,
        trim: true
    },
    autor: {
        type: String,
        required: true,
        unique: true,
        trim: true,
    },
    edad: {
        type: Number,
        min: 18,
        max: 120
    }
});

let Libros = mongoose.model('libros', librosSchema);
export default Libros;