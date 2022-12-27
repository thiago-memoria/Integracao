package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A FuncionariosEmpresa.
 */
@Entity
@Table(name = "funcionarios_empresa")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class FuncionariosEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "fun_nom")
    private String fun_nom;

    @Column(name = "fun_ncp")
    private String fun_ncp;

    @Column(name = "fun_end")
    private String fun_end;

    @Column(name = "fun_bai")
    private String fun_bai;

    @Column(name = "fun_cid")
    private String fun_cid;

    @Column(name = "fun_est")
    private String fun_est;

    @Column(name = "fun_cep")
    private Integer fun_cep;

    @Column(name = "fun_tel")
    private Integer fun_tel;

    @Column(name = "fun_dtn")
    private LocalDate fun_dtn;

    @Column(name = "fun_cre", precision = 21, scale = 2)
    private BigDecimal fun_cre;

    @Column(name = "fun_deb", precision = 21, scale = 2)
    private BigDecimal fun_deb;

    @Column(name = "fun_cxa")
    private Integer fun_cxa;

    @Column(name = "fun_tip")
    private String fun_tip;

    @Column(name = "fun_en_1")
    private String fun_en1;

    @Column(name = "fun_sa_1")
    private String fun_sa1;

    @Column(name = "fun_en_2")
    private String fun_en2;

    @Column(name = "fun_sa_2")
    private String fun_sa2;

    @Column(name = "fun_sb_1")
    private String fun_sb1;

    @Column(name = "fun_sb_2")
    private String fun_sb2;

    @Column(name = "fun_do_1")
    private String fun_do1;

    @Column(name = "fun_do_2")
    private String fun_do2;

    @Column(name = "fun_tol")
    private Integer fun_tol;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "cad_fun")
    private String cad_fun;

    @Column(name = "fun_cpf")
    private String fun_cpf;

    @Column(name = "cad_exc")
    private String cad_exc;

    @Column(name = "fun_num")
    private String fun_num;

    @Column(name = "fun_cpl")
    private String fun_cpl;

    @Column(name = "fun_dta")
    private LocalDate fun_dta;

    @Column(name = "fun_dtd")
    private LocalDate fun_dtd;

    @Lob
    @Column(name = "fun_img")
    private byte[] fun_img;

    @Column(name = "fun_img_content_type")
    private String fun_imgContentType;

    @Column(name = "fun_ema")
    private String fun_ema;

    @Column(name = "fun_ide")
    private String fun_ide;

    @Column(name = "fun_fpu")
    private String fun_fpu;

    @Column(name = "fun_fps")
    private String fun_fps;

    @Column(name = "fun_tbp")
    private Integer fun_tbp;

    @Column(name = "fun_dca")
    private LocalDate fun_dca;

    @Column(name = "fun_dcb")
    private LocalDate fun_dcb;

    @Column(name = "fun_set")
    private String fun_set;

    @Column(name = "fun_sab", precision = 21, scale = 2)
    private BigDecimal fun_sab;

    @Column(name = "fun_sad", precision = 21, scale = 2)
    private BigDecimal fun_sad;

    @Column(name = "fun_saa", precision = 21, scale = 2)
    private BigDecimal fun_saa;

    @Column(name = "fun_sal", precision = 21, scale = 2)
    private BigDecimal fun_sal;

    @Column(name = "fun_crf")
    private Integer fun_crf;

    @Column(name = "fun_rcr")
    private String fun_rcr;

    @Column(name = "fun_dcr")
    private LocalDate fun_dcr;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public FuncionariosEmpresa id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFun_nom() {
        return this.fun_nom;
    }

    public FuncionariosEmpresa fun_nom(String fun_nom) {
        this.setFun_nom(fun_nom);
        return this;
    }

    public void setFun_nom(String fun_nom) {
        this.fun_nom = fun_nom;
    }

    public String getFun_ncp() {
        return this.fun_ncp;
    }

    public FuncionariosEmpresa fun_ncp(String fun_ncp) {
        this.setFun_ncp(fun_ncp);
        return this;
    }

    public void setFun_ncp(String fun_ncp) {
        this.fun_ncp = fun_ncp;
    }

    public String getFun_end() {
        return this.fun_end;
    }

    public FuncionariosEmpresa fun_end(String fun_end) {
        this.setFun_end(fun_end);
        return this;
    }

    public void setFun_end(String fun_end) {
        this.fun_end = fun_end;
    }

    public String getFun_bai() {
        return this.fun_bai;
    }

    public FuncionariosEmpresa fun_bai(String fun_bai) {
        this.setFun_bai(fun_bai);
        return this;
    }

    public void setFun_bai(String fun_bai) {
        this.fun_bai = fun_bai;
    }

    public String getFun_cid() {
        return this.fun_cid;
    }

    public FuncionariosEmpresa fun_cid(String fun_cid) {
        this.setFun_cid(fun_cid);
        return this;
    }

    public void setFun_cid(String fun_cid) {
        this.fun_cid = fun_cid;
    }

    public String getFun_est() {
        return this.fun_est;
    }

    public FuncionariosEmpresa fun_est(String fun_est) {
        this.setFun_est(fun_est);
        return this;
    }

    public void setFun_est(String fun_est) {
        this.fun_est = fun_est;
    }

    public Integer getFun_cep() {
        return this.fun_cep;
    }

    public FuncionariosEmpresa fun_cep(Integer fun_cep) {
        this.setFun_cep(fun_cep);
        return this;
    }

    public void setFun_cep(Integer fun_cep) {
        this.fun_cep = fun_cep;
    }

    public Integer getFun_tel() {
        return this.fun_tel;
    }

    public FuncionariosEmpresa fun_tel(Integer fun_tel) {
        this.setFun_tel(fun_tel);
        return this;
    }

    public void setFun_tel(Integer fun_tel) {
        this.fun_tel = fun_tel;
    }

    public LocalDate getFun_dtn() {
        return this.fun_dtn;
    }

    public FuncionariosEmpresa fun_dtn(LocalDate fun_dtn) {
        this.setFun_dtn(fun_dtn);
        return this;
    }

    public void setFun_dtn(LocalDate fun_dtn) {
        this.fun_dtn = fun_dtn;
    }

    public BigDecimal getFun_cre() {
        return this.fun_cre;
    }

    public FuncionariosEmpresa fun_cre(BigDecimal fun_cre) {
        this.setFun_cre(fun_cre);
        return this;
    }

    public void setFun_cre(BigDecimal fun_cre) {
        this.fun_cre = fun_cre;
    }

    public BigDecimal getFun_deb() {
        return this.fun_deb;
    }

    public FuncionariosEmpresa fun_deb(BigDecimal fun_deb) {
        this.setFun_deb(fun_deb);
        return this;
    }

    public void setFun_deb(BigDecimal fun_deb) {
        this.fun_deb = fun_deb;
    }

    public Integer getFun_cxa() {
        return this.fun_cxa;
    }

    public FuncionariosEmpresa fun_cxa(Integer fun_cxa) {
        this.setFun_cxa(fun_cxa);
        return this;
    }

    public void setFun_cxa(Integer fun_cxa) {
        this.fun_cxa = fun_cxa;
    }

    public String getFun_tip() {
        return this.fun_tip;
    }

    public FuncionariosEmpresa fun_tip(String fun_tip) {
        this.setFun_tip(fun_tip);
        return this;
    }

    public void setFun_tip(String fun_tip) {
        this.fun_tip = fun_tip;
    }

    public String getFun_en1() {
        return this.fun_en1;
    }

    public FuncionariosEmpresa fun_en1(String fun_en1) {
        this.setFun_en1(fun_en1);
        return this;
    }

    public void setFun_en1(String fun_en1) {
        this.fun_en1 = fun_en1;
    }

    public String getFun_sa1() {
        return this.fun_sa1;
    }

    public FuncionariosEmpresa fun_sa1(String fun_sa1) {
        this.setFun_sa1(fun_sa1);
        return this;
    }

    public void setFun_sa1(String fun_sa1) {
        this.fun_sa1 = fun_sa1;
    }

    public String getFun_en2() {
        return this.fun_en2;
    }

    public FuncionariosEmpresa fun_en2(String fun_en2) {
        this.setFun_en2(fun_en2);
        return this;
    }

    public void setFun_en2(String fun_en2) {
        this.fun_en2 = fun_en2;
    }

    public String getFun_sa2() {
        return this.fun_sa2;
    }

    public FuncionariosEmpresa fun_sa2(String fun_sa2) {
        this.setFun_sa2(fun_sa2);
        return this;
    }

    public void setFun_sa2(String fun_sa2) {
        this.fun_sa2 = fun_sa2;
    }

    public String getFun_sb1() {
        return this.fun_sb1;
    }

    public FuncionariosEmpresa fun_sb1(String fun_sb1) {
        this.setFun_sb1(fun_sb1);
        return this;
    }

    public void setFun_sb1(String fun_sb1) {
        this.fun_sb1 = fun_sb1;
    }

    public String getFun_sb2() {
        return this.fun_sb2;
    }

    public FuncionariosEmpresa fun_sb2(String fun_sb2) {
        this.setFun_sb2(fun_sb2);
        return this;
    }

    public void setFun_sb2(String fun_sb2) {
        this.fun_sb2 = fun_sb2;
    }

    public String getFun_do1() {
        return this.fun_do1;
    }

    public FuncionariosEmpresa fun_do1(String fun_do1) {
        this.setFun_do1(fun_do1);
        return this;
    }

    public void setFun_do1(String fun_do1) {
        this.fun_do1 = fun_do1;
    }

    public String getFun_do2() {
        return this.fun_do2;
    }

    public FuncionariosEmpresa fun_do2(String fun_do2) {
        this.setFun_do2(fun_do2);
        return this;
    }

    public void setFun_do2(String fun_do2) {
        this.fun_do2 = fun_do2;
    }

    public Integer getFun_tol() {
        return this.fun_tol;
    }

    public FuncionariosEmpresa fun_tol(Integer fun_tol) {
        this.setFun_tol(fun_tol);
        return this;
    }

    public void setFun_tol(Integer fun_tol) {
        this.fun_tol = fun_tol;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public FuncionariosEmpresa cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public String getCad_fun() {
        return this.cad_fun;
    }

    public FuncionariosEmpresa cad_fun(String cad_fun) {
        this.setCad_fun(cad_fun);
        return this;
    }

    public void setCad_fun(String cad_fun) {
        this.cad_fun = cad_fun;
    }

    public String getFun_cpf() {
        return this.fun_cpf;
    }

    public FuncionariosEmpresa fun_cpf(String fun_cpf) {
        this.setFun_cpf(fun_cpf);
        return this;
    }

    public void setFun_cpf(String fun_cpf) {
        this.fun_cpf = fun_cpf;
    }

    public String getCad_exc() {
        return this.cad_exc;
    }

    public FuncionariosEmpresa cad_exc(String cad_exc) {
        this.setCad_exc(cad_exc);
        return this;
    }

    public void setCad_exc(String cad_exc) {
        this.cad_exc = cad_exc;
    }

    public String getFun_num() {
        return this.fun_num;
    }

    public FuncionariosEmpresa fun_num(String fun_num) {
        this.setFun_num(fun_num);
        return this;
    }

    public void setFun_num(String fun_num) {
        this.fun_num = fun_num;
    }

    public String getFun_cpl() {
        return this.fun_cpl;
    }

    public FuncionariosEmpresa fun_cpl(String fun_cpl) {
        this.setFun_cpl(fun_cpl);
        return this;
    }

    public void setFun_cpl(String fun_cpl) {
        this.fun_cpl = fun_cpl;
    }

    public LocalDate getFun_dta() {
        return this.fun_dta;
    }

    public FuncionariosEmpresa fun_dta(LocalDate fun_dta) {
        this.setFun_dta(fun_dta);
        return this;
    }

    public void setFun_dta(LocalDate fun_dta) {
        this.fun_dta = fun_dta;
    }

    public LocalDate getFun_dtd() {
        return this.fun_dtd;
    }

    public FuncionariosEmpresa fun_dtd(LocalDate fun_dtd) {
        this.setFun_dtd(fun_dtd);
        return this;
    }

    public void setFun_dtd(LocalDate fun_dtd) {
        this.fun_dtd = fun_dtd;
    }

    public byte[] getFun_img() {
        return this.fun_img;
    }

    public FuncionariosEmpresa fun_img(byte[] fun_img) {
        this.setFun_img(fun_img);
        return this;
    }

    public void setFun_img(byte[] fun_img) {
        this.fun_img = fun_img;
    }

    public String getFun_imgContentType() {
        return this.fun_imgContentType;
    }

    public FuncionariosEmpresa fun_imgContentType(String fun_imgContentType) {
        this.fun_imgContentType = fun_imgContentType;
        return this;
    }

    public void setFun_imgContentType(String fun_imgContentType) {
        this.fun_imgContentType = fun_imgContentType;
    }

    public String getFun_ema() {
        return this.fun_ema;
    }

    public FuncionariosEmpresa fun_ema(String fun_ema) {
        this.setFun_ema(fun_ema);
        return this;
    }

    public void setFun_ema(String fun_ema) {
        this.fun_ema = fun_ema;
    }

    public String getFun_ide() {
        return this.fun_ide;
    }

    public FuncionariosEmpresa fun_ide(String fun_ide) {
        this.setFun_ide(fun_ide);
        return this;
    }

    public void setFun_ide(String fun_ide) {
        this.fun_ide = fun_ide;
    }

    public String getFun_fpu() {
        return this.fun_fpu;
    }

    public FuncionariosEmpresa fun_fpu(String fun_fpu) {
        this.setFun_fpu(fun_fpu);
        return this;
    }

    public void setFun_fpu(String fun_fpu) {
        this.fun_fpu = fun_fpu;
    }

    public String getFun_fps() {
        return this.fun_fps;
    }

    public FuncionariosEmpresa fun_fps(String fun_fps) {
        this.setFun_fps(fun_fps);
        return this;
    }

    public void setFun_fps(String fun_fps) {
        this.fun_fps = fun_fps;
    }

    public Integer getFun_tbp() {
        return this.fun_tbp;
    }

    public FuncionariosEmpresa fun_tbp(Integer fun_tbp) {
        this.setFun_tbp(fun_tbp);
        return this;
    }

    public void setFun_tbp(Integer fun_tbp) {
        this.fun_tbp = fun_tbp;
    }

    public LocalDate getFun_dca() {
        return this.fun_dca;
    }

    public FuncionariosEmpresa fun_dca(LocalDate fun_dca) {
        this.setFun_dca(fun_dca);
        return this;
    }

    public void setFun_dca(LocalDate fun_dca) {
        this.fun_dca = fun_dca;
    }

    public LocalDate getFun_dcb() {
        return this.fun_dcb;
    }

    public FuncionariosEmpresa fun_dcb(LocalDate fun_dcb) {
        this.setFun_dcb(fun_dcb);
        return this;
    }

    public void setFun_dcb(LocalDate fun_dcb) {
        this.fun_dcb = fun_dcb;
    }

    public String getFun_set() {
        return this.fun_set;
    }

    public FuncionariosEmpresa fun_set(String fun_set) {
        this.setFun_set(fun_set);
        return this;
    }

    public void setFun_set(String fun_set) {
        this.fun_set = fun_set;
    }

    public BigDecimal getFun_sab() {
        return this.fun_sab;
    }

    public FuncionariosEmpresa fun_sab(BigDecimal fun_sab) {
        this.setFun_sab(fun_sab);
        return this;
    }

    public void setFun_sab(BigDecimal fun_sab) {
        this.fun_sab = fun_sab;
    }

    public BigDecimal getFun_sad() {
        return this.fun_sad;
    }

    public FuncionariosEmpresa fun_sad(BigDecimal fun_sad) {
        this.setFun_sad(fun_sad);
        return this;
    }

    public void setFun_sad(BigDecimal fun_sad) {
        this.fun_sad = fun_sad;
    }

    public BigDecimal getFun_saa() {
        return this.fun_saa;
    }

    public FuncionariosEmpresa fun_saa(BigDecimal fun_saa) {
        this.setFun_saa(fun_saa);
        return this;
    }

    public void setFun_saa(BigDecimal fun_saa) {
        this.fun_saa = fun_saa;
    }

    public BigDecimal getFun_sal() {
        return this.fun_sal;
    }

    public FuncionariosEmpresa fun_sal(BigDecimal fun_sal) {
        this.setFun_sal(fun_sal);
        return this;
    }

    public void setFun_sal(BigDecimal fun_sal) {
        this.fun_sal = fun_sal;
    }

    public Integer getFun_crf() {
        return this.fun_crf;
    }

    public FuncionariosEmpresa fun_crf(Integer fun_crf) {
        this.setFun_crf(fun_crf);
        return this;
    }

    public void setFun_crf(Integer fun_crf) {
        this.fun_crf = fun_crf;
    }

    public String getFun_rcr() {
        return this.fun_rcr;
    }

    public FuncionariosEmpresa fun_rcr(String fun_rcr) {
        this.setFun_rcr(fun_rcr);
        return this;
    }

    public void setFun_rcr(String fun_rcr) {
        this.fun_rcr = fun_rcr;
    }

    public LocalDate getFun_dcr() {
        return this.fun_dcr;
    }

    public FuncionariosEmpresa fun_dcr(LocalDate fun_dcr) {
        this.setFun_dcr(fun_dcr);
        return this;
    }

    public void setFun_dcr(LocalDate fun_dcr) {
        this.fun_dcr = fun_dcr;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FuncionariosEmpresa)) {
            return false;
        }
        return id != null && id.equals(((FuncionariosEmpresa) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FuncionariosEmpresa{" +
            "id=" + getId() +
            ", fun_nom='" + getFun_nom() + "'" +
            ", fun_ncp='" + getFun_ncp() + "'" +
            ", fun_end='" + getFun_end() + "'" +
            ", fun_bai='" + getFun_bai() + "'" +
            ", fun_cid='" + getFun_cid() + "'" +
            ", fun_est='" + getFun_est() + "'" +
            ", fun_cep=" + getFun_cep() +
            ", fun_tel=" + getFun_tel() +
            ", fun_dtn='" + getFun_dtn() + "'" +
            ", fun_cre=" + getFun_cre() +
            ", fun_deb=" + getFun_deb() +
            ", fun_cxa=" + getFun_cxa() +
            ", fun_tip='" + getFun_tip() + "'" +
            ", fun_en1='" + getFun_en1() + "'" +
            ", fun_sa1='" + getFun_sa1() + "'" +
            ", fun_en2='" + getFun_en2() + "'" +
            ", fun_sa2='" + getFun_sa2() + "'" +
            ", fun_sb1='" + getFun_sb1() + "'" +
            ", fun_sb2='" + getFun_sb2() + "'" +
            ", fun_do1='" + getFun_do1() + "'" +
            ", fun_do2='" + getFun_do2() + "'" +
            ", fun_tol=" + getFun_tol() +
            ", cad_dat='" + getCad_dat() + "'" +
            ", cad_fun='" + getCad_fun() + "'" +
            ", fun_cpf='" + getFun_cpf() + "'" +
            ", cad_exc='" + getCad_exc() + "'" +
            ", fun_num='" + getFun_num() + "'" +
            ", fun_cpl='" + getFun_cpl() + "'" +
            ", fun_dta='" + getFun_dta() + "'" +
            ", fun_dtd='" + getFun_dtd() + "'" +
            ", fun_img='" + getFun_img() + "'" +
            ", fun_imgContentType='" + getFun_imgContentType() + "'" +
            ", fun_ema='" + getFun_ema() + "'" +
            ", fun_ide='" + getFun_ide() + "'" +
            ", fun_fpu='" + getFun_fpu() + "'" +
            ", fun_fps='" + getFun_fps() + "'" +
            ", fun_tbp=" + getFun_tbp() +
            ", fun_dca='" + getFun_dca() + "'" +
            ", fun_dcb='" + getFun_dcb() + "'" +
            ", fun_set='" + getFun_set() + "'" +
            ", fun_sab=" + getFun_sab() +
            ", fun_sad=" + getFun_sad() +
            ", fun_saa=" + getFun_saa() +
            ", fun_sal=" + getFun_sal() +
            ", fun_crf=" + getFun_crf() +
            ", fun_rcr='" + getFun_rcr() + "'" +
            ", fun_dcr='" + getFun_dcr() + "'" +
            "}";
    }
}
