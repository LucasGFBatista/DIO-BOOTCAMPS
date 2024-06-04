package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> listaEventos;

	public AgendaEventos() {
		this.listaEventos = new HashMap<>();
	}

	void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);

		listaEventos.put(data, evento);
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> exibirEventos = new TreeMap<>(listaEventos);

		System.out.println("\n" + exibirEventos);
	}

	
	public Evento obterProximoEvento() {
		
		Map<LocalDate,Evento> proximoEvento = new TreeMap<>();
		
		if(!listaEventos.isEmpty()) {
			
		}
	}
	
	
	// main vai aqui
	public static void main(String[] args) {
		AgendaEventos agendaEvento = new AgendaEventos();

		agendaEvento.adicionarEvento(LocalDate.of(2024, 1, 30), "Festival de verão", "Ivete sem Galo");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 2, 14), "Carnaval", "Desfiles das Escolas de Samba");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 3, 20), "Dia Mundial da Felicidade",
				"Celebração da alegria e do bem-estar");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 4, 21), "Tiradentes",
				"Homenagem ao Patrono da Inconfidência Mineira");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 5, 1), "Dia do Trabalho",
				"Celebração dos direitos dos trabalhadores");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 6, 12), "Dia dos Namorados", "Demonstração de amor e carinho");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 7, 7), "Independência do Brasil",
				"Comemoração da liberdade e da soberania nacional");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 8, 15), "Dia da Aviação", "Homenagem aos pioneiros da aviação");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 9, 7), "Dia da Independência da Bahia",
				"Celebração da autonomia baiana");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 10, 12), "Dia das Crianças",
				"Comemoração da alegria e inocência da infância");

		agendaEvento.exibirAgenda();

	}

}
