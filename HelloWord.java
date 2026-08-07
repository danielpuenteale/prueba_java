public class HelloWord {
    public static void main(String[] args) {
        
        // 1. Impresión por consola
        System.out.println("Hola, Java!");

        // 2. Variables (Pueden cambiar su valor)
        String name = "Dani"; 
        System.out.println("Nombre inicial: " + name);

        name = "Jaime"; // Reasignación
        System.out.println("Nuevo nombre: " + name);

        int age = 18;
        System.out.println("Edad: " + age);

        // Uso de 'var' (Java infiere el tipo de dato automáticamente)
        var year = 2026;
        System.out.println("Año: " + year);

        // 3. Tipos de datos primitivos comunes
        double height = 1.75;       // Números decimales
        boolean isStudent = true;   // Valores lógicos (true/false)
        char initial = 'D';         // Un solo carácter

        System.out.println("Estatura: " + height);
        System.out.println("¿Es estudiante?: " + isStudent);
        System.out.println("Inicial: " + initial);

        // 4. Constantes (No se pueden modificar una vez asignadas)
        final String EMAIL = "hola@gmail.com";
        System.out.println("Email (Constante): " + EMAIL);

    } 
}     