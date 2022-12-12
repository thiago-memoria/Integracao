package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A AcessoTipoMovimentoId.
 */
@Embeddable
public class AcessoTipoMovimentoId implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    @ManyToOne
    private TiposMovimento tiposMovimento;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public AcessoTipoMovimentoId funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    public TiposMovimento getTiposMovimento() {
        return this.tiposMovimento;
    }

    public void setTiposMovimento(TiposMovimento tiposMovimento) {
        this.tiposMovimento = tiposMovimento;
    }

    public AcessoTipoMovimentoId tiposMovimento(TiposMovimento tiposMovimento) {
        this.setTiposMovimento(tiposMovimento);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AcessoTipoMovimentoId)) {
            return false;
        }
        return id != null && id.equals(((AcessoTipoMovimentoId) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AcessoTipoMovimentoId{" +
            "id=" + getId() +
            "}";
    }
}
