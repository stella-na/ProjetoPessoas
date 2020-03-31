package ProjetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		/*Impossivel chamar esses métodos pois não 
		  existem nas respectivas classes
		p1.receberAumento(550.2f);
		p2.mudarTrabalho();
		p4.cancelarMatr(); */

	}

}
