package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A AcessoTipoMovimento.
 */
@Entity
@Table(name = "acesso_tipo_movimento")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AcessoTipoMovimento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private AcessoTipoMovimentoId id;

    @Column(name = "acs_con")
    private String acs_con;

    @Column(name = "acs_exc")
    private String acs_exc;

    @Column(name = "acs_alt")
    private String acs_alt;

    @Column(name = "acs_inc")
    private String acs_inc;

    @Column(name = "acs_fre")
    private String acs_fre;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public AcessoTipoMovimentoId getId() {
        return this.id;
    }

    public AcessoTipoMovimento id(AcessoTipoMovimentoId id) {
        this.setId(id);
        return this;
    }

    public void setId(AcessoTipoMovimentoId id) {
        this.id = id;
    }

    public String getAcs_con() {
        return this.acs_con;
    }

    public AcessoTipoMovimento acs_con(String acs_con) {
        this.setAcs_con(acs_con);
        return this;
    }

    public void setAcs_con(String acs_con) {
        this.acs_con = acs_con;
    }

    public String getAcs_exc() {
        return this.acs_exc;
    }

    public AcessoTipoMovimento acs_exc(String acs_exc) {
        this.setAcs_exc(acs_exc);
        return this;
    }

    public void setAcs_exc(String acs_exc) {
        this.acs_exc = acs_exc;
    }

    public String getAcs_alt() {
        return this.acs_alt;
    }

    public AcessoTipoMovimento acs_alt(String acs_alt) {
        this.setAcs_alt(acs_alt);
        return this;
    }

    public void setAcs_alt(String acs_alt) {
        this.acs_alt = acs_alt;
    }

    public String getAcs_inc() {
        return this.acs_inc;
    }

    public AcessoTipoMovimento acs_inc(String acs_inc) {
        this.setAcs_inc(acs_inc);
        return this;
    }

    public void setAcs_inc(String acs_inc) {
        this.acs_inc = acs_inc;
    }

    public String getAcs_fre() {
        return this.acs_fre;
    }

    public AcessoTipoMovimento acs_fre(String acs_fre) {
        this.setAcs_fre(acs_fre);
        return this;
    }

    public void setAcs_fre(String acs_fre) {
        this.acs_fre = acs_fre;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AcessoTipoMovimento)) {
            return false;
        }
        return id != null && id.equals(((AcessoTipoMovimento) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AcessoTipoMovimento{" +
            "id=" + getId() +
            ", acs_con='" + getAcs_con() + "'" +
            ", acs_exc='" + getAcs_exc() + "'" +
            ", acs_alt='" + getAcs_alt() + "'" +
            ", acs_inc='" + getAcs_inc() + "'" +
            ", acs_fre='" + getAcs_fre() + "'" +
            "}";
    }
}
