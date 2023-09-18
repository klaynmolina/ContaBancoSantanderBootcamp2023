package main;

import java.util.Scanner;

public class ContaTerminal {

	private String nomeCliente;
	private String agencia;
	private Integer numero;
	private Double saldo;

	public ContaTerminal() {
	}

	public ContaTerminal(String nomeCliente, String agencia, Integer numero, Double saldo) {
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return String.format(
				"\nOl� %s obrigado por criar uma conta em nosso banco, sua ag�ncia � %s, conta %d e seu saldo R$%.2f j� est� dispon�vel para saque.",
				nomeCliente, agencia, numero, saldo);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nomeCliente;
		String agencia;
		int numero;
		double saldo;

		try {
			System.out.println("Bem Vindo Ao Sistema de Cadastro \n");

			System.out.print("Nome do Cliente: ");
			nomeCliente = scanner.nextLine();

			System.out.print("\nAgência: ");
			agencia = scanner.nextLine();

			System.out.print("\nConta: ");
			numero = scanner.nextInt();

			System.out.print("\nSaldo: ");
			saldo = scanner.nextDouble();

			ContaTerminal novoCliente = new ContaTerminal();
			novoCliente.setNomeCliente(nomeCliente);
			novoCliente.setAgencia(agencia);
			novoCliente.setNumero(numero);
			novoCliente.setSaldo(saldo);

			System.out.println(novoCliente);
		} catch (Exception e) {
			System.out.println("\nDigite uma informação válida. Cadastro Cancelado.");
		}

		scanner.close();
	}

}