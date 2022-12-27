package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A EquipamentosPagamento.
 */
@Entity
@Table(name = "equipamentos_pagamento")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EquipamentosPagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "pos_nom")
    private String pos_nom;

    @Column(name = "pos_ser")
    private String pos_ser;

    @Column(name = "pos_adq")
    private String pos_adq;

    @Column(name = "pos_est")
    private Integer pos_est;

    @Column(name = "pos_cgc")
    private String pos_cgc;

    @Column(name = "pos_cav")
    private String pos_cav;

    @Column(name = "pos_chr")
    private String pos_chr;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "cad_fun")
    private Integer cad_fun;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public EquipamentosPagamento id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPos_nom() {
        return this.pos_nom;
    }

    public EquipamentosPagamento pos_nom(String pos_nom) {
        this.setPos_nom(pos_nom);
        return this;
    }

    public void setPos_nom(String pos_nom) {
        this.pos_nom = pos_nom;
    }

    public String getPos_ser() {
        return this.pos_ser;
    }

    public EquipamentosPagamento pos_ser(String pos_ser) {
        this.setPos_ser(pos_ser);
        return this;
    }

    public void setPos_ser(String pos_ser) {
        this.pos_ser = pos_ser;
    }

    public String getPos_adq() {
        return this.pos_adq;
    }

    public EquipamentosPagamento pos_adq(String pos_adq) {
        this.setPos_adq(pos_adq);
        return this;
    }

    public void setPos_adq(String pos_adq) {
        this.pos_adq = pos_adq;
    }

    public Integer getPos_est() {
        return this.pos_est;
    }

    public EquipamentosPagamento pos_est(Integer pos_est) {
        this.setPos_est(pos_est);
        return this;
    }

    public void setPos_est(Integer pos_est) {
        this.pos_est = pos_est;
    }

    public String getPos_cgc() {
        return this.pos_cgc;
    }

    public EquipamentosPagamento pos_cgc(String pos_cgc) {
        this.setPos_cgc(pos_cgc);
        return this;
    }

    public void setPos_cgc(String pos_cgc) {
        this.pos_cgc = pos_cgc;
    }

    public String getPos_cav() {
        return this.pos_cav;
    }

    public EquipamentosPagamento pos_cav(String pos_cav) {
        this.setPos_cav(pos_cav);
        return this;
    }

    public void setPos_cav(String pos_cav) {
        this.pos_cav = pos_cav;
    }

    public String getPos_chr() {
        return this.pos_chr;
    }

    public EquipamentosPagamento pos_chr(String pos_chr) {
        this.setPos_chr(pos_chr);
        return this;
    }

    public void setPos_chr(String pos_chr) {
        this.pos_chr = pos_chr;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public EquipamentosPagamento cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public Integer getCad_fun() {
        return this.cad_fun;
    }

    public EquipamentosPagamento cad_fun(Integer cad_fun) {
        this.setCad_fun(cad_fun);
        return this;
    }

    public void setCad_fun(Integer cad_fun) {
        this.cad_fun = cad_fun;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EquipamentosPagamento)) {
            return false;
        }
        return id != null && id.equals(((EquipamentosPagamento) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "EquipamentosPagamento{" +
            "id=" + getId() +
            ", pos_nom='" + getPos_nom() + "'" +
            ", pos_ser='" + getPos_ser() + "'" +
            ", pos_adq='" + getPos_adq() + "'" +
            ", pos_est=" + getPos_est() +
            ", pos_cgc='" + getPos_cgc() + "'" +
            ", pos_cav='" + getPos_cav() + "'" +
            ", pos_chr='" + getPos_chr() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", cad_fun=" + getCad_fun() +
            "}";
    }
}
