package br.unifor.cct.cc.logica.pratica.dojo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
//q02
	static void menu(){
		Scanner scanner=new Scanner(System.in);
		int opçao;
		do{
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Lógica de Programação - Opções");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Informe a opção desejada");
		System.out.println("Digite 1 para informar inserir as respostas");
		System.out.println("Digite 2 para informar as notas de cada atividade");
		System.out.println("Digite 3 para mostrar as notas de cada atividade");
		System.out.println("Digite 4 para imprimir o resumo das atividades");
		System.out.println("Digite 5 para imprimir os dados dos alunos que obtiveram maior média geral");
		System.out.println("Digite 0 para sair do programa");
		opçao=scanner.nextInt();
		switch(opçao){
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 0:
			break;
		default:System.out.println("Opção inválida");
		}
		}while(opçao!=1||opçao!=2||opçao!=3||opçao!=4||opçao!=5||opçao!=0);
	}
	}
	//q5
	static void Q5 (ListaDeExercicio[] vetor){
		for (int i = 0; i < vetor.length; i++) {
			ListaDeExercicio aluno = vetor[i];
			aluno.media = (aluno.np1 + aluno.np2 + aluno.np3 + aluno.np4)/ 4;
			vetor[i] = aluno;
		}
		
		for(int i=0; i<vetor.length; i++){
			ListaDeExercicio aluno = vetor[i];
			if(aluno.media > 8){
				System.out.println(aluno.nome + aluno.np1 + aluno.np2 + aluno.np3 + aluno.np4);
			}
		
		}
	}
//q6
	static void Q6 (ListaDeExercicio[] vetor){
		System.out.printf("Nome\t Matricula\t Lista 01\t Lista 02\t Lista 03\t Lista 04\t Media Geral\n");
		for (int i = 0; i < vetor.length; i++) {
			ListaDeExercicio aluno = vetor[i];
			System.out.printf("%s\t %d\t %.2f\t %.2f\t %2f\t %2f\t %2f\n", aluno.nome, aluno.matricula, aluno.np1, aluno.np2, aluno.np3, aluno.np4, aluno.media);
		}
		
	}
}
