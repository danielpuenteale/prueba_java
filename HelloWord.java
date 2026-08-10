public class HelloWord {

    public static void main(String[] args) {

        // ==========================================================
        // 1. IMPRESIÓN POR CONSOLA
        // ==========================================================
        // Permite mostrar mensajes en la pantalla/consola.
        System.out.println("--- 1. Impresión por consola ---");
        System.out.println("Hola, Java!");
        System.out.println();

        // ==========================================================
        // 2. VARIABLES Y TIPOS DE DATOS
        // ==========================================================
        // Las variables guardan valores que pueden modificarse durante la ejecución.
        System.out.println("--- 2. Variables ---");
        
        String name = "Dani"; // Tipo explícito: Cadena de texto
        System.out.println("Nombre inicial: " + name);

        name = "Jaime"; // Reasignación de valor
        System.out.println("Nuevo nombre: " + name);

        int age = 18; // Tipo explícito: Entero
        System.out.println("Edad: " + age);

        // 'var' permite que Java infiera el tipo de dato automáticamente (en este caso, int)
        var year = 2026;
        System.out.println("Año: " + year);
        System.out.println();

        // ==========================================================
        // 3. CONSTANTES
        // ==========================================================
        // La palabra reservada 'final' impide que el valor sea modificado posteriormente.
        System.out.println("--- 3. Constantes ---");
        final String EMAIL = "hola@gmail.com";
        System.out.println("Email (Constante): " + EMAIL);
        System.out.println();

        // ==========================================================
        // 4. OPERADORES UNARIOS (Incremento y Decremento)
        // ==========================================================
        // Operan sobre una sola variable o valor.
        System.out.println("--- 4. Operadores Unarios ---");
        int b = 3;
        System.out.println("Valor de b: " + b);
        System.out.println("Positivo: " + (+b));   // Mantiene el signo positivo
        System.out.println("Negativo: " + (-b));   // Cambia el signo a negativo
        System.out.println("Incremento (++b): " + (++b)); // Le suma 1 a b (ahora b es 4)
        System.out.println("Decremento (--b): " + (--b)); // Le resta 1 a b (ahora b es 3)
        System.out.println();

        // ==========================================================
        // 5. OPERADORES DE ASIGNACIÓN
        // ==========================================================
        // Permiten asignar valores o realizar una operación matemática al mismo tiempo.
        System.out.println("--- 5. Operadores de Asignación ---");
        int a = b; // 'a' toma el valor actual de 'b' (3)
        System.out.println("a = b -> " + a); 

        a = b * 2; // Multiplicación simple (a pasa a ser 6)
        System.out.println("a = b * 2 -> " + a);

        a += 1; // Equivale a: a = a + 1 (Suma y asigna)
        System.out.println("a += 1 -> " + a); 

        a -= 1; // Equivale a: a = a - 1 (Resta y asigna)
        System.out.println("a -= 1 -> " + a);

        a *= 1; // Equivale a: a = a * 1 (Multiplica y asigna)
        System.out.println("a *= 1 -> " + a);

        a /= 2; // Equivale a: a = a / 2 (Divide y asigna)
        System.out.println("a /= 2 -> " + a);
        System.out.println();

        // ==========================================================
        // 6. OPERADORES RELACIONALES / COMPARACIÓN
        // ==========================================================
        // Comparan dos valores y devuelven un resultado booleano (true o false).
        System.out.println("--- 6. Operadores Relacionales ---");
        System.out.println("a == b (Igualdad): " + (a == b)); 
        System.out.println("a != b (Desigualdad): " + (a != b));       
        System.out.println("a > b  (Mayor que): " + (a > b)); 
        System.out.println("a < b  (Menor que): " + (a < b)); 
        System.out.println("a >= b (Mayor o igual que): " + (a >= b)); 
        System.out.println();

        // ==========================================================
        // 7. OPERADORES LÓGICOS (AND, OR, NOT)
        // ==========================================================
        // Evalúan expresiones booleanas.
        System.out.println("--- 7. Operadores Lógicos ---");
        
        // 7.1. Operador AND (&&): Devuelve true solo si AMBAS condiciones son verdaderas
        System.out.println("true && true: " + (true && true));   // true
        System.out.println("true && false: " + (true && false)); // false

        // 7.2. Operador OR (||): Devuelve true si AL MENOS UNA condición es verdadera
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || false: " + (false || false)); // false

        // 7.3. Operador NOT (!): Invierte el valor booleano
        System.out.println("!true: " + (!true));   // false
        System.out.println("!false: " + (!false)); // true
        System.out.println();

        // ==========================================================
        // 8. TRABAJO CON CADENAS DE TEXTO (Strings)
        // ==========================================================
        // Creación, concatenación y métodos principales para manipulación de texto.
        System.out.println("--- 8. Métodos de Strings ---");
        
        name = "Dani";
        var surname = new String("Puente");

        // Concatenación (Unir cadenas)
        System.out.println("Nombre completo: " + name + " " + surname);

        // Longitud de la cadena (length)
        System.out.println("Longitud del nombre: " + name.length());

        // Obtener un carácter por su índice (charAt) -> Recuerda que empieza en índice 0
        System.out.println("Primer carácter del nombre: " + name.charAt(0));

        // Extraer una parte de la cadena (substring) -> (índice inicio, índice fin exclusivo)
        System.out.println("Subcadena del nombre (índices 2 a 4): " + name.substring(2, 4));

        // Conversión a Mayúsculas / Minúsculas
        System.out.println("Nombre en mayúsculas: " + name.toUpperCase());
        System.out.println("Apellido en minúsculas: " + surname.toLowerCase());

        // Comprobar si contiene un texto (contains)
        System.out.println("¿El nombre contiene 'Dani'?: " + name.contains("Dani"));

        // Comparar contenido exacto de dos cadenas (equals)
        System.out.println("¿El apellido es igual a 'Puente'?: " + surname.equals("Puente"));
    } 
}