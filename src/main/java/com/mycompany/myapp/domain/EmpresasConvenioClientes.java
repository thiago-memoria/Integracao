package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A EmpresasConvenioClientes.
 */
@Entity
@Table(name = "empresas_convenio_clientes")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EmpresasConvenioClientes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "con_nom")
    private String con_nom;

    @Column(name = "con_cnt")
    private String con_cnt;

    @Column(name = "con_tel")
    private Integer con_tel;

    @Column(name = "con_dia")
    private String con_dia;

    @Column(name = "con_des", precision = 21, scale = 2)
    private BigDecimal con_des;

    @Column(name = "con_via")
    private String con_via;

    @Column(name = "con_exp")
    private String con_exp;

    @Column(name = "con_req")
    private String con_req;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "con_ccd")
    private String con_ccd;

    @Column(name = "con_adm")
    private String con_adm;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public EmpresasConvenioClientes id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCon_nom() {
        return this.con_nom;
    }

    public EmpresasConvenioClientes con_nom(String con_nom) {
        this.setCon_nom(con_nom);
        return this;
    }

    public void setCon_nom(String con_nom) {
        this.con_nom = con_nom;
    }

    public String getCon_cnt() {
        return this.con_cnt;
    }

    public EmpresasConvenioClientes con_cnt(String con_cnt) {
        this.setCon_cnt(con_cnt);
        return this;
    }

    public void setCon_cnt(String con_cnt) {
        this.con_cnt = con_cnt;
    }

    public Integer getCon_tel() {
        return this.con_tel;
    }

    public EmpresasConvenioClientes con_tel(Integer con_tel) {
        this.setCon_tel(con_tel);
        return this;
    }

    public void setCon_tel(Integer con_tel) {
        this.con_tel = con_tel;
    }

    public String getCon_dia() {
        return this.con_dia;
    }

    public EmpresasConvenioClientes con_dia(String con_dia) {
        this.setCon_dia(con_dia);
        return this;
    }

    public void setCon_dia(String con_dia) {
        this.con_dia = con_dia;
    }

    public BigDecimal getCon_des() {
        return this.con_des;
    }

    public EmpresasConvenioClientes con_des(BigDecimal con_des) {
        this.setCon_des(con_des);
        return this;
    }

    public void setCon_des(BigDecimal con_des) {
        this.con_des = con_des;
    }

    public String getCon_via() {
        return this.con_via;
    }

    public EmpresasConvenioClientes con_via(String con_via) {
        this.setCon_via(con_via);
        return this;
    }

    public void setCon_via(String con_via) {
        this.con_via = con_via;
    }

    public String getCon_exp() {
        return this.con_exp;
    }

    public EmpresasConvenioClientes con_exp(String con_exp) {
        this.setCon_exp(con_exp);
        return this;
    }

    public void setCon_exp(String con_exp) {
        this.con_exp = con_exp;
    }

    public String getCon_req() {
        return this.con_req;
    }

    public EmpresasConvenioClientes con_req(String con_req) {
        this.setCon_req(con_req);
        return this;
    }

    public void setCon_req(String con_req) {
        this.con_req = con_req;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public EmpresasConvenioClientes cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public String getCon_ccd() {
        return this.con_ccd;
    }

    public EmpresasConvenioClientes con_ccd(String con_ccd) {
        this.setCon_ccd(con_ccd);
        return this;
    }

    public void setCon_ccd(String con_ccd) {
        this.con_ccd = con_ccd;
    }

    public String getCon_adm() {
        return this.con_adm;
    }

    public EmpresasConvenioClientes con_adm(String con_adm) {
        this.setCon_adm(con_adm);
        return this;
    }

    public void setCon_adm(String con_adm) {
        this.con_adm = con_adm;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public EmpresasConvenioClientes funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmpresasConvenioClientes)) {
            return false;
        }
        return id != null && id.equals(((EmpresasConvenioClientes) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "EmpresasConvenioClientes{" +
            "id=" + getId() +
            ", con_nom='" + getCon_nom() + "'" +
            ", con_cnt='" + getCon_cnt() + "'" +
            ", con_tel=" + getCon_tel() +
            ", con_dia='" + getCon_dia() + "'" +
            ", con_des=" + getCon_des() +
            ", con_via='" + getCon_via() + "'" +
            ", con_exp='" + getCon_exp() + "'" +
            ", con_req='" + getCon_req() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", con_ccd='" + getCon_ccd() + "'" +
            ", con_adm='" + getCon_adm() + "'" +
            "}";
    }
}
