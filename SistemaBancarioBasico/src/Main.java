import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Matheus Gouvêa";
        String tipoConta = "Corrente";
        double saldoTotal = 2500.00;
        boolean ok = true;

        Scanner opcao = new Scanner(System.in);
        Scanner receber = new Scanner(System.in);
        Scanner retirar = new Scanner(System.in);



        while(ok){

            System.out.println("************************");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo de conta: " + tipoConta);
            System.out.println("Saldo Bancário: " + saldoTotal);
            System.out.println("************************\n");

            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada: ");
            int valor = opcao.nextInt();

            switch (valor){
                case 1:
                    System.out.println("\nValor do Saldo: " + saldoTotal + "\n");
                    break;

                case 2:
                    System.out.println("\nDigite o valor que deseja depositar: ");
                    double deposito = receber.nextDouble();
                    if(deposito >= 0){
                        saldoTotal += deposito;
                        System.out.println("\nNovo Saldo: " + saldoTotal + "\n");
                    } else {
                        System.out.println("\nValor Inválido. Tente Novamente!\n");
                    }
                    break;

                case 3:
                    System.out.println("\nDigite o valor que deseja transferir: ");
                    double transferir = retirar.nextDouble();
                    if(transferir > saldoTotal){
                        System.out.println("\nValor acima do Saldo Total. Tente Novamente!\n");
                    } else if (transferir < 0){
                        System.out.println("\nValor Inválido. Tente Novamente!");
                    } else{
                        saldoTotal -= transferir;
                        System.out.println("\nNovo Saldo: " + saldoTotal + "\n");
                    }
                    break;

                case 4:
                    ok = false;
                    break;

                default:
                    System.out.println("\nValor Inválido. Tente Novamente!\n");
                    break;
            }
        }


    }
}