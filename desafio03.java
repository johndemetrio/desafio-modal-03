import java.util.Calendar;
import java.util.Scanner;
public class desafio03{

    public static void main(String[] args) {
        int salario, valorEmprestimo, opcaoEmprestimo, notas100, notas50, notas20, notas10, notas5, notas2;
        Scanner scan= new Scanner(System.in);

        System.out.println("Sistema de empréstimo para colaboradores ModalGR");
        System.out.println("=====================");

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Digite a data de admissão: ");
        System.out.println("Dia: ");
        int dia = scan.nextInt();
        System.out.println("Mês");
        int mes = scan.nextInt();
        System.out.println("Ano: ");
        int ano = scan.nextInt();
        Calendar admissao = Calendar.getInstance();
        admissao.set(ano, mes - 1, dia);
        Calendar dataHoje = Calendar.getInstance();
        int anosDeEmpresa = dataHoje.get(Calendar.YEAR) - admissao.get(Calendar.YEAR);
        if (anosDeEmpresa < 5 || dataHoje.get(Calendar.MONTH) < admissao.get(Calendar.MONTH) || (dataHoje.get(Calendar.MONTH) == admissao.get(Calendar.MONTH) && 
        dataHoje.get(Calendar.DAY_OF_MONTH) < admissao.get(Calendar.DAY_OF_MONTH))) {
           System.out.println("Agradecemos seu interesse, mas você não atende os requisitos mínimos do programa.");
           System.exit(0);
        }

        System.out.println("Digite o seu salário atual: ");
        salario = scan.nextInt();

        System.out.println("Digite o valor do empréstimo: ");
        valorEmprestimo = scan.nextInt();

        while (valorEmprestimo > salario * 2 || valorEmprestimo % 2 != 0) {
            System.out.println("Insira um valor válido!");
            valorEmprestimo = scan.nextInt();
        }

        System.out.println("Opções de empréstimo: ");
        System.out.println("1 - Notas de maior valor");
        System.out.println("2 - Notas de menor valor");
        System.out.println("3 - Notas meio a meio");
        opcaoEmprestimo = scan.nextInt();

        switch (opcaoEmprestimo) {
            case 1:
            notas100 = valorEmprestimo / 100;
            int valor = valorEmprestimo - (notas100 * 100);
            notas50 = valor / 50;
            valor = valor - (notas50 * 50);
            notas20 = valor / 20;
            valor = valor - (notas20 * 20);
            notas10 = valor / 10;
            valor = valor - (notas10 * 10);
            notas5 = valor / 5;
            valor = valor - (notas5 * 5);
            notas2 = valor / 2;
            valor = valor - (notas2 * 2);

            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 2: " + notas2);
            break;
            
            case 2:
            notas20 = valorEmprestimo / 20;
            valor = valorEmprestimo - (notas20 * 20);
            notas10 = valor / 10;
            valor = valor - (notas10 * 10);
            notas5 = valor / 5;
            valor = valor - (notas5 * 5);
            notas2 = valor / 2;
            valor = valor - (notas2 * 2);
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 2: " + notas2);
            break;

            case 3:
            int metadeEmprestimo = valorEmprestimo / 2;
            notas100 = metadeEmprestimo / 100;
            valor = metadeEmprestimo - (notas100 * 100);
            notas50 = valor / 50;
            valor = valor - (notas50 * 50);
            notas20 = valor / 20;
            valor = valor - (notas20 * 20);
            notas10 = valor / 10;
            valor = valor - (notas10 * 10);
            notas5 = valor / 5;
            valor = valor - (notas5 * 5);
            notas2 = valor / 2;
            valor = valor - (notas2 * 2);
            System.out.println("Notas de maior valor");
            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 2: " + notas2);
            System.out.println("===========================");
            notas20 = metadeEmprestimo / 20;
            valor = metadeEmprestimo - (notas20 * 20);
            notas10 = valor / 10;
            valor = valor - (notas10 * 10);
            notas5 = valor / 5;
            valor = valor - (notas5 * 5);
            notas2 = valor / 2;
            valor = valor - (notas2 * 2);
            System.out.println("Notas de menor valor");
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 2: " + notas2);
            break;
        }
    }
}