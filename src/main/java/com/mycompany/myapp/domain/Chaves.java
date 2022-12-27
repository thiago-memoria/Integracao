package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Chaves.
 */
@Entity
@Table(name = "chaves")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Chaves implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "cha_nom")
    private String cha_nom;

    @Column(name = "cha_abr")
    private String cha_abr;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Chaves id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCha_nom() {
        return this.cha_nom;
    }

    public Chaves cha_nom(String cha_nom) {
        this.setCha_nom(cha_nom);
        return this;
    }

    public void setCha_nom(String cha_nom) {
        this.cha_nom = cha_nom;
    }

    public String getCha_abr() {
        return this.cha_abr;
    }

    public Chaves cha_abr(String cha_abr) {
        this.setCha_abr(cha_abr);
        return this;
    }

    public void setCha_abr(String cha_abr) {
        this.cha_abr = cha_abr;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Chaves)) {
            return false;
        }
        return id != null && id.equals(((Chaves) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Chaves{" +
            "id=" + getId() +
            ", cha_nom='" + getCha_nom() + "'" +
            ", cha_abr='" + getCha_abr() + "'" +
            "}";
    }
}
