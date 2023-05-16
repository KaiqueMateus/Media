package Principal;

import java.io.IOException;
import java.util.Scanner;

public class Aluno {
	
	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		char resp;
		String nome, disc, mainom, mennom, dado;
		int mat, maimat, menmat, aluno, rec, ap, rp;
		float n1, n2, n3, nr, medr, med, maimed, menmed;
		
		aluno  = 0;
		rec    = 0;
		ap     = 0;
		rp     = 0;
		menmed = 0;
		maimed = 0;
		med    = 0;
		mat    = 0;
		maimat = 0;
		menmat = 0;
		nome   = "";
		mainom = "";
		mennom = "";
		
		//Verificação
		System.out.print("Deseja Verificar a situação dos Alunos (S/N): ");
		resp = entrada.nextLine().toUpperCase().charAt(0);;
	    //Laço de Repetição
		while (resp != 'n') {
			System.out.print("Qual o seu Nome:");
			nome = entrada.nextLine();
			System.out.print("Qual a sua matrícula:");
			mat  = Integer.parseInt(entrada.nextLine());
			System.out.print("Informe a Disciplina: ");
			disc = entrada.nextLine();
			System.out.print("Informe a Primeira Nota:");
			n1   = Float.parseFloat(entrada.nextLine());
			System.out.print("Informe a Segunda Nota:");
			n2   = Float.parseFloat(entrada.nextLine());
			System.out.print("Informe a Terceira Nota:");
			n3   = Float.parseFloat(entrada.nextLine());
			med = (n1 + n2 + n3) / 3;
			aluno++;
			if (med >= 6.0) {
				System.out.println("Aluno: " + nome + "\nMatrítcula:" + mat + "\nDisciplina:" + disc + "\nMédia: " + med + "\nEstá APROVADO!");
				ap++;
			}
				else if (med < 5.0) {
					    System.out.println("Aluno: " + nome + "\nMatrítcula:" + mat + "\nDisciplina:" + disc + "\nMédia: " + med + "\nEstá REPROVADO!");
					    rec++;
				}
					else { 
							System.out.println("Aluno: " + nome + "\nMatrítcula:" + mat + "\nDisciplina:" + disc + "\nMédia: " + med + "\nEstá em RECUPERAÇÃO!");
							rp++;
							System.out.print("Informe a nota da Recuperação:");
							nr = Float.parseFloat(entrada.nextLine());
							med = nr;
							if (med >= 6.0) {
								System.out.println("Aluno: " + nome + "\nMatrítcula:" + mat + "\nDisciplina:" + disc + "\nMédia: " + med + "\nEstá APROVADO!");
							}
								else {
									 System.out.println("Aluno: " + nome + "\nMatrítcula:" + mat + "\nDisciplina:" + disc + "\nMédia: " + med + "\nEstá REPROVADO!");
								}
					}
			
		    System.out.print("Deseja continuar (S/N): ");
		    resp = entrada.nextLine().charAt(0);
	
		}
		System.out.println("\n----SAÍDA DE DADOS----\n");
		System.out.println("\nQuantidade de Alunso verificados: " + aluno);
		System.out.println("\nQuantidade de Alunos aprovados: " + ap);
		System.out.println("\nQuantidade de Alunos em recuperação " + rec);
		System.out.println("\nQuantidade de Alunos reprovados: " + rp);
		System.out.println("\n----FIM DO PROGRAMA!----\n");
	}
}
