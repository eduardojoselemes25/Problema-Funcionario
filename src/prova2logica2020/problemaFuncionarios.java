package prova2logica2020;

import java.util.Locale;
import java.util.Scanner;

public class problemaFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int totalHoras = 0;
		double soma = 0.0;
		double custoTotal = 0.0;

		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		while (horasTrabalhadas <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			horasTrabalhadas = sc.nextInt();
		}
		totalHoras += horasTrabalhadas;
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		while (valorHora <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			valorHora = sc.nextDouble();
		}
		soma = horasTrabalhadas * valorHora;
		custoTotal += soma;

		double custoMaior = soma;
		String quemGanhouMais = nome;

		System.out.print("Digitar outro (S/N)? ");
		String resp = sc.next();
		while (resp.equals("S") == false && resp.equals("N") == false) {
			System.out.print("Digite S ou N Maiúsculo: ");
			resp = sc.next();
		}
		while (resp.equals("N") == false) {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			while (horasTrabalhadas <= 0) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
				horasTrabalhadas = sc.nextInt();
			}
			totalHoras += horasTrabalhadas;
			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();
			while (valorHora <= 0.0) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
				valorHora = sc.nextDouble();
			}
			soma = horasTrabalhadas * valorHora;
			custoTotal += soma;

			if (custoMaior < soma) {
				custoMaior = soma;
				quemGanhouMais = nome;
			}

			System.out.print("Digite S ou N: ");
			resp = sc.next();
			while (resp.equals("S") == false && resp.equals("N") == false) {
				System.out.print("Digite S ou N Maiúsculo: ");
				resp = sc.next();
			}
		}
		System.out.println();

		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.print("Digite uma opção: ");
		int opcao = sc.nextInt();
		if (opcao == 1) {
			System.out.println();
			System.out.println("Total de horas = " + totalHoras);
			System.out.println();
		} else if (opcao == 2) {
			System.out.println();
			System.out.printf("Custo total = R$ %.2f%n", custoTotal);
			System.out.println();
		} else {
			System.out.println();
		}
		while (opcao != 4) {
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println();
				System.out.println("Total de horas = " + totalHoras);
				System.out.println();
			} else if (opcao == 2) {
				System.out.println();
				System.out.printf("Custo total = R$ %.2f%n", custoTotal);
				System.out.println();
			} else if (opcao == 3) {
				System.out.println();
				System.out.println("Pessoa que ganhou mais: " + quemGanhouMais);
				System.out.println();
			} else {
				System.out.println();
			}
		}
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}
}
