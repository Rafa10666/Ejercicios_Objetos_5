public class Main {

    public static void main(String[] args) {
        System.out.println("\n ##### EJERCICIO 18 #####\n");
        // Crear una hora
        Hora h = new Hora(14, 30);
        System.out.println("Hora: " + h);

        // Probar inc()
        h.inc();//incremento de hora
        System.out.println("Después de inc(): " + h);

        // Probar setMinutos()
        boolean hora1 = h.setMinutos(45);
        System.out.println("setMinutos(45): " + hora1 + " -> " + h);

        boolean hora2 = h.setMinutos(70);
        System.out.println("setMinutos(70): " + hora2 + " -> " + h);

        // Probar setHora()
        boolean hora3 = h.setHora(23);
        System.out.println("setHora(23): " + hora3 + " -> " + h);

        boolean hora4 = h.setHora(25);
        System.out.println("setHora(25): " + hora4 + " -> " + h);

        // Probar cambio de día
        Hora h2 = new Hora(23, 59);
        System.out.println("\nHora: " + h2);
        h2.inc();
        System.out.println("Después de inc(): " + h2);

        System.out.println("\n ##### EJERCICIO 21 #####\n");

        // Crear variable del tipo ColorSemaforo
        ColorSemaforo color = ColorSemaforo.AMARILLO;

        // Imprimir el nombre del color usando .name()
        System.out.println("Color del semáforo: " + color.name());

        // Switch para mostrar mensaje según el color
        switch (color) {
            case ROJO:
                System.out.println("¡Para!");
                break;
            case AMARILLO:
                System.out.println("¡Precaución!");
                break;
            case VERDE:
                System.out.println("¡Adelante!");
                break;
        }

        System.out.println(" --- Probando todos los colores ---");

        // Probar con ROJO
        color = ColorSemaforo.ROJO;
        System.out.println(" Color: " + color.name());
        switch (color) {
            case ROJO:
                System.out.println("¡Para!");
                break;
            case AMARILLO:
                System.out.println("¡Precaución!");
                break;
            case VERDE:
                System.out.println("¡Adelante!");
                break;
        }

        // Probar con VERDE
        color = ColorSemaforo.VERDE;
        System.out.println(" Color: " + color.name());
        switch (color) {
            case ROJO:
                System.out.println("¡Para!");
                break;
            case AMARILLO:
                System.out.println("¡Precaución!");
                break;
            case VERDE:
                System.out.println("¡Adelante!");
                break;
        }
        System.out.println("\n ##### EJERCICIO 22 #####\n");
        //Bucle for-each
        // Recorrer todos los valores del enum usando .values()
        for (DiaSemana dia : DiaSemana.values()) {//EL values devuelve un array con todos los valores del enum y los puntos para separar
            System.out.println(dia);

        }
    }
}