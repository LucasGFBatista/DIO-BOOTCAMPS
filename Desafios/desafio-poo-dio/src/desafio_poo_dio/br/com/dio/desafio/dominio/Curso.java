package desafio_poo_dio.br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public Curso() {
	}

	public Curso(int cargaHoraria, String descricao, String nomeCurso) {
		setTitulo(nomeCurso);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso " 
	+ "\nTitulo: " + getTitulo() 
	+ "\nDescricao: " + getDescricao() 
	+ "\nCargaHoraria: " + this.cargaHoraria + '\n';
	}
}