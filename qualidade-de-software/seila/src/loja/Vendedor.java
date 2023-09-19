package loja;

public class Vendedor {
	private int quantidadeVenda;
	private float valorVendas;

	public Vendedor(int quantidadeVenda, float valorVendas) {
		this.quantidadeVenda = quantidadeVenda;
		this.valorVendas = valorVendas;
	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

}
