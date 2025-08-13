package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("Juan", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Maria", 22, 9.0);
        
        // 2. Mostrar la información de ambos estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        
        // 3. Modificar algún atributo usando un setter
        estudiante1.setEdad(21);
        
        // 4. Mostrar la información actualizada
        estudiante1.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        Libro libro1 = new Libro("El Quijote", "Cervantes", 50.0);
        
        // 2. Crear un libro usando el constructor con solo titulo y autor
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        
        // 3. Mostrar información de ambos libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        
        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(10);
        libro2.setPrecio(40.0);
        libro2.aplicarDescuento(20, 5.0);
        
        // 5. Mostrar información actualizada de los libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
