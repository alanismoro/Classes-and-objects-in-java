package cadastros;

public class Estudante extends Pessoa{
	//Atributos
	private int matricula;
	private String curso;
	private double mensalidade;
	private boolean estadoMatricula;
	
	//Metodos
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public boolean isEstadoMatricula() {
		return estadoMatricula;
	}

	public void setEstadoMatricula(boolean estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}

	public void imprimeDados() {
		System.out.println("-------------------------");
		System.out.println("Nome: " +this.nome);
		System.out.println("CPF: " +this.cpf);
		System.out.println("Idade: " +this.idade);
		System.out.println("Matricula: " +this.matricula);
		System.out.println("Curso:" +this.curso);
		System.out.println("Mensalidade: " +this.mensalidade);
		//System.out.println("Aluno ativo: " +this.estadoMatricula);
		if(estadoMatricula)
			System.out.println("Aluno Ativo");
		else
			System.out.println("Aluno inativo");
	}
}
