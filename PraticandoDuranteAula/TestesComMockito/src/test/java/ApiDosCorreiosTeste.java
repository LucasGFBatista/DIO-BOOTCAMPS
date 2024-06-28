
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ApiDosCorreiosTeste {

	@Mock
	private ApiDosCorreios apiDosCorreios;

	@Test
	void retornaObjetoQuandoEspecificoValorEhPassado() {
		when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);

		DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep("41341");

		assertNull(dadosLocalizacao);
	}

	@Test
	void retornaObjetoQuandoEspecificoValorEhPassado2() {
		when(apiDosCorreios.buscaDadosComBaseNoCep("41310"))
				.thenReturn(new DadosLocalizacao("BA", "Salvador", "Rua Carlos Brandão da Silva", "casa", "Ladeirão"));

		DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep("41310");

		assertEquals("BA", dadosLocalizacao.getUf());
	}
}