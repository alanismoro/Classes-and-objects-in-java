package cadastros;

public class Professor extends Pessoa{
	private String curso;
	private double salario;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimir() {
		System.out.println("----------------");
		System.out.println("Nome: " +this.nome);
		System.out.println("CPF: " +this.cpf);
		System.out.println("Idade: " +this.idade);
		System.out.println("Curso: " +this.curso);
		System.out.println("Salario: " +this.salario);
	}
}
