package Ex08;

public class PessoaJuridica extends Pessoa implements IPessoa {
	
	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public PessoaJuridica() {
		
	}

	@Override
	public String verNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
