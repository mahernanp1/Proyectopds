import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Bienvenido a VitalCheck.");
        System.out.println("Por favor, ingrese los siguientes datos:");

        System.out.print("Peso (en kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Género (M/F): ");
        char genero = scanner.next().charAt(0);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Hace actividad física regularmente? (Sí/No): ");
        String actividadFisica = scanner.next();

        System.out.print("¿Consume algún medicamento? (Sí/No): ");
        String consumeMedicamento = scanner.next();

    
        System.out.println("\nSeleccione una enfermedad:");
        System.out.println("1. Resfriado común");
        System.out.println("2. Infección de oído");
        System.out.println("3. Influenza");
        System.out.println("4. Dolor de garganta");
        System.out.println("5. Infección urinaria");
        System.out.println("6. Bronquitis aguda");
        System.out.println("7. Diabetes");
        System.out.println("8. Cáncer");
        System.out.println("9. ninguna de las anteriores");
        System.out.print("Ingrese el número correspondiente a la enfermedad: ");
        int opcionEnfermedad = scanner.nextInt();

      
        switch (opcionEnfermedad) {
            case 1:
                System.out.println("\nRecomendaciones para el resfriado común:");
            System.out.println( "1. Tomar líquidos para evitar la fiebre.");
              System.out.println( "2. Tomar medicamentos para reducir la fiebre.");
              System.out.println( "3. Mantener una dieta equilibrada y saludable.");
                                 
                break;
            case 2:
                System.out.println("\nRecomendaciones para la infección de oído:");
            System.out.println( "1. Tomar líquidos para evitar la inflamación.");  
              System.out.println( "2. Tomar medicamentos para reducir la inflamación.");
              
                break;
            case 3:
                System.out.println("\nRecomendaciones para la influenza:");
            System.out.println( "1. se recetan el oseltamivir o el zanamivir para inhalar para cinco días.");
               System.out.println( "2. o una dosis de peramivir por vía intravenosa o una dosis de baloxavir oral. ");

               break;
            case 4:
                System.out.println("\nRecomendaciones para el dolor de garganta:");
             System.out.println( "1. Tomar líquidos para evitar la inflamación.");
             System.out.println( "2. Hazte gárgaras con agua salada. ");
                System.out.println( "3. Considera las pastillas o los caramelos duros.");

                break;
            case 5:
                System.out.println("\nRecomendaciones para la infección urinaria:");
             System.out.println( "1. Beber mucha agua. El agua ayuda a diluir la orina y expulsar las bacterias.");
             System.out.println( "2. Evitar las bebidas que puedan irritar la vejiga.");
            System.out.println( "3. Usar compresas térmicas.");

               break;
            case 6:
                System.out.println("\nRecomendaciones para el bronquitis aguda:");
             System.out.println( "1. Tomar líquidos.");
             System.out.println( "2. Un humidificador de ambientes puede ayudar. ");
             System.out.println( "3. Evitar el consumo de tabaco.");

               break;
            case 7:
                System.out.println("\nRecomendaciones para el diabetes:");
             System.out.println( "1. Prepare y coma alimentos saludables.");
             System.out.println( "2. Evite el consumo de alcohol.");
             System.out.println( "3. Tome los medicamentos como se los recetaron, aunque se sienta bien..");
            
               break;
            case 8:
                System.out.println("\nRecomendaciones para el cáncer:");
             System.out.println( "1. Mantén una dieta balanceada y haz actividad física. ");
             System.out.println( "2. Consigue atención médica regular. ");
             System.out.println( "3. Evita el consumo de tabaco.");

               break;
            
          
            default:
                System.out.println("\nNo se seleccionó una enfermedad establecida.");

        }

    
        if (opcionEnfermedad < 1 || opcionEnfermedad > 8) {
            System.out.println("\n¿Desea solicitar una cita personalizada? (Sí/No): ");
            String solicitudCita = scanner.next();
            if (solicitudCita.equalsIgnoreCase("Sí")) {
                System.out.println("\nSe ha solicitado una cita personalizada. Por favor, espere el contacto del médico.");
            } else {
                System.out.println("\nContactese con la linea: 3054379543 Gracias por usar VitalCheck.");
            }
        }

        scanner.close();
    }
}
