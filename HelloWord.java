// Punto de entrada obligatorio: sin este método, Java no puede iniciar la ejecución del programa.

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

      
        // 3. Constantes (No se pueden modificar una vez asignadas)

        final String EMAIL = "hola@gmail.com";
        System.out.println("Email (Constante): " + EMAIL);


        // 4. Operadores unarios

        int b = 3;
        System.out.println(+b); // Operador unario positivo
        System.out.println(-b); // Operador unario negativo
        System.out.println(++b); // Incremento en 1
        System.out.println(--b); // Decremento en 1


        // 5. Operadores de Asignación

       int a;
       a = b;
       System.out.println(a); 

       a = b * 2;
       System.out.println(a);

       a += 1;
       System.out.println(a); 

       a -= 1;
       System.out.println(a);
       a *= 1;
       System.out.println(a);
       a /= 2;
       System.out.println(a);


       //6. Operadores de Comparación / Relacionales

        System.out.println(a == b); // Igualdad
        System.out.println(a != b); // Desigualdad      
        System.out.println(a > b); // Mayor que
        System.out.println(a < b); // Menor que
        System.out.println(a >= b); // Mayor o igual que


        // 7. Operadores Lógicos (AND)

        System.out.println(true && true); // AND
        System.out.println(true && false); // AND
        System.out.println(false && true); // AND
        System.out.println(false && false); // AND

        // 7.1 Operador (OR)

        System.out.println(true || true); // Operador OR
        System.out.println(true || false); // Operador OR
        System.out.println(false || true); // Operador OR
        System.out.println(false || false); // Operador OR


    } 
}     