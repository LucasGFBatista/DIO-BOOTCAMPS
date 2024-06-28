import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

	@Mock
	private ApiDosCorreios apiDosCorreios;

	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;

	@Test
	void cadastrarPessoa() {

		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("BA", "Salvador", "Rua Carlos Brandão da Silva",
				"casa", "Ladeirão");

		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);

		Pessoa lucas = cadastrarPessoa.cadastrarPessoa("Lucas", "202406272107", LocalDate.of(1998, 12, 15), "341020");

		DadosLocalizacao enderecolucas = lucas.getEndereco();
		assertEquals(dadosLocalizacao.getBairro(), enderecolucas.getBairro());
		assertEquals(dadosLocalizacao.getCidade(), enderecolucas.getCidade());
		assertEquals(dadosLocalizacao.getUf(), enderecolucas.getUf());
	}

	@Test
	void tentaCadastrarPessoaMasSistemaDosCorreiosFalha() {

		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(RuntimeException.class);

		Assertions.assertThrows(RuntimeException.class,
				() -> cadastrarPessoa.cadastrarPessoa("Lucas", "202406272107", LocalDate.of(1998, 12, 15), "341020"));
	}

}