import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qtd;
		System.out.println("Favor digitar a quantidade de alunos");
		qtd = leitor.nextInt();
		double alunos[] = new double[qtd];
		double total=0;
		System.out.println("O vetor tem tamanho de " + alunos.length);
		for (int i=0;i<alunos.length;i++) {
			System.out.println("Digite o consumo do aluno "+(i+1));
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];		
		}
		for (int i=0;i<alunos.length;i++) {
		System.out.println("O aluno "+(i+1)+" consumiu R$ " + alunos[i]);}

		System.out.println("O total de consumo foi de R$ " + total);
		
		leitor.close();
		

	}

}
