package com.mycompany.myapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * A DicionarioColunasId.
 */
@Embeddable
public class DicionarioColunasId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "arq_nom")
	private String arq_nom;

	@Column(name = "cmp_ord")
	private Integer cmp_ord;

	// jhipster-needle-entity-add-field - JHipster will add fields here

	public String getArq_nom() {
		return this.arq_nom;
	}

	public DicionarioColunasId arq_nom(String arq_nom) {
		this.setArq_nom(arq_nom);
		return this;
	}

	public void setArq_nom(String arq_nom) {
		this.arq_nom = arq_nom;
	}

	public Integer getCmp_ord() {
		return this.cmp_ord;
	}

	public DicionarioColunasId cmp_ord(Integer cmp_ord) {
		this.setCmp_ord(cmp_ord);
		return this;
	}

	public void setCmp_ord(Integer cmp_ord) {
		this.cmp_ord = cmp_ord;
	}

	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof DicionarioColunasId)) {
			return false;
		}
		return arq_nom != null && cmp_ord != null && arq_nom.equals(((DicionarioColunasId) o).arq_nom)
				&& cmp_ord.equals(((DicionarioColunasId) o).cmp_ord);
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
		return "DicionarioColunasId{" + "arq_nom='" + getArq_nom() + "'" + ", cmp_ord="
				+ getCmp_ord() + "}";
	}
}
