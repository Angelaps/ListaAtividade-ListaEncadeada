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

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}
	
	public int verificarTamanho() {
		verificaTamanho = 0;
		Celula celula = primeiro;
		while(celula != null) {
			verificaTamanho++;
			celula = celula.getProximo();
		}
		return verificaTamanho;
	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			verificaTamanho++;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			verificaTamanho++;
			return temProximo;
		}
	}
	
	public void apagarLista() {
		while(temProximo() == true) {
			remover();
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[ ");
		
		Celula celula = primeiro;
		
		while(celula != null) {
			sb.append(celula.getValor() + " ");
			celula = celula.getProximo();
		}
		sb.append("]");
		return sb.toString();
	}
}
