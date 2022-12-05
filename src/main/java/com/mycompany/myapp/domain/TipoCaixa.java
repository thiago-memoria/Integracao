package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.persistence.*;

/**
 * A TipoCaixa.
 */
@Entity
@Table(name = "tipo_caixa")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TipoCaixa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "att_1")
    private String att1;

    @Column(name = "att_2")
    private Integer att2;

    @Column(name = "att_3")
    private Long att3;

    @Column(name = "att_4")
    private Float att4;

    @Column(name = "att_5")
    private Double att5;

    @Column(name = "att_6", precision = 21, scale = 2)
    private BigDecimal att6;

    @Column(name = "att_7")
    private LocalDate att7;

    @Column(name = "att_8")
    private Instant att8;

    @Column(name = "att_9")
    private ZonedDateTime att9;

    @Column(name = "att_10")
    private Duration att10;

    @Column(name = "att_11")
    private Boolean att11;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public TipoCaixa id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAtt1() {
        return this.att1;
    }

    public TipoCaixa att1(String att1) {
        this.setAtt1(att1);
        return this;
    }

    public void setAtt1(String att1) {
        this.att1 = att1;
    }

    public Integer getAtt2() {
        return this.att2;
    }

    public TipoCaixa att2(Integer att2) {
        this.setAtt2(att2);
        return this;
    }

    public void setAtt2(Integer att2) {
        this.att2 = att2;
    }

    public Long getAtt3() {
        return this.att3;
    }

    public TipoCaixa att3(Long att3) {
        this.setAtt3(att3);
        return this;
    }

    public void setAtt3(Long att3) {
        this.att3 = att3;
    }

    public Float getAtt4() {
        return this.att4;
    }

    public TipoCaixa att4(Float att4) {
        this.setAtt4(att4);
        return this;
    }

    public void setAtt4(Float att4) {
        this.att4 = att4;
    }

    public Double getAtt5() {
        return this.att5;
    }

    public TipoCaixa att5(Double att5) {
        this.setAtt5(att5);
        return this;
    }

    public void setAtt5(Double att5) {
        this.att5 = att5;
    }

    public BigDecimal getAtt6() {
        return this.att6;
    }

    public TipoCaixa att6(BigDecimal att6) {
        this.setAtt6(att6);
        return this;
    }

    public void setAtt6(BigDecimal att6) {
        this.att6 = att6;
    }

    public LocalDate getAtt7() {
        return this.att7;
    }

    public TipoCaixa att7(LocalDate att7) {
        this.setAtt7(att7);
        return this;
    }

    public void setAtt7(LocalDate att7) {
        this.att7 = att7;
    }

    public Instant getAtt8() {
        return this.att8;
    }

    public TipoCaixa att8(Instant att8) {
        this.setAtt8(att8);
        return this;
    }

    public void setAtt8(Instant att8) {
        this.att8 = att8;
    }

    public ZonedDateTime getAtt9() {
        return this.att9;
    }

    public TipoCaixa att9(ZonedDateTime att9) {
        this.setAtt9(att9);
        return this;
    }

    public void setAtt9(ZonedDateTime att9) {
        this.att9 = att9;
    }

    public Duration getAtt10() {
        return this.att10;
    }

    public TipoCaixa att10(Duration att10) {
        this.setAtt10(att10);
        return this;
    }

    public void setAtt10(Duration att10) {
        this.att10 = att10;
    }

    public Boolean getAtt11() {
        return this.att11;
    }

    public TipoCaixa att11(Boolean att11) {
        this.setAtt11(att11);
        return this;
    }

    public void setAtt11(Boolean att11) {
        this.att11 = att11;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TipoCaixa)) {
            return false;
        }
        return id != null && id.equals(((TipoCaixa) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TipoCaixa{" +
            "id=" + getId() +
            ", att1='" + getAtt1() + "'" +
            ", att2=" + getAtt2() +
            ", att3=" + getAtt3() +
            ", att4=" + getAtt4() +
            ", att5=" + getAtt5() +
            ", att6=" + getAtt6() +
            ", att7='" + getAtt7() + "'" +
            ", att8='" + getAtt8() + "'" +
            ", att9='" + getAtt9() + "'" +
            ", att10='" + getAtt10() + "'" +
            ", att11='" + getAtt11() + "'" +
            "}";
    }
}
