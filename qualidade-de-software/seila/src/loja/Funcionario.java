package loja;

public class Funcionario {
	private float salario;
	private int matricula;

	public Funcionario(float salario, int matricula) {
		super();
		this.salario = salario;
		this.matricula = matricula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
