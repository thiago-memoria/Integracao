package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A PlanoManutencaoCompras.
 */
@Entity
@Table(name = "plano_manutencao_compras")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class PlanoManutencaoCompras implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "cla_per", precision = 21, scale = 2)
    private BigDecimal cla_per;

    @Column(name = "cla_dia")
    private Integer cla_dia;

    @Column(name = "moviment")
    private String moviment;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public PlanoManutencaoCompras id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCla_per() {
        return this.cla_per;
    }

    public PlanoManutencaoCompras cla_per(BigDecimal cla_per) {
        this.setCla_per(cla_per);
        return this;
    }

    public void setCla_per(BigDecimal cla_per) {
        this.cla_per = cla_per;
    }

    public Integer getCla_dia() {
        return this.cla_dia;
    }

    public PlanoManutencaoCompras cla_dia(Integer cla_dia) {
        this.setCla_dia(cla_dia);
        return this;
    }

    public void setCla_dia(Integer cla_dia) {
        this.cla_dia = cla_dia;
    }

    public String getMoviment() {
        return this.moviment;
    }

    public PlanoManutencaoCompras moviment(String moviment) {
        this.setMoviment(moviment);
        return this;
    }

    public void setMoviment(String moviment) {
        this.moviment = moviment;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public PlanoManutencaoCompras cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlanoManutencaoCompras)) {
            return false;
        }
        return id != null && id.equals(((PlanoManutencaoCompras) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PlanoManutencaoCompras{" +
            "id=" + getId() +
            ", cla_per=" + getCla_per() +
            ", cla_dia=" + getCla_dia() +
            ", moviment='" + getMoviment() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            "}";
    }
}
