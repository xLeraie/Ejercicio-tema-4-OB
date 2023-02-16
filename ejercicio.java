public class ejercicio {
    public static void main (String[] args) {

        // Variables
        int numeroIf = 10;
        int numeroWhile = 0;
        String season = "winter";

        // Bucle If
        if (numeroIf == 0) {
            System.out.println("Este valor es 0");
        } else if (numeroIf >= 0) {
            System.out.println("Este valor es positivo");
        } else {
            System.out.println("Este valor es negativo");
        }
        
        // Bucle While
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
        
        // Bucle Do While
        do {
            numeroWhile = numeroWhile + 3;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        
        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        } 
        
        // Estructura de control Switch
        switch (season) {
            case "spring":
               System.out.println("Es primavera");
               break;
            case "summer":
               System.out.println("Es verano");
               break;
            case "winter":
               System.out.println("Es invierno");
               break;
            case "Autumn":
               System.out.println("Es otoño");
               break;
            default:
               System.out.println("No hay ninguna estación");   
        }


     } 
    }