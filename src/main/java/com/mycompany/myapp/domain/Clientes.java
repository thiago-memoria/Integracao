package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A Clientes.
 */
@Entity
@Table(name = "clientes")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "cli_nom")
    private String cli_nom;

    @Column(name = "cli_end")
    private String cli_end;

    @Column(name = "cli_ptr")
    private String cli_ptr;

    @Column(name = "cli_bai")
    private String cli_bai;

    @Column(name = "cli_cid")
    private String cli_cid;

    @Column(name = "cli_est")
    private String cli_est;

    @Column(name = "cli_cep")
    private Integer cli_cep;

    @Column(name = "cli_tel")
    private String cli_tel;

    @Column(name = "cli_cel")
    private String cli_cel;

    @Column(name = "cli_dtn")
    private LocalDate cli_dtn;

    @Column(name = "cli_tip")
    private String cli_tip;

    @Column(name = "cli_mat")
    private String cli_mat;

    @Column(name = "cli_car")
    private String cli_car;

    @Column(name = "cli_set")
    private String cli_set;

    @Column(name = "cli_ide")
    private String cli_ide;

    @Column(name = "cli_des", precision = 21, scale = 2)
    private BigDecimal cli_des;

    @Column(name = "cli_pra")
    private Integer cli_pra;

    @Column(name = "cli_dia")
    private Integer cli_dia;

    @Column(name = "cli_blo")
    private Integer cli_blo;

    @Column(name = "cli_cre", precision = 21, scale = 2)
    private BigDecimal cli_cre;

    @Column(name = "cli_deb", precision = 21, scale = 2)
    private BigDecimal cli_deb;

    @Lob
    @Column(name = "cli_obs")
    private byte[] cli_obs;

    @Column(name = "cli_obs_content_type")
    private String cli_obsContentType;

    @Column(name = "cli_cta")
    private String cli_cta;

    @Column(name = "cli_val")
    private LocalDate cli_val;

    @Column(name = "cli_cse")
    private String cli_cse;

    @Column(name = "cli_cgc")
    private String cli_cgc;

    @Column(name = "cli_raz")
    private String cli_raz;

    @Column(name = "cli_cgf")
    private String cli_cgf;

    @Column(name = "cad_dat")
    private LocalDate cad_dat;

    @Column(name = "cli_mcp")
    private Integer cli_mcp;

    @Column(name = "cli_pto", precision = 21, scale = 2)
    private BigDecimal cli_pto;

    @Column(name = "cli_fid")
    private String cli_fid;

    @Column(name = "cli_bbl")
    private String cli_bbl;

    @Column(name = "cli_bmo")
    private String cli_bmo;

    @Column(name = "cli_cnt")
    private String cli_cnt;

    @Column(name = "cli_dep")
    private String cli_dep;

    @Column(name = "cli_civ")
    private String cli_civ;

    @Column(name = "cli_nat")
    private String cli_nat;

    @Column(name = "cli_pro")
    private String cli_pro;

    @Column(name = "cli_tra")
    private String cli_tra;

    @Column(name = "cli_fil")
    private String cli_fil;

    @Column(name = "cli_cnj")
    private String cli_cnj;

    @Column(name = "cli_tbp")
    private Integer cli_tbp;

    @Column(name = "cli_fpg")
    private String cli_fpg;

    @Column(name = "cli_edc")
    private String cli_edc;

    @Column(name = "cli_bac")
    private String cli_bac;

    @Column(name = "cli_cic")
    private String cli_cic;

    @Column(name = "cli_esc")
    private String cli_esc;

    @Column(name = "cli_cec")
    private Integer cli_cec;

    @Column(name = "cli_sal", precision = 21, scale = 2)
    private BigDecimal cli_sal;

    @Column(name = "cli_dma", precision = 21, scale = 2)
    private BigDecimal cli_dma;

    @Column(name = "cli_pla")
    private String cli_pla;

    @Column(name = "cli_tec")
    private String cli_tec;

    @Lob
    @Column(name = "cli_img")
    private byte[] cli_img;

    @Column(name = "cli_img_content_type")
    private String cli_imgContentType;

    @Column(name = "cli_esp")
    private String cli_esp;

    @Column(name = "cli_cro")
    private Integer cli_cro;

    @Column(name = "cli_mun")
    private Integer cli_mun;

    @Column(name = "cad_exc")
    private String cad_exc;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Clientes id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCli_nom() {
        return this.cli_nom;
    }

    public Clientes cli_nom(String cli_nom) {
        this.setCli_nom(cli_nom);
        return this;
    }

    public void setCli_nom(String cli_nom) {
        this.cli_nom = cli_nom;
    }

    public String getCli_end() {
        return this.cli_end;
    }

    public Clientes cli_end(String cli_end) {
        this.setCli_end(cli_end);
        return this;
    }

    public void setCli_end(String cli_end) {
        this.cli_end = cli_end;
    }

    public String getCli_ptr() {
        return this.cli_ptr;
    }

    public Clientes cli_ptr(String cli_ptr) {
        this.setCli_ptr(cli_ptr);
        return this;
    }

    public void setCli_ptr(String cli_ptr) {
        this.cli_ptr = cli_ptr;
    }

    public String getCli_bai() {
        return this.cli_bai;
    }

    public Clientes cli_bai(String cli_bai) {
        this.setCli_bai(cli_bai);
        return this;
    }

    public void setCli_bai(String cli_bai) {
        this.cli_bai = cli_bai;
    }

    public String getCli_cid() {
        return this.cli_cid;
    }

    public Clientes cli_cid(String cli_cid) {
        this.setCli_cid(cli_cid);
        return this;
    }

    public void setCli_cid(String cli_cid) {
        this.cli_cid = cli_cid;
    }

    public String getCli_est() {
        return this.cli_est;
    }

    public Clientes cli_est(String cli_est) {
        this.setCli_est(cli_est);
        return this;
    }

    public void setCli_est(String cli_est) {
        this.cli_est = cli_est;
    }

    public Integer getCli_cep() {
        return this.cli_cep;
    }

    public Clientes cli_cep(Integer cli_cep) {
        this.setCli_cep(cli_cep);
        return this;
    }

    public void setCli_cep(Integer cli_cep) {
        this.cli_cep = cli_cep;
    }

    public String getCli_tel() {
        return this.cli_tel;
    }

    public Clientes cli_tel(String cli_tel) {
        this.setCli_tel(cli_tel);
        return this;
    }

    public void setCli_tel(String cli_tel) {
        this.cli_tel = cli_tel;
    }

    public String getCli_cel() {
        return this.cli_cel;
    }

    public Clientes cli_cel(String cli_cel) {
        this.setCli_cel(cli_cel);
        return this;
    }

    public void setCli_cel(String cli_cel) {
        this.cli_cel = cli_cel;
    }

    public LocalDate getCli_dtn() {
        return this.cli_dtn;
    }

    public Clientes cli_dtn(LocalDate cli_dtn) {
        this.setCli_dtn(cli_dtn);
        return this;
    }

    public void setCli_dtn(LocalDate cli_dtn) {
        this.cli_dtn = cli_dtn;
    }

    public String getCli_tip() {
        return this.cli_tip;
    }

    public Clientes cli_tip(String cli_tip) {
        this.setCli_tip(cli_tip);
        return this;
    }

    public void setCli_tip(String cli_tip) {
        this.cli_tip = cli_tip;
    }

    public String getCli_mat() {
        return this.cli_mat;
    }

    public Clientes cli_mat(String cli_mat) {
        this.setCli_mat(cli_mat);
        return this;
    }

    public void setCli_mat(String cli_mat) {
        this.cli_mat = cli_mat;
    }

    public String getCli_car() {
        return this.cli_car;
    }

    public Clientes cli_car(String cli_car) {
        this.setCli_car(cli_car);
        return this;
    }

    public void setCli_car(String cli_car) {
        this.cli_car = cli_car;
    }

    public String getCli_set() {
        return this.cli_set;
    }

    public Clientes cli_set(String cli_set) {
        this.setCli_set(cli_set);
        return this;
    }

    public void setCli_set(String cli_set) {
        this.cli_set = cli_set;
    }

    public String getCli_ide() {
        return this.cli_ide;
    }

    public Clientes cli_ide(String cli_ide) {
        this.setCli_ide(cli_ide);
        return this;
    }

    public void setCli_ide(String cli_ide) {
        this.cli_ide = cli_ide;
    }

    public BigDecimal getCli_des() {
        return this.cli_des;
    }

    public Clientes cli_des(BigDecimal cli_des) {
        this.setCli_des(cli_des);
        return this;
    }

    public void setCli_des(BigDecimal cli_des) {
        this.cli_des = cli_des;
    }

    public Integer getCli_pra() {
        return this.cli_pra;
    }

    public Clientes cli_pra(Integer cli_pra) {
        this.setCli_pra(cli_pra);
        return this;
    }

    public void setCli_pra(Integer cli_pra) {
        this.cli_pra = cli_pra;
    }

    public Integer getCli_dia() {
        return this.cli_dia;
    }

    public Clientes cli_dia(Integer cli_dia) {
        this.setCli_dia(cli_dia);
        return this;
    }

    public void setCli_dia(Integer cli_dia) {
        this.cli_dia = cli_dia;
    }

    public Integer getCli_blo() {
        return this.cli_blo;
    }

    public Clientes cli_blo(Integer cli_blo) {
        this.setCli_blo(cli_blo);
        return this;
    }

    public void setCli_blo(Integer cli_blo) {
        this.cli_blo = cli_blo;
    }

    public BigDecimal getCli_cre() {
        return this.cli_cre;
    }

    public Clientes cli_cre(BigDecimal cli_cre) {
        this.setCli_cre(cli_cre);
        return this;
    }

    public void setCli_cre(BigDecimal cli_cre) {
        this.cli_cre = cli_cre;
    }

    public BigDecimal getCli_deb() {
        return this.cli_deb;
    }

    public Clientes cli_deb(BigDecimal cli_deb) {
        this.setCli_deb(cli_deb);
        return this;
    }

    public void setCli_deb(BigDecimal cli_deb) {
        this.cli_deb = cli_deb;
    }

    public byte[] getCli_obs() {
        return this.cli_obs;
    }

    public Clientes cli_obs(byte[] cli_obs) {
        this.setCli_obs(cli_obs);
        return this;
    }

    public void setCli_obs(byte[] cli_obs) {
        this.cli_obs = cli_obs;
    }

    public String getCli_obsContentType() {
        return this.cli_obsContentType;
    }

    public Clientes cli_obsContentType(String cli_obsContentType) {
        this.cli_obsContentType = cli_obsContentType;
        return this;
    }

    public void setCli_obsContentType(String cli_obsContentType) {
        this.cli_obsContentType = cli_obsContentType;
    }

    public String getCli_cta() {
        return this.cli_cta;
    }

    public Clientes cli_cta(String cli_cta) {
        this.setCli_cta(cli_cta);
        return this;
    }

    public void setCli_cta(String cli_cta) {
        this.cli_cta = cli_cta;
    }

    public LocalDate getCli_val() {
        return this.cli_val;
    }

    public Clientes cli_val(LocalDate cli_val) {
        this.setCli_val(cli_val);
        return this;
    }

    public void setCli_val(LocalDate cli_val) {
        this.cli_val = cli_val;
    }

    public String getCli_cse() {
        return this.cli_cse;
    }

    public Clientes cli_cse(String cli_cse) {
        this.setCli_cse(cli_cse);
        return this;
    }

    public void setCli_cse(String cli_cse) {
        this.cli_cse = cli_cse;
    }

    public String getCli_cgc() {
        return this.cli_cgc;
    }

    public Clientes cli_cgc(String cli_cgc) {
        this.setCli_cgc(cli_cgc);
        return this;
    }

    public void setCli_cgc(String cli_cgc) {
        this.cli_cgc = cli_cgc;
    }

    public String getCli_raz() {
        return this.cli_raz;
    }

    public Clientes cli_raz(String cli_raz) {
        this.setCli_raz(cli_raz);
        return this;
    }

    public void setCli_raz(String cli_raz) {
        this.cli_raz = cli_raz;
    }

    public String getCli_cgf() {
        return this.cli_cgf;
    }

    public Clientes cli_cgf(String cli_cgf) {
        this.setCli_cgf(cli_cgf);
        return this;
    }

    public void setCli_cgf(String cli_cgf) {
        this.cli_cgf = cli_cgf;
    }

    public LocalDate getCad_dat() {
        return this.cad_dat;
    }

    public Clientes cad_dat(LocalDate cad_dat) {
        this.setCad_dat(cad_dat);
        return this;
    }

    public void setCad_dat(LocalDate cad_dat) {
        this.cad_dat = cad_dat;
    }

    public Integer getCli_mcp() {
        return this.cli_mcp;
    }

    public Clientes cli_mcp(Integer cli_mcp) {
        this.setCli_mcp(cli_mcp);
        return this;
    }

    public void setCli_mcp(Integer cli_mcp) {
        this.cli_mcp = cli_mcp;
    }

    public BigDecimal getCli_pto() {
        return this.cli_pto;
    }

    public Clientes cli_pto(BigDecimal cli_pto) {
        this.setCli_pto(cli_pto);
        return this;
    }

    public void setCli_pto(BigDecimal cli_pto) {
        this.cli_pto = cli_pto;
    }

    public String getCli_fid() {
        return this.cli_fid;
    }

    public Clientes cli_fid(String cli_fid) {
        this.setCli_fid(cli_fid);
        return this;
    }

    public void setCli_fid(String cli_fid) {
        this.cli_fid = cli_fid;
    }

    public String getCli_bbl() {
        return this.cli_bbl;
    }

    public Clientes cli_bbl(String cli_bbl) {
        this.setCli_bbl(cli_bbl);
        return this;
    }

    public void setCli_bbl(String cli_bbl) {
        this.cli_bbl = cli_bbl;
    }

    public String getCli_bmo() {
        return this.cli_bmo;
    }

    public Clientes cli_bmo(String cli_bmo) {
        this.setCli_bmo(cli_bmo);
        return this;
    }

    public void setCli_bmo(String cli_bmo) {
        this.cli_bmo = cli_bmo;
    }

    public String getCli_cnt() {
        return this.cli_cnt;
    }

    public Clientes cli_cnt(String cli_cnt) {
        this.setCli_cnt(cli_cnt);
        return this;
    }

    public void setCli_cnt(String cli_cnt) {
        this.cli_cnt = cli_cnt;
    }

    public String getCli_dep() {
        return this.cli_dep;
    }

    public Clientes cli_dep(String cli_dep) {
        this.setCli_dep(cli_dep);
        return this;
    }

    public void setCli_dep(String cli_dep) {
        this.cli_dep = cli_dep;
    }

    public String getCli_civ() {
        return this.cli_civ;
    }

    public Clientes cli_civ(String cli_civ) {
        this.setCli_civ(cli_civ);
        return this;
    }

    public void setCli_civ(String cli_civ) {
        this.cli_civ = cli_civ;
    }

    public String getCli_nat() {
        return this.cli_nat;
    }

    public Clientes cli_nat(String cli_nat) {
        this.setCli_nat(cli_nat);
        return this;
    }

    public void setCli_nat(String cli_nat) {
        this.cli_nat = cli_nat;
    }

    public String getCli_pro() {
        return this.cli_pro;
    }

    public Clientes cli_pro(String cli_pro) {
        this.setCli_pro(cli_pro);
        return this;
    }

    public void setCli_pro(String cli_pro) {
        this.cli_pro = cli_pro;
    }

    public String getCli_tra() {
        return this.cli_tra;
    }

    public Clientes cli_tra(String cli_tra) {
        this.setCli_tra(cli_tra);
        return this;
    }

    public void setCli_tra(String cli_tra) {
        this.cli_tra = cli_tra;
    }

    public String getCli_fil() {
        return this.cli_fil;
    }

    public Clientes cli_fil(String cli_fil) {
        this.setCli_fil(cli_fil);
        return this;
    }

    public void setCli_fil(String cli_fil) {
        this.cli_fil = cli_fil;
    }

    public String getCli_cnj() {
        return this.cli_cnj;
    }

    public Clientes cli_cnj(String cli_cnj) {
        this.setCli_cnj(cli_cnj);
        return this;
    }

    public void setCli_cnj(String cli_cnj) {
        this.cli_cnj = cli_cnj;
    }

    public Integer getCli_tbp() {
        return this.cli_tbp;
    }

    public Clientes cli_tbp(Integer cli_tbp) {
        this.setCli_tbp(cli_tbp);
        return this;
    }

    public void setCli_tbp(Integer cli_tbp) {
        this.cli_tbp = cli_tbp;
    }

    public String getCli_fpg() {
        return this.cli_fpg;
    }

    public Clientes cli_fpg(String cli_fpg) {
        this.setCli_fpg(cli_fpg);
        return this;
    }

    public void setCli_fpg(String cli_fpg) {
        this.cli_fpg = cli_fpg;
    }

    public String getCli_edc() {
        return this.cli_edc;
    }

    public Clientes cli_edc(String cli_edc) {
        this.setCli_edc(cli_edc);
        return this;
    }

    public void setCli_edc(String cli_edc) {
        this.cli_edc = cli_edc;
    }

    public String getCli_bac() {
        return this.cli_bac;
    }

    public Clientes cli_bac(String cli_bac) {
        this.setCli_bac(cli_bac);
        return this;
    }

    public void setCli_bac(String cli_bac) {
        this.cli_bac = cli_bac;
    }

    public String getCli_cic() {
        return this.cli_cic;
    }

    public Clientes cli_cic(String cli_cic) {
        this.setCli_cic(cli_cic);
        return this;
    }

    public void setCli_cic(String cli_cic) {
        this.cli_cic = cli_cic;
    }

    public String getCli_esc() {
        return this.cli_esc;
    }

    public Clientes cli_esc(String cli_esc) {
        this.setCli_esc(cli_esc);
        return this;
    }

    public void setCli_esc(String cli_esc) {
        this.cli_esc = cli_esc;
    }

    public Integer getCli_cec() {
        return this.cli_cec;
    }

    public Clientes cli_cec(Integer cli_cec) {
        this.setCli_cec(cli_cec);
        return this;
    }

    public void setCli_cec(Integer cli_cec) {
        this.cli_cec = cli_cec;
    }

    public BigDecimal getCli_sal() {
        return this.cli_sal;
    }

    public Clientes cli_sal(BigDecimal cli_sal) {
        this.setCli_sal(cli_sal);
        return this;
    }

    public void setCli_sal(BigDecimal cli_sal) {
        this.cli_sal = cli_sal;
    }

    public BigDecimal getCli_dma() {
        return this.cli_dma;
    }

    public Clientes cli_dma(BigDecimal cli_dma) {
        this.setCli_dma(cli_dma);
        return this;
    }

    public void setCli_dma(BigDecimal cli_dma) {
        this.cli_dma = cli_dma;
    }

    public String getCli_pla() {
        return this.cli_pla;
    }

    public Clientes cli_pla(String cli_pla) {
        this.setCli_pla(cli_pla);
        return this;
    }

    public void setCli_pla(String cli_pla) {
        this.cli_pla = cli_pla;
    }

    public String getCli_tec() {
        return this.cli_tec;
    }

    public Clientes cli_tec(String cli_tec) {
        this.setCli_tec(cli_tec);
        return this;
    }

    public void setCli_tec(String cli_tec) {
        this.cli_tec = cli_tec;
    }

    public byte[] getCli_img() {
        return this.cli_img;
    }

    public Clientes cli_img(byte[] cli_img) {
        this.setCli_img(cli_img);
        return this;
    }

    public void setCli_img(byte[] cli_img) {
        this.cli_img = cli_img;
    }

    public String getCli_imgContentType() {
        return this.cli_imgContentType;
    }

    public Clientes cli_imgContentType(String cli_imgContentType) {
        this.cli_imgContentType = cli_imgContentType;
        return this;
    }

    public void setCli_imgContentType(String cli_imgContentType) {
        this.cli_imgContentType = cli_imgContentType;
    }

    public String getCli_esp() {
        return this.cli_esp;
    }

    public Clientes cli_esp(String cli_esp) {
        this.setCli_esp(cli_esp);
        return this;
    }

    public void setCli_esp(String cli_esp) {
        this.cli_esp = cli_esp;
    }

    public Integer getCli_cro() {
        return this.cli_cro;
    }

    public Clientes cli_cro(Integer cli_cro) {
        this.setCli_cro(cli_cro);
        return this;
    }

    public void setCli_cro(Integer cli_cro) {
        this.cli_cro = cli_cro;
    }

    public Integer getCli_mun() {
        return this.cli_mun;
    }

    public Clientes cli_mun(Integer cli_mun) {
        this.setCli_mun(cli_mun);
        return this;
    }

    public void setCli_mun(Integer cli_mun) {
        this.cli_mun = cli_mun;
    }

    public String getCad_exc() {
        return this.cad_exc;
    }

    public Clientes cad_exc(String cad_exc) {
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
        if (!(o instanceof Clientes)) {
            return false;
        }
        return id != null && id.equals(((Clientes) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Clientes{" +
            "id=" + getId() +
            ", cli_nom='" + getCli_nom() + "'" +
            ", cli_end='" + getCli_end() + "'" +
            ", cli_ptr='" + getCli_ptr() + "'" +
            ", cli_bai='" + getCli_bai() + "'" +
            ", cli_cid='" + getCli_cid() + "'" +
            ", cli_est='" + getCli_est() + "'" +
            ", cli_cep=" + getCli_cep() +
            ", cli_tel='" + getCli_tel() + "'" +
            ", cli_cel='" + getCli_cel() + "'" +
            ", cli_dtn='" + getCli_dtn() + "'" +
            ", cli_tip='" + getCli_tip() + "'" +
            ", cli_mat='" + getCli_mat() + "'" +
            ", cli_car='" + getCli_car() + "'" +
            ", cli_set='" + getCli_set() + "'" +
            ", cli_ide='" + getCli_ide() + "'" +
            ", cli_des=" + getCli_des() +
            ", cli_pra=" + getCli_pra() +
            ", cli_dia=" + getCli_dia() +
            ", cli_blo=" + getCli_blo() +
            ", cli_cre=" + getCli_cre() +
            ", cli_deb=" + getCli_deb() +
            ", cli_obs='" + getCli_obs() + "'" +
            ", cli_obsContentType='" + getCli_obsContentType() + "'" +
            ", cli_cta='" + getCli_cta() + "'" +
            ", cli_val='" + getCli_val() + "'" +
            ", cli_cse='" + getCli_cse() + "'" +
            ", cli_cgc='" + getCli_cgc() + "'" +
            ", cli_raz='" + getCli_raz() + "'" +
            ", cli_cgf='" + getCli_cgf() + "'" +
            ", cad_dat='" + getCad_dat() + "'" +
            ", cli_mcp=" + getCli_mcp() +
            ", cli_pto=" + getCli_pto() +
            ", cli_fid='" + getCli_fid() + "'" +
            ", cli_bbl='" + getCli_bbl() + "'" +
            ", cli_bmo='" + getCli_bmo() + "'" +
            ", cli_cnt='" + getCli_cnt() + "'" +
            ", cli_dep='" + getCli_dep() + "'" +
            ", cli_civ='" + getCli_civ() + "'" +
            ", cli_nat='" + getCli_nat() + "'" +
            ", cli_pro='" + getCli_pro() + "'" +
            ", cli_tra='" + getCli_tra() + "'" +
            ", cli_fil='" + getCli_fil() + "'" +
            ", cli_cnj='" + getCli_cnj() + "'" +
            ", cli_tbp=" + getCli_tbp() +
            ", cli_fpg='" + getCli_fpg() + "'" +
            ", cli_edc='" + getCli_edc() + "'" +
            ", cli_bac='" + getCli_bac() + "'" +
            ", cli_cic='" + getCli_cic() + "'" +
            ", cli_esc='" + getCli_esc() + "'" +
            ", cli_cec=" + getCli_cec() +
            ", cli_sal=" + getCli_sal() +
            ", cli_dma=" + getCli_dma() +
            ", cli_pla='" + getCli_pla() + "'" +
            ", cli_tec='" + getCli_tec() + "'" +
            ", cli_img='" + getCli_img() + "'" +
            ", cli_imgContentType='" + getCli_imgContentType() + "'" +
            ", cli_esp='" + getCli_esp() + "'" +
            ", cli_cro=" + getCli_cro() +
            ", cli_mun=" + getCli_mun() +
            ", cad_exc='" + getCad_exc() + "'" +
            "}";
    }
}
