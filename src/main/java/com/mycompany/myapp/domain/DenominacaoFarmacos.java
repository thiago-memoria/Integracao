package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A DenominacaoFarmacos.
 */
@Entity
@Table(name = "denominacao_farmacos")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DenominacaoFarmacos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "dcb_nom")
    private String dcb_nom;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DenominacaoFarmacos id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDcb_nom() {
        return this.dcb_nom;
    }

    public DenominacaoFarmacos dcb_nom(String dcb_nom) {
        this.setDcb_nom(dcb_nom);
        return this;
    }

    public void setDcb_nom(String dcb_nom) {
        this.dcb_nom = dcb_nom;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public DenominacaoFarmacos cad_dat(LocalDate cad_dat) {
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

    public DenominacaoFarmacos funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DenominacaoFarmacos)) {
            return false;
        }
        return id != null && id.equals(((DenominacaoFarmacos) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DenominacaoFarmacos{" +
            "id=" + getId() +
            ", dcb_nom='" + getDcb_nom() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            "}";
    }
}
