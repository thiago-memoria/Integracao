package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A EspecialidadesMedicas.
 */
@Entity
@Table(name = "especialidades_medicas")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EspecialidadesMedicas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "esp_des")
    private String esp_des;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public EspecialidadesMedicas id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEsp_des() {
        return this.esp_des;
    }

    public EspecialidadesMedicas esp_des(String esp_des) {
        this.setEsp_des(esp_des);
        return this;
    }

    public void setEsp_des(String esp_des) {
        this.esp_des = esp_des;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public EspecialidadesMedicas cad_dat(LocalDate cad_dat) {
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

    public EspecialidadesMedicas funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EspecialidadesMedicas)) {
            return false;
        }
        return id != null && id.equals(((EspecialidadesMedicas) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "EspecialidadesMedicas{" +
            "id=" + getId() +
            ", esp_des='" + getEsp_des() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            "}";
    }
}
