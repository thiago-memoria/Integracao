package com.mycompany.myapp.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * A InformacoesInventarioId.
 */
@Embeddable
public class InformacoesInventarioId implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	private ParametroFuncionaisCentroCusto parametroFuncionaisCentroCusto;

	@ManyToOne
	private Itens itens;

	// jhipster-needle-entity-add-field - JHipster will add fields here

	public ParametroFuncionaisCentroCusto getParametroFuncionaisCentroCusto() {
		return this.parametroFuncionaisCentroCusto;
	}

	public void setParametroFuncionaisCentroCusto(ParametroFuncionaisCentroCusto parametroFuncionaisCentroCusto) {
		this.parametroFuncionaisCentroCusto = parametroFuncionaisCentroCusto;
	}

	public InformacoesInventarioId parametroFuncionaisCentroCusto(
			ParametroFuncionaisCentroCusto parametroFuncionaisCentroCusto) {
		this.setParametroFuncionaisCentroCusto(parametroFuncionaisCentroCusto);
		return this;
	}

	public Itens getItens() {
		return this.itens;
	}

	public void setItens(Itens itens) {
		this.itens = itens;
	}

	public InformacoesInventarioId itens(Itens itens) {
		this.setItens(itens);
		return this;
	}

	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof InformacoesInventarioId)) {
			return false;
		}
		return parametroFuncionaisCentroCusto != null && itens != null
				&& parametroFuncionaisCentroCusto.equals(((InformacoesInventarioId) o).parametroFuncionaisCentroCusto)
				&& itens.equals(((InformacoesInventarioId) o).itens);
	}

	@Override
	public int hashCode() {
		// see
		// https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
		return getClass().hashCode();
	}

	// prettier-ignore
	@Override
	public String toString() {
		return "InformacoesInventarioId{}";
	}
}
