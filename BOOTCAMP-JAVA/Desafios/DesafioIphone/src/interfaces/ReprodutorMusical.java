package interfaces;

import model.Musica;

public interface ReprodutorMusical {
		

    
    void tocar();
    void pausar();
    void selecionarMusica(Musica musica);
    void aumentarVolume(int volume);
    void diminuirVolume(int volume);
    
}
