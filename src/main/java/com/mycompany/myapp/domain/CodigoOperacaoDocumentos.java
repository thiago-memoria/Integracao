package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A CodigoOperacaoDocumentos.
 */
@Entity
@Table(name = "codigo_operacao_documentos")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CodigoOperacaoDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "cfo_des")
    private String cfo_des;

    @Column(name = "cfo_abr")
    private String cfo_abr;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public CodigoOperacaoDocumentos id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCfo_des() {
        return this.cfo_des;
    }

    public CodigoOperacaoDocumentos cfo_des(String cfo_des) {
        this.setCfo_des(cfo_des);
        return this;
    }

    public void setCfo_des(String cfo_des) {
        this.cfo_des = cfo_des;
    }

    public String getCfo_abr() {
        return this.cfo_abr;
    }

    public CodigoOperacaoDocumentos cfo_abr(String cfo_abr) {
        this.setCfo_abr(cfo_abr);
        return this;
    }

    public void setCfo_abr(String cfo_abr) {
        this.cfo_abr = cfo_abr;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public CodigoOperacaoDocumentos cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public CodigoOperacaoDocumentos funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodigoOperacaoDocumentos)) {
            return false;
        }
        return id != null && id.equals(((CodigoOperacaoDocumentos) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CodigoOperacaoDocumentos{" +
            "id=" + getId() +
            ", cfo_des='" + getCfo_des() + "'" +
            ", cfo_abr='" + getCfo_abr() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            "}";
    }
}
