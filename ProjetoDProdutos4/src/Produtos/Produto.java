package Produtos;

public class Produto {
	private String nome;
	private double preco;
	private int qntd;
	
	
	public Produto(String nome, double preco, int qntd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qntd = qntd;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQntd() {
		return qntd;
	}
	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	
	public void calculcarEstoque() {
		double total = preco * qntd;
	}
	
	public void verificarProduto() {
		if (qntd < 1) {
			System.out.println("Esse produto está fora de estoque!");
		}
	}
	
	public void comprarProduto(int qntdCompras) {
		if (qntdCompras > qntd) {
			System.out.println("Quantidade maior que o estoque!");
		}else {
			qntd -= qntdCompras;
		}
	}
	
	public void consultarTotal(int qntdCompras) {
		double total = qntdCompras * preco;
		System.out.println("Preço Final: "+ total);
	}
	
}
