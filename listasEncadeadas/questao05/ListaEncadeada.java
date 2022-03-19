package br.ucsal.listasEncadeadas.questao05;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int verificaTamanho;

	public void adicionarFim(NumeroInteiro _valor) {
		Celula celula = new Celula();
		celula.setValor(_valor);
		if (verificarTamanho() > 7) {
			System.out.println("Limite maximo da lista foi alcançado!");
		} else {

			if (primeiro == null && ultimo == null) {
				primeiro = celula;
				ultimo = celula;
			} else {
				ultimo.setProximo(celula);
				ultimo = celula;
			}
		}
	}
	
	public void adicionarInicio(NumeroInteiro _valor) {
		Celula celula = new Celula();
		celula.setValor(_valor);
		if(verificarTamanho() > 7) {
			System.out.println("Limite maximo da lista foi alcançado!");
		}else {
			celula.setProximo(primeiro);
			primeiro = celula;
		}
	}
	
	public int verificarTamanho() {
		verificaTamanho = 0;
		Celula celula = primeiro;
		while (celula != null) {
			verificaTamanho++;
			celula = celula.getProximo();
		}
		return verificaTamanho;
	}
}
