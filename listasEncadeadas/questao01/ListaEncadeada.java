package br.ucsal.listasEncadeadas.questao01;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	private int verificaTamanho;

	public void adicionar(Professor _valor) {
		Celula celula = new Celula();
		celula.setValor(_valor);

		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = null;
		}
	}

	
	//TAMBEM É A RESOLUÇÃO DA QUESTÃO QUATRO, ONDE PRECISA
	//DE UM METODO DE BUSCA RECURSIVO!!!!!
	private Celula recuperarPenultimo(Celula _celula) {
		if (_celula.getProximo().equals(ultimo)) {
			return _celula;
		}
		return recuperarPenultimo(_celula.getProximo());
	}
	//----------------------------------------------------
	//----------------------------------------------------
	

	public int verificarTamanho() {
		verificaTamanho = 0;
		Celula celula = primeiro;
		while (celula != null) {
			verificaTamanho++;
			celula = celula.getProximo();
		}
		return verificaTamanho;
	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (getPosicaoAtual() == null) {
			setPosicaoAtual(primeiro);
			return true;
		} else {
			boolean temProximo = getPosicaoAtual().getProximo() != null ? true : false;
			setPosicaoAtual(posicaoAtual.getProximo());
			return temProximo;
		}
	}

	public void apagarLista() {
		while (temProximo() == true) {
			remover();
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Celula posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[ ");

		for (Celula celula = primeiro; celula != null; celula = celula.getProximo()) {
			sb.append(celula.getValor() + " ");
		}
		sb.append("]");
		return sb.toString();
	}
}
