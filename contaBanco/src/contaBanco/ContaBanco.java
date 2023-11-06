package contaBanco;

public class ContaBanco {

	private int numconta;
	private char tipo;  // P ganha 150 OU C ganha 50
	private String dono;
	private double saldo;
	private boolean status;  // conta aberta = true
	
	public ContaBanco(int numconta,char tipo,String dono) {
		this.numconta =  numconta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;	
	}
	
	public int getNumconta() {
		return numconta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public char getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isStatus() {
		return status;
	}
	
	public void abrirConta() {
		this.status = true;
		if(tipo == 'C') {
			this.saldo += 50;
		}
		else {
			this.saldo += 150;
		}
	}
	
	public boolean fecharConta() {
		if(saldo>0) {
			return false;
		}
		else if(saldo<0) {
			return false;
		}
		else {
			status=false;
		}
		return true;
		
	}
	
	public void depositar(double deposito) {
		if(this.status ==true) {
			this.saldo+=deposito;
		}
	}
	
	public void sacar(double sacar) {
		if(this.status ==true) {
			if(sacar<=saldo) {
				this.saldo -= sacar;
			}
		}
	}
	
	public void pagarMensalidade() {
		int corrente = 12;
		int poupanca = 20;
		
		if(status == true) {
			if(tipo=='C') {
				if(saldo>corrente) {
					this.saldo-=corrente;
				}
			}
			else if(tipo=='P') {
				if(saldo>poupanca) {
					this.saldo-=poupanca;
				}
			}
		}
	}
}

