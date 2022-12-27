package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Desconto.
 */
@Entity
@Table(name = "desconto")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Desconto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "des_raz")
    private String des_raz;

    @Column(name = "des_end")
    private String des_end;

    @Column(name = "des_cgc")
    private String des_cgc;

    @Column(name = "des_cgf")
    private String des_cgf;

    @Column(name = "des_cim")
    private String des_cim;

    @Column(name = "des_tel")
    private String des_tel;

    @Column(name = "des_cnt")
    private String des_cnt;

    @Column(name = "des_nom")
    private String des_nom;

    @Column(name = "des_ver")
    private String des_ver;

    @Column(name = "des_exe")
    private String des_exe;

    @Column(name = "des_dll")
    private String des_dll;

    @Column(name = "des_txt")
    private String des_txt;

    @Column(name = "des_req")
    private String des_req;

    @Column(name = "des_lau")
    private String des_lau;

    @Column(name = "des_md_5")
    private String des_md5;

    @Column(name = "des_pub")
    private String des_pub;

    @Column(name = "des_pri")
    private String des_pri;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Desconto id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDes_raz() {
        return this.des_raz;
    }

    public Desconto des_raz(String des_raz) {
        this.setDes_raz(des_raz);
        return this;
    }

    public void setDes_raz(String des_raz) {
        this.des_raz = des_raz;
    }

    public String getDes_end() {
        return this.des_end;
    }

    public Desconto des_end(String des_end) {
        this.setDes_end(des_end);
        return this;
    }

    public void setDes_end(String des_end) {
        this.des_end = des_end;
    }

    public String getDes_cgc() {
        return this.des_cgc;
    }

    public Desconto des_cgc(String des_cgc) {
        this.setDes_cgc(des_cgc);
        return this;
    }

    public void setDes_cgc(String des_cgc) {
        this.des_cgc = des_cgc;
    }

    public String getDes_cgf() {
        return this.des_cgf;
    }

    public Desconto des_cgf(String des_cgf) {
        this.setDes_cgf(des_cgf);
        return this;
    }

    public void setDes_cgf(String des_cgf) {
        this.des_cgf = des_cgf;
    }

    public String getDes_cim() {
        return this.des_cim;
    }

    public Desconto des_cim(String des_cim) {
        this.setDes_cim(des_cim);
        return this;
    }

    public void setDes_cim(String des_cim) {
        this.des_cim = des_cim;
    }

    public String getDes_tel() {
        return this.des_tel;
    }

    public Desconto des_tel(String des_tel) {
        this.setDes_tel(des_tel);
        return this;
    }

    public void setDes_tel(String des_tel) {
        this.des_tel = des_tel;
    }

    public String getDes_cnt() {
        return this.des_cnt;
    }

    public Desconto des_cnt(String des_cnt) {
        this.setDes_cnt(des_cnt);
        return this;
    }

    public void setDes_cnt(String des_cnt) {
        this.des_cnt = des_cnt;
    }

    public String getDes_nom() {
        return this.des_nom;
    }

    public Desconto des_nom(String des_nom) {
        this.setDes_nom(des_nom);
        return this;
    }

    public void setDes_nom(String des_nom) {
        this.des_nom = des_nom;
    }

    public String getDes_ver() {
        return this.des_ver;
    }

    public Desconto des_ver(String des_ver) {
        this.setDes_ver(des_ver);
        return this;
    }

    public void setDes_ver(String des_ver) {
        this.des_ver = des_ver;
    }

    public String getDes_exe() {
        return this.des_exe;
    }

    public Desconto des_exe(String des_exe) {
        this.setDes_exe(des_exe);
        return this;
    }

    public void setDes_exe(String des_exe) {
        this.des_exe = des_exe;
    }

    public String getDes_dll() {
        return this.des_dll;
    }

    public Desconto des_dll(String des_dll) {
        this.setDes_dll(des_dll);
        return this;
    }

    public void setDes_dll(String des_dll) {
        this.des_dll = des_dll;
    }

    public String getDes_txt() {
        return this.des_txt;
    }

    public Desconto des_txt(String des_txt) {
        this.setDes_txt(des_txt);
        return this;
    }

    public void setDes_txt(String des_txt) {
        this.des_txt = des_txt;
    }

    public String getDes_req() {
        return this.des_req;
    }

    public Desconto des_req(String des_req) {
        this.setDes_req(des_req);
        return this;
    }

    public void setDes_req(String des_req) {
        this.des_req = des_req;
    }

    public String getDes_lau() {
        return this.des_lau;
    }

    public Desconto des_lau(String des_lau) {
        this.setDes_lau(des_lau);
        return this;
    }

    public void setDes_lau(String des_lau) {
        this.des_lau = des_lau;
    }

    public String getDes_md5() {
        return this.des_md5;
    }

    public Desconto des_md5(String des_md5) {
        this.setDes_md5(des_md5);
        return this;
    }

    public void setDes_md5(String des_md5) {
        this.des_md5 = des_md5;
    }

    public String getDes_pub() {
        return this.des_pub;
    }

    public Desconto des_pub(String des_pub) {
        this.setDes_pub(des_pub);
        return this;
    }

    public void setDes_pub(String des_pub) {
        this.des_pub = des_pub;
    }

    public String getDes_pri() {
        return this.des_pri;
    }

    public Desconto des_pri(String des_pri) {
        this.setDes_pri(des_pri);
        return this;
    }

    public void setDes_pri(String des_pri) {
        this.des_pri = des_pri;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Desconto)) {
            return false;
        }
        return id != null && id.equals(((Desconto) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Desconto{" +
            "id=" + getId() +
            ", des_raz='" + getDes_raz() + "'" +
            ", des_end='" + getDes_end() + "'" +
            ", des_cgc='" + getDes_cgc() + "'" +
            ", des_cgf='" + getDes_cgf() + "'" +
            ", des_cim='" + getDes_cim() + "'" +
            ", des_tel='" + getDes_tel() + "'" +
            ", des_cnt='" + getDes_cnt() + "'" +
            ", des_nom='" + getDes_nom() + "'" +
            ", des_ver='" + getDes_ver() + "'" +
            ", des_exe='" + getDes_exe() + "'" +
            ", des_dll='" + getDes_dll() + "'" +
            ", des_txt='" + getDes_txt() + "'" +
            ", des_req='" + getDes_req() + "'" +
            ", des_lau='" + getDes_lau() + "'" +
            ", des_md5='" + getDes_md5() + "'" +
            ", des_pub='" + getDes_pub() + "'" +
            ", des_pri='" + getDes_pri() + "'" +
            "}";
    }
}
