package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A DicionarioColunas.
 */
@Entity
@Table(name = "dicionario_colunas")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DicionarioColunas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private DicionarioColunasId id;

    @Column(name = "cmp_nom")
    private String cmp_nom;

    @Column(name = "cmp_des")
    private String cmp_des;

    @Column(name = "cmp_tip")
    private String cmp_tip;

    @Column(name = "cmp_tam")
    private Integer cmp_tam;

    @Column(name = "cmp_dec")
    private Integer cmp_dec;

    @Column(name = "atz_tip")
    private String atz_tip;

    @Column(name = "cmp_pic")
    private String cmp_pic;

    @Column(name = "cmp_val")
    private String cmp_val;

    @Column(name = "atz_rot")
    private String atz_rot;

    @Column(name = "tab_cns")
    private String tab_cns;

    @Column(name = "cmp_cod")
    private String cmp_cod;

    @Column(name = "cmp_cns")
    private String cmp_cns;

    @Column(name = "atz_alt")
    private String atz_alt;

    @Column(name = "cha_pri")
    private String cha_pri;

    @Column(name = "act_nul")
    private String act_nul;

    @Column(name = "cmp_def")
    private String cmp_def;

    @Column(name = "cmp_ena")
    private String cmp_ena;

    @Column(name = "cmp_obr")
    private String cmp_obr;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public DicionarioColunasId getId() {
        return this.id;
    }

    public DicionarioColunas id(DicionarioColunasId id) {
        this.setId(id);
        return this;
    }

    public void setId(DicionarioColunasId id) {
        this.id = id;
    }

    public String getCmp_nom() {
        return this.cmp_nom;
    }

    public DicionarioColunas cmp_nom(String cmp_nom) {
        this.setCmp_nom(cmp_nom);
        return this;
    }

    public void setCmp_nom(String cmp_nom) {
        this.cmp_nom = cmp_nom;
    }

    public String getCmp_des() {
        return this.cmp_des;
    }

    public DicionarioColunas cmp_des(String cmp_des) {
        this.setCmp_des(cmp_des);
        return this;
    }

    public void setCmp_des(String cmp_des) {
        this.cmp_des = cmp_des;
    }

    public String getCmp_tip() {
        return this.cmp_tip;
    }

    public DicionarioColunas cmp_tip(String cmp_tip) {
        this.setCmp_tip(cmp_tip);
        return this;
    }

    public void setCmp_tip(String cmp_tip) {
        this.cmp_tip = cmp_tip;
    }

    public Integer getCmp_tam() {
        return this.cmp_tam;
    }

    public DicionarioColunas cmp_tam(Integer cmp_tam) {
        this.setCmp_tam(cmp_tam);
        return this;
    }

    public void setCmp_tam(Integer cmp_tam) {
        this.cmp_tam = cmp_tam;
    }

    public Integer getCmp_dec() {
        return this.cmp_dec;
    }

    public DicionarioColunas cmp_dec(Integer cmp_dec) {
        this.setCmp_dec(cmp_dec);
        return this;
    }

    public void setCmp_dec(Integer cmp_dec) {
        this.cmp_dec = cmp_dec;
    }

    public String getAtz_tip() {
        return this.atz_tip;
    }

    public DicionarioColunas atz_tip(String atz_tip) {
        this.setAtz_tip(atz_tip);
        return this;
    }

    public void setAtz_tip(String atz_tip) {
        this.atz_tip = atz_tip;
    }

    public String getCmp_pic() {
        return this.cmp_pic;
    }

    public DicionarioColunas cmp_pic(String cmp_pic) {
        this.setCmp_pic(cmp_pic);
        return this;
    }

    public void setCmp_pic(String cmp_pic) {
        this.cmp_pic = cmp_pic;
    }

    public String getCmp_val() {
        return this.cmp_val;
    }

    public DicionarioColunas cmp_val(String cmp_val) {
        this.setCmp_val(cmp_val);
        return this;
    }

    public void setCmp_val(String cmp_val) {
        this.cmp_val = cmp_val;
    }

    public String getAtz_rot() {
        return this.atz_rot;
    }

    public DicionarioColunas atz_rot(String atz_rot) {
        this.setAtz_rot(atz_rot);
        return this;
    }

    public void setAtz_rot(String atz_rot) {
        this.atz_rot = atz_rot;
    }

    public String getTab_cns() {
        return this.tab_cns;
    }

    public DicionarioColunas tab_cns(String tab_cns) {
        this.setTab_cns(tab_cns);
        return this;
    }

    public void setTab_cns(String tab_cns) {
        this.tab_cns = tab_cns;
    }

    public String getCmp_cod() {
        return this.cmp_cod;
    }

    public DicionarioColunas cmp_cod(String cmp_cod) {
        this.setCmp_cod(cmp_cod);
        return this;
    }

    public void setCmp_cod(String cmp_cod) {
        this.cmp_cod = cmp_cod;
    }

    public String getCmp_cns() {
        return this.cmp_cns;
    }

    public DicionarioColunas cmp_cns(String cmp_cns) {
        this.setCmp_cns(cmp_cns);
        return this;
    }

    public void setCmp_cns(String cmp_cns) {
        this.cmp_cns = cmp_cns;
    }

    public String getAtz_alt() {
        return this.atz_alt;
    }

    public DicionarioColunas atz_alt(String atz_alt) {
        this.setAtz_alt(atz_alt);
        return this;
    }

    public void setAtz_alt(String atz_alt) {
        this.atz_alt = atz_alt;
    }

    public String getCha_pri() {
        return this.cha_pri;
    }

    public DicionarioColunas cha_pri(String cha_pri) {
        this.setCha_pri(cha_pri);
        return this;
    }

    public void setCha_pri(String cha_pri) {
        this.cha_pri = cha_pri;
    }

    public String getAct_nul() {
        return this.act_nul;
    }

    public DicionarioColunas act_nul(String act_nul) {
        this.setAct_nul(act_nul);
        return this;
    }

    public void setAct_nul(String act_nul) {
        this.act_nul = act_nul;
    }

    public String getCmp_def() {
        return this.cmp_def;
    }

    public DicionarioColunas cmp_def(String cmp_def) {
        this.setCmp_def(cmp_def);
        return this;
    }

    public void setCmp_def(String cmp_def) {
        this.cmp_def = cmp_def;
    }

    public String getCmp_ena() {
        return this.cmp_ena;
    }

    public DicionarioColunas cmp_ena(String cmp_ena) {
        this.setCmp_ena(cmp_ena);
        return this;
    }

    public void setCmp_ena(String cmp_ena) {
        this.cmp_ena = cmp_ena;
    }

    public String getCmp_obr() {
        return this.cmp_obr;
    }

    public DicionarioColunas cmp_obr(String cmp_obr) {
        this.setCmp_obr(cmp_obr);
        return this;
    }

    public void setCmp_obr(String cmp_obr) {
        this.cmp_obr = cmp_obr;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DicionarioColunas)) {
            return false;
        }
        return id != null && id.equals(((DicionarioColunas) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DicionarioColunas{" +
            "id=" + getId() +
            ", cmp_nom='" + getCmp_nom() + "'" +
            ", cmp_des='" + getCmp_des() + "'" +
            ", cmp_tip='" + getCmp_tip() + "'" +
            ", cmp_tam=" + getCmp_tam() +
            ", cmp_dec=" + getCmp_dec() +
            ", atz_tip='" + getAtz_tip() + "'" +
            ", cmp_pic='" + getCmp_pic() + "'" +
            ", cmp_val='" + getCmp_val() + "'" +
            ", atz_rot='" + getAtz_rot() + "'" +
            ", tab_cns='" + getTab_cns() + "'" +
            ", cmp_cod='" + getCmp_cod() + "'" +
            ", cmp_cns='" + getCmp_cns() + "'" +
            ", atz_alt='" + getAtz_alt() + "'" +
            ", cha_pri='" + getCha_pri() + "'" +
            ", act_nul='" + getAct_nul() + "'" +
            ", cmp_def='" + getCmp_def() + "'" +
            ", cmp_ena='" + getCmp_ena() + "'" +
            ", cmp_obr='" + getCmp_obr() + "'" +
            "}";
    }
}
