package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A Medico.
 */
@Entity
@Table(name = "medico")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "med_nom")
    private String med_nom;

    @Column(name = "med_end")
    private String med_end;

    @Column(name = "med_bai")
    private String med_bai;

    @Column(name = "med_cid")
    private String med_cid;

    @Column(name = "med_est")
    private String med_est;

    @Column(name = "med_cep")
    private Integer med_cep;

    @Column(name = "med_tel")
    private Integer med_tel;

    @Column(name = "med_dtn")
    private LocalDate med_dtn;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "med_ufc")
    private String med_ufc;

    @Column(name = "med_fax")
    private Integer med_fax;

    @Column(name = "med_num")
    private String med_num;

    @Column(name = "med_cpl")
    private String med_cpl;

    @Column(name = "med_ema")
    private String med_ema;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    @ManyToOne
    @JsonIgnoreProperties(value = { "funcionariosEmpresa" }, allowSetters = true)
    private EspecialidadesMedicas especialidadesMedicas;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Medico id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMed_nom() {
        return this.med_nom;
    }

    public Medico med_nom(String med_nom) {
        this.setMed_nom(med_nom);
        return this;
    }

    public void setMed_nom(String med_nom) {
        this.med_nom = med_nom;
    }

    public String getMed_end() {
        return this.med_end;
    }

    public Medico med_end(String med_end) {
        this.setMed_end(med_end);
        return this;
    }

    public void setMed_end(String med_end) {
        this.med_end = med_end;
    }

    public String getMed_bai() {
        return this.med_bai;
    }

    public Medico med_bai(String med_bai) {
        this.setMed_bai(med_bai);
        return this;
    }

    public void setMed_bai(String med_bai) {
        this.med_bai = med_bai;
    }

    public String getMed_cid() {
        return this.med_cid;
    }

    public Medico med_cid(String med_cid) {
        this.setMed_cid(med_cid);
        return this;
    }

    public void setMed_cid(String med_cid) {
        this.med_cid = med_cid;
    }

    public String getMed_est() {
        return this.med_est;
    }

    public Medico med_est(String med_est) {
        this.setMed_est(med_est);
        return this;
    }

    public void setMed_est(String med_est) {
        this.med_est = med_est;
    }

    public Integer getMed_cep() {
        return this.med_cep;
    }

    public Medico med_cep(Integer med_cep) {
        this.setMed_cep(med_cep);
        return this;
    }

    public void setMed_cep(Integer med_cep) {
        this.med_cep = med_cep;
    }

    public Integer getMed_tel() {
        return this.med_tel;
    }

    public Medico med_tel(Integer med_tel) {
        this.setMed_tel(med_tel);
        return this;
    }

    public void setMed_tel(Integer med_tel) {
        this.med_tel = med_tel;
    }

    public LocalDate getMed_dtn() {
        return this.med_dtn;
    }

    public Medico med_dtn(LocalDate med_dtn) {
        this.setMed_dtn(med_dtn);
        return this;
    }

    public void setMed_dtn(LocalDate med_dtn) {
        this.med_dtn = med_dtn;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public Medico cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public String getMed_ufc() {
        return this.med_ufc;
    }

    public Medico med_ufc(String med_ufc) {
        this.setMed_ufc(med_ufc);
        return this;
    }

    public void setMed_ufc(String med_ufc) {
        this.med_ufc = med_ufc;
    }

    public Integer getMed_fax() {
        return this.med_fax;
    }

    public Medico med_fax(Integer med_fax) {
        this.setMed_fax(med_fax);
        return this;
    }

    public void setMed_fax(Integer med_fax) {
        this.med_fax = med_fax;
    }

    public String getMed_num() {
        return this.med_num;
    }

    public Medico med_num(String med_num) {
        this.setMed_num(med_num);
        return this;
    }

    public void setMed_num(String med_num) {
        this.med_num = med_num;
    }

    public String getMed_cpl() {
        return this.med_cpl;
    }

    public Medico med_cpl(String med_cpl) {
        this.setMed_cpl(med_cpl);
        return this;
    }

    public void setMed_cpl(String med_cpl) {
        this.med_cpl = med_cpl;
    }

    public String getMed_ema() {
        return this.med_ema;
    }

    public Medico med_ema(String med_ema) {
        this.setMed_ema(med_ema);
        return this;
    }

    public void setMed_ema(String med_ema) {
        this.med_ema = med_ema;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public Medico funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    public EspecialidadesMedicas getEspecialidadesMedicas() {
        return this.especialidadesMedicas;
    }

    public void setEspecialidadesMedicas(EspecialidadesMedicas especialidadesMedicas) {
        this.especialidadesMedicas = especialidadesMedicas;
    }

    public Medico especialidadesMedicas(EspecialidadesMedicas especialidadesMedicas) {
        this.setEspecialidadesMedicas(especialidadesMedicas);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Medico)) {
            return false;
        }
        return id != null && id.equals(((Medico) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Medico{" +
            "id=" + getId() +
            ", med_nom='" + getMed_nom() + "'" +
            ", med_end='" + getMed_end() + "'" +
            ", med_bai='" + getMed_bai() + "'" +
            ", med_cid='" + getMed_cid() + "'" +
            ", med_est='" + getMed_est() + "'" +
            ", med_cep=" + getMed_cep() +
            ", med_tel=" + getMed_tel() +
            ", med_dtn='" + getMed_dtn() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", med_ufc='" + getMed_ufc() + "'" +
            ", med_fax=" + getMed_fax() +
            ", med_num='" + getMed_num() + "'" +
            ", med_cpl='" + getMed_cpl() + "'" +
            ", med_ema='" + getMed_ema() + "'" +
            "}";
    }
}
