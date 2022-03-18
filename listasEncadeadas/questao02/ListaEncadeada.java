package br.ucsal.listasEncadeadas.questao02;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	
	public void adicionar(Aluno _valor) {
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
	
	private Celula recuperarPenultimo(Celula _celula) {
		if (_celula.getProximo().equals(ultimo)) {
			return _celula;
		}
		return recuperarPenultimo(_celula.getProximo());
	}
	
	public Celula pesquisar(Celula _celula) {
		for (Celula celula = primeiro; celula!= null; celula = celula.getProximo()) {
			if (celula.equals(_celula)) {
				return celula;
			}
		}
		return null;
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
