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
			
}