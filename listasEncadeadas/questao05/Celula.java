package br.ucsal.listasEncadeadas.questao05;

public class Celula {

	private NumeroInteiro valor;
	private Celula proximo;
	
	public NumeroInteiro getValor() {
		return valor;
	}
	public void setValor(NumeroInteiro valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
