package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A Contadores.
 */
@Entity
@Table(name = "contadores")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Contadores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "ctb_nom")
    private String ctb_nom;

    @Column(name = "ctb_cpf")
    private String ctb_cpf;

    @Column(name = "ctb_crc")
    private String ctb_crc;

    @Column(name = "ctb_cgc")
    private String ctb_cgc;

    @Column(name = "ctb_end")
    private String ctb_end;

    @Column(name = "ctb_num")
    private String ctb_num;

    @Column(name = "ctb_cpl")
    private String ctb_cpl;

    @Column(name = "ctb_bai")
    private String ctb_bai;

    @Column(name = "ctb_est")
    private String ctb_est;

    @Column(name = "ctb_mun")
    private Integer ctb_mun;

    @Column(name = "ctb_tel")
    private String ctb_tel;

    @Column(name = "ctb_fax")
    private String ctb_fax;

    @Column(name = "ctb_ema")
    private String ctb_ema;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "ctb_cep")
    private String ctb_cep;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Contadores id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCtb_nom() {
        return this.ctb_nom;
    }

    public Contadores ctb_nom(String ctb_nom) {
        this.setCtb_nom(ctb_nom);
        return this;
    }

    public void setCtb_nom(String ctb_nom) {
        this.ctb_nom = ctb_nom;
    }

    public String getCtb_cpf() {
        return this.ctb_cpf;
    }

    public Contadores ctb_cpf(String ctb_cpf) {
        this.setCtb_cpf(ctb_cpf);
        return this;
    }

    public void setCtb_cpf(String ctb_cpf) {
        this.ctb_cpf = ctb_cpf;
    }

    public String getCtb_crc() {
        return this.ctb_crc;
    }

    public Contadores ctb_crc(String ctb_crc) {
        this.setCtb_crc(ctb_crc);
        return this;
    }

    public void setCtb_crc(String ctb_crc) {
        this.ctb_crc = ctb_crc;
    }

    public String getCtb_cgc() {
        return this.ctb_cgc;
    }

    public Contadores ctb_cgc(String ctb_cgc) {
        this.setCtb_cgc(ctb_cgc);
        return this;
    }

    public void setCtb_cgc(String ctb_cgc) {
        this.ctb_cgc = ctb_cgc;
    }

    public String getCtb_end() {
        return this.ctb_end;
    }

    public Contadores ctb_end(String ctb_end) {
        this.setCtb_end(ctb_end);
        return this;
    }

    public void setCtb_end(String ctb_end) {
        this.ctb_end = ctb_end;
    }

    public String getCtb_num() {
        return this.ctb_num;
    }

    public Contadores ctb_num(String ctb_num) {
        this.setCtb_num(ctb_num);
        return this;
    }

    public void setCtb_num(String ctb_num) {
        this.ctb_num = ctb_num;
    }

    public String getCtb_cpl() {
        return this.ctb_cpl;
    }

    public Contadores ctb_cpl(String ctb_cpl) {
        this.setCtb_cpl(ctb_cpl);
        return this;
    }

    public void setCtb_cpl(String ctb_cpl) {
        this.ctb_cpl = ctb_cpl;
    }

    public String getCtb_bai() {
        return this.ctb_bai;
    }

    public Contadores ctb_bai(String ctb_bai) {
        this.setCtb_bai(ctb_bai);
        return this;
    }

    public void setCtb_bai(String ctb_bai) {
        this.ctb_bai = ctb_bai;
    }

    public String getCtb_est() {
        return this.ctb_est;
    }

    public Contadores ctb_est(String ctb_est) {
        this.setCtb_est(ctb_est);
        return this;
    }

    public void setCtb_est(String ctb_est) {
        this.ctb_est = ctb_est;
    }

    public Integer getCtb_mun() {
        return this.ctb_mun;
    }

    public Contadores ctb_mun(Integer ctb_mun) {
        this.setCtb_mun(ctb_mun);
        return this;
    }

    public void setCtb_mun(Integer ctb_mun) {
        this.ctb_mun = ctb_mun;
    }

    public String getCtb_tel() {
        return this.ctb_tel;
    }

    public Contadores ctb_tel(String ctb_tel) {
        this.setCtb_tel(ctb_tel);
        return this;
    }

    public void setCtb_tel(String ctb_tel) {
        this.ctb_tel = ctb_tel;
    }

    public String getCtb_fax() {
        return this.ctb_fax;
    }

    public Contadores ctb_fax(String ctb_fax) {
        this.setCtb_fax(ctb_fax);
        return this;
    }

    public void setCtb_fax(String ctb_fax) {
        this.ctb_fax = ctb_fax;
    }

    public String getCtb_ema() {
        return this.ctb_ema;
    }

    public Contadores ctb_ema(String ctb_ema) {
        this.setCtb_ema(ctb_ema);
        return this;
    }

    public void setCtb_ema(String ctb_ema) {
        this.ctb_ema = ctb_ema;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public Contadores cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public String getCtb_cep() {
        return this.ctb_cep;
    }

    public Contadores ctb_cep(String ctb_cep) {
        this.setCtb_cep(ctb_cep);
        return this;
    }

    public void setCtb_cep(String ctb_cep) {
        this.ctb_cep = ctb_cep;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public Contadores funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contadores)) {
            return false;
        }
        return id != null && id.equals(((Contadores) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Contadores{" +
            "id=" + getId() +
            ", ctb_nom='" + getCtb_nom() + "'" +
            ", ctb_cpf='" + getCtb_cpf() + "'" +
            ", ctb_crc='" + getCtb_crc() + "'" +
            ", ctb_cgc='" + getCtb_cgc() + "'" +
            ", ctb_end='" + getCtb_end() + "'" +
            ", ctb_num='" + getCtb_num() + "'" +
            ", ctb_cpl='" + getCtb_cpl() + "'" +
            ", ctb_bai='" + getCtb_bai() + "'" +
            ", ctb_est='" + getCtb_est() + "'" +
            ", ctb_mun=" + getCtb_mun() +
            ", ctb_tel='" + getCtb_tel() + "'" +
            ", ctb_fax='" + getCtb_fax() + "'" +
            ", ctb_ema='" + getCtb_ema() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", ctb_cep='" + getCtb_cep() + "'" +
            "}";
    }
}
