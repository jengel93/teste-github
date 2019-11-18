package entidades;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	
	public ContaBancaria (int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	public ContaBancaria (int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta () {
		return numeroConta;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	public void saque(double valorSaque) {
		saldo -= valorSaque + 5.00;
	}
	
	public String toString () {
		
		return "Conta " 
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: R$ "
				+ String.format("%.2f%n",saldo);
	}
	
	
	
}
