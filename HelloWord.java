public class HelloWord {

    public static void main(String[] args) {

        // 1. IMPRESIÓN POR CONSOLA
        System.out.println("--- 1. Impresión por consola ---");
        System.out.println("Hola, Java!");
        System.out.println();

        // 2. VARIABLES Y TIPOS DE DATOS
        System.out.println("--- 2. Variables ---");
        String name = "Dani"; // Tipo explícito: Cadena de texto
        System.out.println("Nombre inicial: " + name);

        name = "Jaime"; // Reasignación de valor
        System.out.println("Nuevo nombre: " + name);

        int age = 18; // Tipo explícito: Entero
        System.out.println("Edad: " + age);

        // 'var' permite que Java infiera el tipo de dato automáticamente
        var year = 2026;
        System.out.println("Año: " + year);
        System.out.println();

        // 3. CONSTANTES
        System.out.println("--- 3. Constantes ---");
        final String EMAIL = "hola@gmail.com";
        System.out.println("Email (Constante): " + EMAIL);
        System.out.println();

        // 4. OPERADORES UNARIOS (Incremento y Decremento)
        System.out.println("--- 4. Operadores Unarios ---");
        int b = 3;
        System.out.println("Valor de b: " + b);
        System.out.println("Positivo: " + (+b));   // Mantiene el signo positivo
        System.out.println("Negativo: " + (-b));   // Cambia el signo a negativo
        System.out.println("Incremento (++b): " + (++b)); // Le suma 1 a b (ahora b es 4)
        System.out.println("Decremento (--b): " + (--b)); // Le resta 1 a b (ahora b es 3)
        System.out.println();

        // 5. OPERADORES DE ASIGNACIÓN
        System.out.println("--- 5. Operadores de Asignación ---");
        int a = b; // 'a' toma el valor actual de 'b' (3)
        System.out.println("a = b -> " + a); 

        a = b * 2; // Multiplicación simple (a pasa a ser 6)
        System.out.println("a = b * 2 -> " + a);

        a += 1; // Equivale a: a = a + 1
        System.out.println("a += 1 -> " + a); 

        a -= 1; // Equivale a: a = a - 1
        System.out.println("a -= 1 -> " + a);

        a *= 1; // Equivale a: a = a * 1
        System.out.println("a *= 1 -> " + a);

        a /= 2; // Equivale a: a = a / 2
        System.out.println("a /= 2 -> " + a);
        System.out.println();

        // 6. OPERADORES RELACIONALES / COMPARACIÓN
        System.out.println("--- 6. Operadores Relacionales ---");
        System.out.println("a == b (Igualdad): " + (a == b)); 
        System.out.println("a != b (Desigualdad): " + (a != b));       
        System.out.println("a > b  (Mayor que): " + (a > b)); 
        System.out.println("a < b  (Menor que): " + (a < b)); 
        System.out.println("a >= b (Mayor o igual que): " + (a >= b)); 
        System.out.println();

        // 7. OPERADORES LÓGICOS (AND)
        System.out.println("--- 7. Operadores Lógicos (AND) ---");
        System.out.println("true && true: " + (true && true));   // true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println();

        // 8. OPERADORES LÓGICOS (OR)
        System.out.println("--- 8. Operadores Lógicos (OR) ---");
        System.out.println("true || false: " + (true || false));   // true
        System.out.println("false || false: " + (false || false)); // false
        System.out.println();

        // 9. OPERADORES LÓGICOS (NOT)
        System.out.println("--- 9. Operadores Lógicos (NOT) ---");
        System.out.println("!true: " + (!true));   // false
        System.out.println("!false: " + (!false)); // true
        System.out.println();

        // 10. TRABAJO CON CADENAS DE TEXTO (Concatenación)
        System.out.println("--- 10. Concatenación de Strings ---");
        name = "Dani";
        var surname = new String("Puente");
        System.out.println("Nombre completo: " + name + " " + surname);
        System.out.println();

        // 11. LONGITUD DE CADENA (length)
        System.out.println("--- 11. Longitud de String ---");
        System.out.println("Longitud del nombre: " + name.length());
        System.out.println();

        // 12. OBTENER CARÁCTER (charAt)
        System.out.println("--- 12. Obtener Carácter Por Índice ---");
        System.out.println("Primer carácter del nombre: " + name.charAt(0));
        System.out.println();

        // 13. EXTRAER SUBCADENA (substring)
        System.out.println("--- 13. Extraer Subcadena ---");
        System.out.println("Subcadena del nombre (índices 2 a 4): " + name.substring(2, 4));
        System.out.println();

        // 14. MAYÚSCULAS Y MINÚSCULAS
        System.out.println("--- 14. Mayúsculas y Minúsculas ---");
        System.out.println("Nombre en mayúsculas: " + name.toUpperCase());
        System.out.println("Apellido en minúsculas: " + surname.toLowerCase());
        System.out.println();

        // 15. BÚSQUEDA Y COMPARACIÓN (contains, equals)
        System.out.println("--- 15. Búsqueda y Comparación ---");
        System.out.println("¿El nombre contiene 'Dani'?: " + name.contains("Dani"));
        System.out.println("¿El apellido es igual a 'Puente'?: " + surname.equals("Puente"));
        System.out.println();

        // 16. ELIMINAR ESPACIOS (trim)
        System.out.println("--- 16. Eliminar Espacios Extremos ---");
        System.out.println(" Hola, me llamo Dani ".trim());
        System.out.println();

        // 17. REEMPLAZAR TEXTO (replace)
        System.out.println("--- 17. Reemplazar Texto ---");
        System.out.println(" Hola, me llamo Dani ".replace("Dani", "Carlos"));
        System.out.println();

        // 18. FORMATEO DE STRING (String.format)
        System.out.println("--- 18. Formateo de String ---");
        age = 18;
        System.out.println(String.format("Mi edad es %d", age));
        System.out.println();

        // 19. Sentencias condicionales (if-else)
        System.out.println("--- 19. Sentencias Condicionales (if-else) ---");
        age = 18;
        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir la mayoría de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        //20 . Sentencias condicionales (switch)
        System.out.println("--- 20. Sentencias Condicionales (switch) ---");

        var day = 4;
        
        switch (day) {
            case 1:
            System.out.println("Lunes");
            break;
            case 2:
            System.out.println("Martes");
            break;
            case 3:
            System.out.println("Miércoles");
            break;
        default:
            System.out.println("Día no válido");
            break;
           

        }

    } // Cierre del método main
} // Cierre de la clase HelloWord