import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Televisore tv = new Televisore();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        System.out.println("Benvenuto nel programma del televisore!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Accendi il televisore");
            System.out.println("2. Spegni il televisore");
            System.out.println("3. Scansiona canali");
            System.out.println("4. Guarda un canale");
            System.out.println("5. Aumenta volume");
            System.out.println("6. Diminuisci volume");
            System.out.println("7. Esci");
            System.out.print("Inserisci la tua scelta: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Errore: inserisci un numero valido.");
                scanner.next();
                System.out.print("Inserisci la tua scelta: ");
            }
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    tv.accendi();
                    break;
                case 2:
                    tv.spegni();
                    break;
                case 3:
                    tv.scansionaCanali();
                    break;
                case 4:
                    if (tv.isAcceso()) {
                        System.out.print("Inserisci il numero del canale: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Errore: inserisci un numero valido.");
                            scanner.next();
                            System.out.print("Inserisci il numero del canale: ");
                        }
                        int numeroCanale = scanner.nextInt();
                        tv.guardaCanale(numeroCanale);
                    } else {
                        System.out.println("Errore: il televisore è spento. Accendilo prima di cambiare canale.");
                    }
                    break;
                case 5:
                    tv.aumentaVolume();
                    break;
                case 6:
                    tv.diminuisciVolume();
                    break;
                    case 7:
                    System.out.println("Uscita dal programma.");
                    break;
                    default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 7);

        System.out.println("Grazie per aver utilizzato il programma del televisore!");

        scanner.close();
    }
}
