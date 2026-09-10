package entities;

public class Aluno {

	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;

	public double finalGrade() {
		return primeiraNota + segundaNota + terceiraNota;
	}

	public double missingPoints() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		} else {
			return 0;
		}
	}
}
