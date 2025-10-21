package Exercice4;

public class Person {
    protected String nombre;
    protected int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
