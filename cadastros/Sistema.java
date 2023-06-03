package cadastros;

public class Sistema {

	public static void main(String[] args) {
		System.out.println("Cadastros");
		
		Professor prof1 = new Professor();
		prof1.setNome("Laura Helen");
		prof1.setCpf("111.111.111-11");
		prof1.setIdade(25);
		prof1.setCurso("Sistemas");
		prof1.setSalario(2000.0);
		
		prof1.imprimir();
		
		Estudante aluno = new Estudante();
		aluno.setNome("Fernando Peixoto");
		aluno.setCpf("555.555.555-55");
		aluno.setIdade(26);
		aluno.setMatricula(123456);
		aluno.setCurso("Arquitetura");
		aluno.setMensalidade(500.0);
		aluno.setEstadoMatricula(true);
		
		aluno.imprimeDados();
		
		Funcionario tecnico = new Funcionario();
		tecnico.setNome("Leonardo Domingues");
		tecnico.setCpf("333.333.333-33");
		tecnico.setIdade(40);
		tecnico.setSetor("Administrativo");
		tecnico.setSalario(3000.0);
		
		tecnico.imprimir();
	}
		
}
