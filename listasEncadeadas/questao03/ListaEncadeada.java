package br.ucsal.listasEncadeadas.questao03;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int verificaTamanho;

	public void adicionar(NumeroInteiro _valor) {
		Celula celula = new Celula();
		celula.setValor(_valor);
		if (verificarTamanho() > 15) {
			System.out.println("Limite maximo da lista foi alcançado");
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

	public int verificarTamanho() {
		verificaTamanho = 0;
		Celula celula = primeiro;
		while (celula != null) {
			verificaTamanho++;
			celula = celula.getProximo();
		}
		return verificaTamanho;
	}
	
	public Celula pesquisar(Celula _celula) {
		for (Celula celula = primeiro; celula!= null; celula = celula.getProximo()) {
			if (celula == _celula) {
				return celula;
			}
		}
		return null;
	}
}
