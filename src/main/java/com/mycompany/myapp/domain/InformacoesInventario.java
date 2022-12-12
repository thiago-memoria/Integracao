package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A InformacoesInventario.
 */
@Entity
@Table(name = "informacoes_inventario")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class InformacoesInventario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private InformacoesInventarioId id;

    @Column(name = "ite_bar")
    private String ite_bar;

    @Column(name = "est_qan", precision = 21, scale = 2)
    private BigDecimal est_qan;

    @Column(name = "est_qtd", precision = 21, scale = 2)
    private BigDecimal est_qtd;

    @Column(name = "est_pre", precision = 21, scale = 2)
    private BigDecimal est_pre;

    @Column(name = "est_val", precision = 21, scale = 2)
    private BigDecimal est_val;

    @Column(name = "est_pag")
    private Integer est_pag;

    @Column(name = "est_dat")
    private LocalDate est_dat;

    @Column(name = "est_hor")
    private String est_hor;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public InformacoesInventarioId getId() {
        return this.id;
    }

    public InformacoesInventario id(InformacoesInventarioId id) {
        this.setId(id);
        return this;
    }

    public void setId(InformacoesInventarioId id) {
        this.id = id;
    }

    public String getIte_bar() {
        return this.ite_bar;
    }

    public InformacoesInventario ite_bar(String ite_bar) {
        this.setIte_bar(ite_bar);
        return this;
    }

    public void setIte_bar(String ite_bar) {
        this.ite_bar = ite_bar;
    }

    public BigDecimal getEst_qan() {
        return this.est_qan;
    }

    public InformacoesInventario est_qan(BigDecimal est_qan) {
        this.setEst_qan(est_qan);
        return this;
    }

    public void setEst_qan(BigDecimal est_qan) {
        this.est_qan = est_qan;
    }

    public BigDecimal getEst_qtd() {
        return this.est_qtd;
    }

    public InformacoesInventario est_qtd(BigDecimal est_qtd) {
        this.setEst_qtd(est_qtd);
        return this;
    }

    public void setEst_qtd(BigDecimal est_qtd) {
        this.est_qtd = est_qtd;
    }

    public BigDecimal getEst_pre() {
        return this.est_pre;
    }

    public InformacoesInventario est_pre(BigDecimal est_pre) {
        this.setEst_pre(est_pre);
        return this;
    }

    public void setEst_pre(BigDecimal est_pre) {
        this.est_pre = est_pre;
    }

    public BigDecimal getEst_val() {
        return this.est_val;
    }

    public InformacoesInventario est_val(BigDecimal est_val) {
        this.setEst_val(est_val);
        return this;
    }

    public void setEst_val(BigDecimal est_val) {
        this.est_val = est_val;
    }

    public Integer getEst_pag() {
        return this.est_pag;
    }

    public InformacoesInventario est_pag(Integer est_pag) {
        this.setEst_pag(est_pag);
        return this;
    }

    public void setEst_pag(Integer est_pag) {
        this.est_pag = est_pag;
    }

    public LocalDate getEst_dat() {
        return this.est_dat;
    }

    public InformacoesInventario est_dat(LocalDate est_dat) {
        this.setEst_dat(est_dat);
        return this;
    }

    public void setEst_dat(LocalDate est_dat) {
        this.est_dat = est_dat;
    }

    public String getEst_hor() {
        return this.est_hor;
    }

    public InformacoesInventario est_hor(String est_hor) {
        this.setEst_hor(est_hor);
        return this;
    }

    public void setEst_hor(String est_hor) {
        this.est_hor = est_hor;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public InformacoesInventario funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InformacoesInventario)) {
            return false;
        }
        return id != null && id.equals(((InformacoesInventario) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "InformacoesInventario{" +
            "id=" + getId() +
            ", ite_bar='" + getIte_bar() + "'" +
            ", est_qan=" + getEst_qan() +
            ", est_qtd=" + getEst_qtd() +
            ", est_pre=" + getEst_pre() +
            ", est_val=" + getEst_val() +
            ", est_pag=" + getEst_pag() +
            ", est_dat='" + getEst_dat() + "'" +
            ", est_hor='" + getEst_hor() + "'" +
            "}";
    }
}
