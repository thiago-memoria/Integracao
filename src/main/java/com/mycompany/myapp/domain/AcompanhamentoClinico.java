package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A AcompanhamentoClinico.
 */
@Entity
@Table(name = "acompanhamento_clinico")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AcompanhamentoClinico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "cli_dat")
    private LocalDate cli_dat;

    @Column(name = "cli_pra")
    private String cli_pra;

    @Column(name = "cli_txg")
    private String cli_txg;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public AcompanhamentoClinico id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCli_dat() {
        return this.cli_dat;
    }

    public AcompanhamentoClinico cli_dat(LocalDate cli_dat) {
        this.setCli_dat(cli_dat);
        return this;
    }

    public void setCli_dat(LocalDate cli_dat) {
        this.cli_dat = cli_dat;
    }

    public String getCli_pra() {
        return this.cli_pra;
    }

    public AcompanhamentoClinico cli_pra(String cli_pra) {
        this.setCli_pra(cli_pra);
        return this;
    }

    public void setCli_pra(String cli_pra) {
        this.cli_pra = cli_pra;
    }

    public String getCli_txg() {
        return this.cli_txg;
    }

    public AcompanhamentoClinico cli_txg(String cli_txg) {
        this.setCli_txg(cli_txg);
        return this;
    }

    public void setCli_txg(String cli_txg) {
        this.cli_txg = cli_txg;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AcompanhamentoClinico)) {
            return false;
        }
        return id != null && id.equals(((AcompanhamentoClinico) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AcompanhamentoClinico{" +
            "id=" + getId() +
            ", cli_dat='" + getCli_dat() + "'" +
            ", cli_pra='" + getCli_pra() + "'" +
            ", cli_txg='" + getCli_txg() + "'" +
            "}";
    }
}
