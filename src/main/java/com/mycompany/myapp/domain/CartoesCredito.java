package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A CartoesCredito.
 */
@Entity
@Table(name = "cartoes_credito")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CartoesCredito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "car_nom")
    private String car_nom;

    @Column(name = "car_cnt")
    private String car_cnt;

    @Column(name = "car_tel")
    private Integer car_tel;

    @Column(name = "car_dia")
    private Integer car_dia;

    @Column(name = "car_jur", precision = 21, scale = 2)
    private BigDecimal car_jur;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "car_pra")
    private Integer car_pra;

    @Column(name = "car_adm")
    private String car_adm;

    @Column(name = "car_ccr")
    private String car_ccr;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public CartoesCredito id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCar_nom() {
        return this.car_nom;
    }

    public CartoesCredito car_nom(String car_nom) {
        this.setCar_nom(car_nom);
        return this;
    }

    public void setCar_nom(String car_nom) {
        this.car_nom = car_nom;
    }

    public String getCar_cnt() {
        return this.car_cnt;
    }

    public CartoesCredito car_cnt(String car_cnt) {
        this.setCar_cnt(car_cnt);
        return this;
    }

    public void setCar_cnt(String car_cnt) {
        this.car_cnt = car_cnt;
    }

    public Integer getCar_tel() {
        return this.car_tel;
    }

    public CartoesCredito car_tel(Integer car_tel) {
        this.setCar_tel(car_tel);
        return this;
    }

    public void setCar_tel(Integer car_tel) {
        this.car_tel = car_tel;
    }

    public Integer getCar_dia() {
        return this.car_dia;
    }

    public CartoesCredito car_dia(Integer car_dia) {
        this.setCar_dia(car_dia);
        return this;
    }

    public void setCar_dia(Integer car_dia) {
        this.car_dia = car_dia;
    }

    public BigDecimal getCar_jur() {
        return this.car_jur;
    }

    public CartoesCredito car_jur(BigDecimal car_jur) {
        this.setCar_jur(car_jur);
        return this;
    }

    public void setCar_jur(BigDecimal car_jur) {
        this.car_jur = car_jur;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public CartoesCredito cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public Integer getCar_pra() {
        return this.car_pra;
    }

    public CartoesCredito car_pra(Integer car_pra) {
        this.setCar_pra(car_pra);
        return this;
    }

    public void setCar_pra(Integer car_pra) {
        this.car_pra = car_pra;
    }

    public String getCar_adm() {
        return this.car_adm;
    }

    public CartoesCredito car_adm(String car_adm) {
        this.setCar_adm(car_adm);
        return this;
    }

    public void setCar_adm(String car_adm) {
        this.car_adm = car_adm;
    }

    public String getCar_ccr() {
        return this.car_ccr;
    }

    public CartoesCredito car_ccr(String car_ccr) {
        this.setCar_ccr(car_ccr);
        return this;
    }

    public void setCar_ccr(String car_ccr) {
        this.car_ccr = car_ccr;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public CartoesCredito funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CartoesCredito)) {
            return false;
        }
        return id != null && id.equals(((CartoesCredito) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CartoesCredito{" +
            "id=" + getId() +
            ", car_nom='" + getCar_nom() + "'" +
            ", car_cnt='" + getCar_cnt() + "'" +
            ", car_tel=" + getCar_tel() +
            ", car_dia=" + getCar_dia() +
            ", car_jur=" + getCar_jur() +
            ", cad_dat='" + getCad_dat() + "'" +
            ", car_pra=" + getCar_pra() +
            ", car_adm='" + getCar_adm() + "'" +
            ", car_ccr='" + getCar_ccr() + "'" +
            "}";
    }
}
