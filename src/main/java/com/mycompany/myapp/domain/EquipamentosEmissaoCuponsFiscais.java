package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A EquipamentosEmissaoCuponsFiscais.
 */
@Entity
@Table(name = "equipamentos_emissao_cupons_fiscais")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EquipamentosEmissaoCuponsFiscais implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "ecf_mar")
    private String ecf_mar;

    @Column(name = "ecf_mod")
    private String ecf_mod;

    @Column(name = "ecf_tip")
    private String ecf_tip;

    @Column(name = "ecf_nfa")
    private String ecf_nfa;

    @Column(name = "ecf_por")
    private String ecf_por;

    @Column(name = "ecf_cni")
    private String ecf_cni;

    @Column(name = "ecf_vsb")
    private String ecf_vsb;

    @Column(name = "ecf_dsb")
    private String ecf_dsb;

    @Column(name = "ecf_hsb")
    private String ecf_hsb;

    @Column(name = "ecf_lot")
    private String ecf_lot;

    @Column(name = "ecf_pre")
    private String ecf_pre;

    @Column(name = "ecf_dav")
    private String ecf_dav;

    @Column(name = "ecf_dnf")
    private String ecf_dnf;

    @Column(name = "ecf_mfa")
    private String ecf_mfa;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "ecf_usu")
    private Integer ecf_usu;

    @Column(name = "ecf_tgt")
    private String ecf_tgt;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public EquipamentosEmissaoCuponsFiscais id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEcf_mar() {
        return this.ecf_mar;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_mar(String ecf_mar) {
        this.setEcf_mar(ecf_mar);
        return this;
    }

    public void setEcf_mar(String ecf_mar) {
        this.ecf_mar = ecf_mar;
    }

    public String getEcf_mod() {
        return this.ecf_mod;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_mod(String ecf_mod) {
        this.setEcf_mod(ecf_mod);
        return this;
    }

    public void setEcf_mod(String ecf_mod) {
        this.ecf_mod = ecf_mod;
    }

    public String getEcf_tip() {
        return this.ecf_tip;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_tip(String ecf_tip) {
        this.setEcf_tip(ecf_tip);
        return this;
    }

    public void setEcf_tip(String ecf_tip) {
        this.ecf_tip = ecf_tip;
    }

    public String getEcf_nfa() {
        return this.ecf_nfa;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_nfa(String ecf_nfa) {
        this.setEcf_nfa(ecf_nfa);
        return this;
    }

    public void setEcf_nfa(String ecf_nfa) {
        this.ecf_nfa = ecf_nfa;
    }

    public String getEcf_por() {
        return this.ecf_por;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_por(String ecf_por) {
        this.setEcf_por(ecf_por);
        return this;
    }

    public void setEcf_por(String ecf_por) {
        this.ecf_por = ecf_por;
    }

    public String getEcf_cni() {
        return this.ecf_cni;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_cni(String ecf_cni) {
        this.setEcf_cni(ecf_cni);
        return this;
    }

    public void setEcf_cni(String ecf_cni) {
        this.ecf_cni = ecf_cni;
    }

    public String getEcf_vsb() {
        return this.ecf_vsb;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_vsb(String ecf_vsb) {
        this.setEcf_vsb(ecf_vsb);
        return this;
    }

    public void setEcf_vsb(String ecf_vsb) {
        this.ecf_vsb = ecf_vsb;
    }

    public String getEcf_dsb() {
        return this.ecf_dsb;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_dsb(String ecf_dsb) {
        this.setEcf_dsb(ecf_dsb);
        return this;
    }

    public void setEcf_dsb(String ecf_dsb) {
        this.ecf_dsb = ecf_dsb;
    }

    public String getEcf_hsb() {
        return this.ecf_hsb;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_hsb(String ecf_hsb) {
        this.setEcf_hsb(ecf_hsb);
        return this;
    }

    public void setEcf_hsb(String ecf_hsb) {
        this.ecf_hsb = ecf_hsb;
    }

    public String getEcf_lot() {
        return this.ecf_lot;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_lot(String ecf_lot) {
        this.setEcf_lot(ecf_lot);
        return this;
    }

    public void setEcf_lot(String ecf_lot) {
        this.ecf_lot = ecf_lot;
    }

    public String getEcf_pre() {
        return this.ecf_pre;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_pre(String ecf_pre) {
        this.setEcf_pre(ecf_pre);
        return this;
    }

    public void setEcf_pre(String ecf_pre) {
        this.ecf_pre = ecf_pre;
    }

    public String getEcf_dav() {
        return this.ecf_dav;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_dav(String ecf_dav) {
        this.setEcf_dav(ecf_dav);
        return this;
    }

    public void setEcf_dav(String ecf_dav) {
        this.ecf_dav = ecf_dav;
    }

    public String getEcf_dnf() {
        return this.ecf_dnf;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_dnf(String ecf_dnf) {
        this.setEcf_dnf(ecf_dnf);
        return this;
    }

    public void setEcf_dnf(String ecf_dnf) {
        this.ecf_dnf = ecf_dnf;
    }

    public String getEcf_mfa() {
        return this.ecf_mfa;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_mfa(String ecf_mfa) {
        this.setEcf_mfa(ecf_mfa);
        return this;
    }

    public void setEcf_mfa(String ecf_mfa) {
        this.ecf_mfa = ecf_mfa;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public EquipamentosEmissaoCuponsFiscais cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public Integer getEcf_usu() {
        return this.ecf_usu;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_usu(Integer ecf_usu) {
        this.setEcf_usu(ecf_usu);
        return this;
    }

    public void setEcf_usu(Integer ecf_usu) {
        this.ecf_usu = ecf_usu;
    }

    public String getEcf_tgt() {
        return this.ecf_tgt;
    }

    public EquipamentosEmissaoCuponsFiscais ecf_tgt(String ecf_tgt) {
        this.setEcf_tgt(ecf_tgt);
        return this;
    }

    public void setEcf_tgt(String ecf_tgt) {
        this.ecf_tgt = ecf_tgt;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public EquipamentosEmissaoCuponsFiscais funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EquipamentosEmissaoCuponsFiscais)) {
            return false;
        }
        return id != null && id.equals(((EquipamentosEmissaoCuponsFiscais) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "EquipamentosEmissaoCuponsFiscais{" +
            "id=" + getId() +
            ", ecf_mar='" + getEcf_mar() + "'" +
            ", ecf_mod='" + getEcf_mod() + "'" +
            ", ecf_tip='" + getEcf_tip() + "'" +
            ", ecf_nfa='" + getEcf_nfa() + "'" +
            ", ecf_por='" + getEcf_por() + "'" +
            ", ecf_cni='" + getEcf_cni() + "'" +
            ", ecf_vsb='" + getEcf_vsb() + "'" +
            ", ecf_dsb='" + getEcf_dsb() + "'" +
            ", ecf_hsb='" + getEcf_hsb() + "'" +
            ", ecf_lot='" + getEcf_lot() + "'" +
            ", ecf_pre='" + getEcf_pre() + "'" +
            ", ecf_dav='" + getEcf_dav() + "'" +
            ", ecf_dnf='" + getEcf_dnf() + "'" +
            ", ecf_mfa='" + getEcf_mfa() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", ecf_usu=" + getEcf_usu() +
            ", ecf_tgt='" + getEcf_tgt() + "'" +
            "}";
    }
}
