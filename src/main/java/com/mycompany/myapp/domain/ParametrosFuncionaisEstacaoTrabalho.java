package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A ParametrosFuncionaisEstacaoTrabalho.
 */
@Entity
@Table(name = "parametros_funcionais_estacao_trabalho")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ParametrosFuncionaisEstacaoTrabalho implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public ParametrosFuncionaisEstacaoTrabalho id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParametrosFuncionaisEstacaoTrabalho)) {
            return false;
        }
        return id != null && id.equals(((ParametrosFuncionaisEstacaoTrabalho) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ParametrosFuncionaisEstacaoTrabalho{" +
            "id=" + getId() +
            "}";
    }
}
