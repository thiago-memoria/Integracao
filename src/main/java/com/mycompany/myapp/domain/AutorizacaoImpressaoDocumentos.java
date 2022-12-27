package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A AutorizacaoImpressaoDocumentos.
 */
@Entity
@Table(name = "autorizacao_impressao_documentos")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AutorizacaoImpressaoDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "aid_num")
    private String aid_num;

    @Column(name = "aid_ini")
    private Integer aid_ini;

    @Column(name = "aid_fin")
    private Integer aid_fin;

    @Column(name = "cad_fun")
    private Integer cad_fun;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public AutorizacaoImpressaoDocumentos id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAid_num() {
        return this.aid_num;
    }

    public AutorizacaoImpressaoDocumentos aid_num(String aid_num) {
        this.setAid_num(aid_num);
        return this;
    }

    public void setAid_num(String aid_num) {
        this.aid_num = aid_num;
    }

    public Integer getAid_ini() {
        return this.aid_ini;
    }

    public AutorizacaoImpressaoDocumentos aid_ini(Integer aid_ini) {
        this.setAid_ini(aid_ini);
        return this;
    }

    public void setAid_ini(Integer aid_ini) {
        this.aid_ini = aid_ini;
    }

    public Integer getAid_fin() {
        return this.aid_fin;
    }

    public AutorizacaoImpressaoDocumentos aid_fin(Integer aid_fin) {
        this.setAid_fin(aid_fin);
        return this;
    }

    public void setAid_fin(Integer aid_fin) {
        this.aid_fin = aid_fin;
    }

    public Integer getCad_fun() {
        return this.cad_fun;
    }

    public AutorizacaoImpressaoDocumentos cad_fun(Integer cad_fun) {
        this.setCad_fun(cad_fun);
        return this;
    }

    public void setCad_fun(Integer cad_fun) {
        this.cad_fun = cad_fun;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public AutorizacaoImpressaoDocumentos cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutorizacaoImpressaoDocumentos)) {
            return false;
        }
        return id != null && id.equals(((AutorizacaoImpressaoDocumentos) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AutorizacaoImpressaoDocumentos{" +
            "id=" + getId() +
            ", aid_num='" + getAid_num() + "'" +
            ", aid_ini=" + getAid_ini() +
            ", aid_fin=" + getAid_fin() +
            ", cad_fun=" + getCad_fun() +
            ", cad_dat='" + getCad_dat() + "'" +
            "}";
    }
}
