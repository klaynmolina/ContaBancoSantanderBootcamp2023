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
}