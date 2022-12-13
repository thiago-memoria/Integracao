package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A TiposCaixa.
 */
@Entity
@Table(name = "tipos_caixa")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TiposCaixa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "age_nom")
    private String age_nom;

    @Column(name = "age_tip")
    private String age_tip;

    @Column(name = "age_fre")
    private String age_fre;

    @Column(name = "age_ret")
    private String age_ret;

    @Column(name = "moviment")
    private String moviment;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "age_con")
    private String age_con;

    @Column(name = "age_bbc")
    private Integer age_bbc;

    @Column(name = "age_bbd")
    private Integer age_bbd;

    @Column(name = "age_bbn")
    private String age_bbn;

    @Column(name = "age_bag")
    private String age_bag;

    @Column(name = "age_bad")
    private String age_bad;

    @Column(name = "age_bct")
    private String age_bct;

    @Column(name = "age_bcd")
    private String age_bcd;

    @Column(name = "age_bcc")
    private String age_bcc;

    @Column(name = "age_bcv")
    private String age_bcv;

    @Column(name = "age_bmo")
    private String age_bmo;

    @Column(name = "age_bti")
    private String age_bti;

    @Column(name = "age_bac")
    private String age_bac;

    @Column(name = "age_bre")
    private Integer age_bre;

    @Column(name = "age_btc")
    private String age_btc;

    @Column(name = "age_bca")
    private String age_bca;

    @Column(name = "age_bvm", precision = 21, scale = 2)
    private BigDecimal age_bvm;

    @Column(name = "age_bju")
    private String age_bju;

    @Column(name = "age_blp")
    private String age_blp;

    @Column(name = "age_bmg")
    private String age_bmg;

    @Column(name = "age_bi_1")
    private String age_bi1;

    @Column(name = "age_bi_2")
    private String age_bi2;

    @Column(name = "age_bsq")
    private Integer age_bsq;

    @Column(name = "age_bnu")
    private Integer age_bnu;

    @ManyToOne
    private FuncionariosEmpresa funcionariosEmpresa;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public TiposCaixa id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge_nom() {
        return this.age_nom;
    }

    public TiposCaixa age_nom(String age_nom) {
        this.setAge_nom(age_nom);
        return this;
    }

    public void setAge_nom(String age_nom) {
        this.age_nom = age_nom;
    }

    public String getAge_tip() {
        return this.age_tip;
    }

    public TiposCaixa age_tip(String age_tip) {
        this.setAge_tip(age_tip);
        return this;
    }

    public void setAge_tip(String age_tip) {
        this.age_tip = age_tip;
    }

    public String getAge_fre() {
        return this.age_fre;
    }

    public TiposCaixa age_fre(String age_fre) {
        this.setAge_fre(age_fre);
        return this;
    }

    public void setAge_fre(String age_fre) {
        this.age_fre = age_fre;
    }

    public String getAge_ret() {
        return this.age_ret;
    }

    public TiposCaixa age_ret(String age_ret) {
        this.setAge_ret(age_ret);
        return this;
    }

    public void setAge_ret(String age_ret) {
        this.age_ret = age_ret;
    }

    public String getMoviment() {
        return this.moviment;
    }

    public TiposCaixa moviment(String moviment) {
        this.setMoviment(moviment);
        return this;
    }

    public void setMoviment(String moviment) {
        this.moviment = moviment;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public TiposCaixa cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public String getAge_con() {
        return this.age_con;
    }

    public TiposCaixa age_con(String age_con) {
        this.setAge_con(age_con);
        return this;
    }

    public void setAge_con(String age_con) {
        this.age_con = age_con;
    }

    public Integer getAge_bbc() {
        return this.age_bbc;
    }

    public TiposCaixa age_bbc(Integer age_bbc) {
        this.setAge_bbc(age_bbc);
        return this;
    }

    public void setAge_bbc(Integer age_bbc) {
        this.age_bbc = age_bbc;
    }

    public Integer getAge_bbd() {
        return this.age_bbd;
    }

    public TiposCaixa age_bbd(Integer age_bbd) {
        this.setAge_bbd(age_bbd);
        return this;
    }

    public void setAge_bbd(Integer age_bbd) {
        this.age_bbd = age_bbd;
    }

    public String getAge_bbn() {
        return this.age_bbn;
    }

    public TiposCaixa age_bbn(String age_bbn) {
        this.setAge_bbn(age_bbn);
        return this;
    }

    public void setAge_bbn(String age_bbn) {
        this.age_bbn = age_bbn;
    }

    public String getAge_bag() {
        return this.age_bag;
    }

    public TiposCaixa age_bag(String age_bag) {
        this.setAge_bag(age_bag);
        return this;
    }

    public void setAge_bag(String age_bag) {
        this.age_bag = age_bag;
    }

    public String getAge_bad() {
        return this.age_bad;
    }

    public TiposCaixa age_bad(String age_bad) {
        this.setAge_bad(age_bad);
        return this;
    }

    public void setAge_bad(String age_bad) {
        this.age_bad = age_bad;
    }

    public String getAge_bct() {
        return this.age_bct;
    }

    public TiposCaixa age_bct(String age_bct) {
        this.setAge_bct(age_bct);
        return this;
    }

    public void setAge_bct(String age_bct) {
        this.age_bct = age_bct;
    }

    public String getAge_bcd() {
        return this.age_bcd;
    }

    public TiposCaixa age_bcd(String age_bcd) {
        this.setAge_bcd(age_bcd);
        return this;
    }

    public void setAge_bcd(String age_bcd) {
        this.age_bcd = age_bcd;
    }

    public String getAge_bcc() {
        return this.age_bcc;
    }

    public TiposCaixa age_bcc(String age_bcc) {
        this.setAge_bcc(age_bcc);
        return this;
    }

    public void setAge_bcc(String age_bcc) {
        this.age_bcc = age_bcc;
    }

    public String getAge_bcv() {
        return this.age_bcv;
    }

    public TiposCaixa age_bcv(String age_bcv) {
        this.setAge_bcv(age_bcv);
        return this;
    }

    public void setAge_bcv(String age_bcv) {
        this.age_bcv = age_bcv;
    }

    public String getAge_bmo() {
        return this.age_bmo;
    }

    public TiposCaixa age_bmo(String age_bmo) {
        this.setAge_bmo(age_bmo);
        return this;
    }

    public void setAge_bmo(String age_bmo) {
        this.age_bmo = age_bmo;
    }

    public String getAge_bti() {
        return this.age_bti;
    }

    public TiposCaixa age_bti(String age_bti) {
        this.setAge_bti(age_bti);
        return this;
    }

    public void setAge_bti(String age_bti) {
        this.age_bti = age_bti;
    }

    public String getAge_bac() {
        return this.age_bac;
    }

    public TiposCaixa age_bac(String age_bac) {
        this.setAge_bac(age_bac);
        return this;
    }

    public void setAge_bac(String age_bac) {
        this.age_bac = age_bac;
    }

    public Integer getAge_bre() {
        return this.age_bre;
    }

    public TiposCaixa age_bre(Integer age_bre) {
        this.setAge_bre(age_bre);
        return this;
    }

    public void setAge_bre(Integer age_bre) {
        this.age_bre = age_bre;
    }

    public String getAge_btc() {
        return this.age_btc;
    }

    public TiposCaixa age_btc(String age_btc) {
        this.setAge_btc(age_btc);
        return this;
    }

    public void setAge_btc(String age_btc) {
        this.age_btc = age_btc;
    }

    public String getAge_bca() {
        return this.age_bca;
    }

    public TiposCaixa age_bca(String age_bca) {
        this.setAge_bca(age_bca);
        return this;
    }

    public void setAge_bca(String age_bca) {
        this.age_bca = age_bca;
    }

    public BigDecimal getAge_bvm() {
        return this.age_bvm;
    }

    public TiposCaixa age_bvm(BigDecimal age_bvm) {
        this.setAge_bvm(age_bvm);
        return this;
    }

    public void setAge_bvm(BigDecimal age_bvm) {
        this.age_bvm = age_bvm;
    }

    public String getAge_bju() {
        return this.age_bju;
    }

    public TiposCaixa age_bju(String age_bju) {
        this.setAge_bju(age_bju);
        return this;
    }

    public void setAge_bju(String age_bju) {
        this.age_bju = age_bju;
    }

    public String getAge_blp() {
        return this.age_blp;
    }

    public TiposCaixa age_blp(String age_blp) {
        this.setAge_blp(age_blp);
        return this;
    }

    public void setAge_blp(String age_blp) {
        this.age_blp = age_blp;
    }

    public String getAge_bmg() {
        return this.age_bmg;
    }

    public TiposCaixa age_bmg(String age_bmg) {
        this.setAge_bmg(age_bmg);
        return this;
    }

    public void setAge_bmg(String age_bmg) {
        this.age_bmg = age_bmg;
    }

    public String getAge_bi1() {
        return this.age_bi1;
    }

    public TiposCaixa age_bi1(String age_bi1) {
        this.setAge_bi1(age_bi1);
        return this;
    }

    public void setAge_bi1(String age_bi1) {
        this.age_bi1 = age_bi1;
    }

    public String getAge_bi2() {
        return this.age_bi2;
    }

    public TiposCaixa age_bi2(String age_bi2) {
        this.setAge_bi2(age_bi2);
        return this;
    }

    public void setAge_bi2(String age_bi2) {
        this.age_bi2 = age_bi2;
    }

    public Integer getAge_bsq() {
        return this.age_bsq;
    }

    public TiposCaixa age_bsq(Integer age_bsq) {
        this.setAge_bsq(age_bsq);
        return this;
    }

    public void setAge_bsq(Integer age_bsq) {
        this.age_bsq = age_bsq;
    }

    public Integer getAge_bnu() {
        return this.age_bnu;
    }

    public TiposCaixa age_bnu(Integer age_bnu) {
        this.setAge_bnu(age_bnu);
        return this;
    }

    public void setAge_bnu(Integer age_bnu) {
        this.age_bnu = age_bnu;
    }

    public FuncionariosEmpresa getFuncionariosEmpresa() {
        return this.funcionariosEmpresa;
    }

    public void setFuncionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.funcionariosEmpresa = funcionariosEmpresa;
    }

    public TiposCaixa funcionariosEmpresa(FuncionariosEmpresa funcionariosEmpresa) {
        this.setFuncionariosEmpresa(funcionariosEmpresa);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TiposCaixa)) {
            return false;
        }
        return id != null && id.equals(((TiposCaixa) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TiposCaixa{" +
            "id=" + getId() +
            ", age_nom='" + getAge_nom() + "'" +
            ", age_tip='" + getAge_tip() + "'" +
            ", age_fre='" + getAge_fre() + "'" +
            ", age_ret='" + getAge_ret() + "'" +
            ", moviment='" + getMoviment() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", age_con='" + getAge_con() + "'" +
            ", age_bbc=" + getAge_bbc() +
            ", age_bbd=" + getAge_bbd() +
            ", age_bbn='" + getAge_bbn() + "'" +
            ", age_bag='" + getAge_bag() + "'" +
            ", age_bad='" + getAge_bad() + "'" +
            ", age_bct='" + getAge_bct() + "'" +
            ", age_bcd='" + getAge_bcd() + "'" +
            ", age_bcc='" + getAge_bcc() + "'" +
            ", age_bcv='" + getAge_bcv() + "'" +
            ", age_bmo='" + getAge_bmo() + "'" +
            ", age_bti='" + getAge_bti() + "'" +
            ", age_bac='" + getAge_bac() + "'" +
            ", age_bre=" + getAge_bre() +
            ", age_btc='" + getAge_btc() + "'" +
            ", age_bca='" + getAge_bca() + "'" +
            ", age_bvm=" + getAge_bvm() +
            ", age_bju='" + getAge_bju() + "'" +
            ", age_blp='" + getAge_blp() + "'" +
            ", age_bmg='" + getAge_bmg() + "'" +
            ", age_bi1='" + getAge_bi1() + "'" +
            ", age_bi2='" + getAge_bi2() + "'" +
            ", age_bsq=" + getAge_bsq() +
            ", age_bnu=" + getAge_bnu() +
            "}";
    }
}
