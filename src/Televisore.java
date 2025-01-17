import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Televisore {

    private boolean acceso;
    private boolean sportelloChiuso;
    private List<Canale> canaliMemorizzati;
    private List<Canale> canaliPossibili;
    private int volume;

    public Televisore() {
        acceso = false;
        sportelloChiuso = true;
        canaliMemorizzati = new ArrayList<>();
        canaliPossibili = new ArrayList<>();
        volume = 5;
        canaliPossibili.add(new Canale(1, "RAIUNO", "101.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(2, "RAIDUE", "102.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(3, "RAITRE", "103.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(4, "RETE4", "104.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(5, "CANALE5", "105.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(6, "ITALIA1", "106.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(7, "LA7", "107.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(8, "TV8", "108.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(9, "NOVE", "109.5", new Random().nextInt(101)));
        canaliPossibili.add(new Canale(10, "IRIS", "110.5", new Random().nextInt(101)));
    }

    public void accendi() {
        if (acceso) {
            System.out.println("Il televisore è già acceso.");
        } else {
            acceso = true;
            System.out.println("Il televisore è acceso.");
        }
    }

    public void spegni() {
        if (!acceso) {
            System.out.println("Il televisore è già spento.");
        } else {
            acceso = false;
            System.out.println("Il televisore è spento.");
        }
    }

    public void scansionaCanali() {
        if (acceso) {
            canaliMemorizzati.clear();
            for (Canale canale : canaliPossibili) {
                if (canale.getPotenzaRilevata() > 30) {
                    canaliMemorizzati.add(canale);
                }
            }
            System.out.println("Canali memorizzati:");
            for (Canale canale : canaliMemorizzati) {
                System.out.println(canale);
            }
        } else {
            System.out.println("Accendi il televisore per scansionare i canali.");
        }
    }

    public void guardaCanale(int numeroCanale) {
        if (acceso) {
            for (Canale canale : canaliMemorizzati) {
                if (canale.getNumero() == numeroCanale) {
                    System.out.println("Stai guardando il canale " + canale.getNome() + ". Frequenza: " + canale.getFrequenza() + " Potenza: " + canale.getPotenzaRilevata());
                    return;
                }
            }
            System.out.println("Canale non trovato.");
        } else {
            System.out.println("Il televisore è spento. Accendilo prima di cambiare canale.");
        }
    }

    public void aumentaVolume() {
        if (acceso) {
            if (volume < 10) {
                volume++;
                System.out.println("Volume aumentato a " + volume);
            } else {
                System.out.println("Il volume è già al massimo.");
            }
        } else {
            System.out.println("Accendi il televisore per regolare il volume.");
        }
    }

    public void diminuisciVolume() {
        if (acceso) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume diminuito a " + volume);
            } else {
                System.out.println("Il volume è già al minimo.");
            }
        } else {
            System.out.println("Accendi il televisore per regolare il volume.");
        }
    }

    public boolean isAcceso() {
        return acceso;
    }

    public boolean isSportelloChiuso() {
        return sportelloChiuso;
    }

    public List<Canale> getCanaliMemorizzati() {
        return canaliMemorizzati;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Televisore [acceso=" + acceso + ", volume=" + volume + "]";
    }
}
