
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int opcaoSelecionada;

        do {
            System.out.println("Digite uma opcao: \n1 - Cadastrar Aluno \n2 - Exibir Aluno cadastrado \n3 - Sair");
            opcaoSelecionada = sc.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("Digite o numero da matricula");
                    int matriculaAluno = sc.nextInt();
                    System.out.println("Digite o nome do aluno");
                    String nomeAluno = sc.next() + sc.nextLine();

                    aluno.matricula = matriculaAluno;
                    aluno.nome = nomeAluno;

                    System.out.println("Digite a rua do aluno");
                    String rua = sc.next() + sc.nextLine();
                    System.out.println("Digite o número do aluno");
                    int numero = sc.nextInt();
                    System.out.println("Digite o bairro do aluno");
                    String bairro = sc.next() + sc.nextLine();
                    System.out.println("Digite a cidade do aluno");
                    String cidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o estado do aluno");
                    String estado = sc.next() + sc.nextLine();
                    System.out.println("Digite o cep do aluno");
                    String cep = sc.next() + sc.nextLine();


                    Endereco enderecoAluno = new Endereco(rua, numero, bairro, cidade, estado, cep);

                    aluno.endereco = enderecoAluno;
                    break;

                case 2:
                    System.out.println("Nome: " + aluno.nome + " Matricula: " + aluno.matricula + " Endereço: " + aluno.endereco.rua + " Número: " + aluno.endereco.numero + " Bairro: " + aluno.endereco.bairro + " Cidade: " + aluno.endereco.cidade + " Estado: " + aluno.endereco.estado + " Cidade: " + aluno.endereco.cidade);
                    break;

                case 3:
                    System.out.println("Finalizando o programa");
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }while(opcaoSelecionada != 0);

        sc.close();
    }
}