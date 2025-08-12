package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:

        // 1. Crear dos objetos Estudiante con diferentes valores

        Estudiante estudiante1 = new Estudiante("Santiago", 18, 7);
        Estudiante estudiante2 = new Estudiante("Samuel", 20, 4);

        // 2. Mostrar la información de ambos estudiantes

        System.out.println("INFORMACIÓN ESTUDIANTE 1");
        estudiante1.mostrarInformacion();
        System.out.println("INFORMACIÓN ESTUDIANTE 2");
        estudiante2.mostrarInformacion();

        // 3. Modificar algún atributo usando un setter
        
        estudiante1.setEdad(19);

        // 4. Mostrar la información actualizada

        System.out.println("INFORMACIÓN ESTUDIANTE 1 (ACTUALIZADA)");
        estudiante1.mostrarInformacion();

        // TODO: Crear método main para:

        // 1. Crear un libro usando el constructor completo

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 10.99);

        // 2. Crear un libro usando el constructor con solo titulo y autor

        Libro libro2 = new Libro("1984", "George Orwell");

        // 3. Mostrar información de ambos libros

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        // 4. Aplicar descuento usando ambas versiones del método

        libro1.aplicarDescuento(10);
        libro2.aplicarDescuento(15, 2);

        // 5. Mostrar información actualizada de los libros

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}