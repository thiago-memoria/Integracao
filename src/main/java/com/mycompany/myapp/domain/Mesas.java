package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A Mesas.
 */
@Entity
@Table(name = "mesas")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "mes_loc")
    private String mes_loc;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "cad_exc")
    private String cad_exc;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Mesas id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMes_loc() {
        return this.mes_loc;
    }

    public Mesas mes_loc(String mes_loc) {
        this.setMes_loc(mes_loc);
        return this;
    }

    public void setMes_loc(String mes_loc) {
        this.mes_loc = mes_loc;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public Mesas cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public String getCad_exc() {
        return this.cad_exc;
    }

    public Mesas cad_exc(String cad_exc) {
        this.setCad_exc(cad_exc);
        return this;
    }

    public void setCad_exc(String cad_exc) {
        this.cad_exc = cad_exc;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mesas)) {
            return false;
        }
        return id != null && id.equals(((Mesas) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Mesas{" +
            "id=" + getId() +
            ", mes_loc='" + getMes_loc() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", cad_exc='" + getCad_exc() + "'" +
            "}";
    }
}
