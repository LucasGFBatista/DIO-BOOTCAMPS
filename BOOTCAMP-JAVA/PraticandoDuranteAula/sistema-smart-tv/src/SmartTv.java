public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Estado da tv
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = true;
    }

    // Volume da tv
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    // Canal da tv

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
}
