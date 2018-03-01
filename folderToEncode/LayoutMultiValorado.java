package br.com.totvs.validador.bean;

import br.com.totvs.summer.persistence.bean.AbstractEntity;

import javax.persistence.*;

/**
 * Created by Diorge Jorge on 26/02/2018.
 */
@Entity
@Table(name = "LAYOUT_MULTIVALORADO")
public class LayoutMultiValorado  extends AbstractEntity {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ID_LAYOUT",referencedColumnName = "ID_LAYOUT"),
            @JoinColumn(name = "TP_SEG",referencedColumnName = "TP_SEG"),
            @JoinColumn(name = "ID_CAMPO",referencedColumnName = "ID_CAMPO")
    })
    private LayoutCnab layoutCnab;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "valor")
    public String valor;
    //Ã ç É É
    @Column(name = "CAMPO_ISENCAO_DATA")
    public Boolean campoIsencaoData;

    @Column(name = "CAMPO_ISENCAO_VALOR")
    public Boolean campoIsencaoValor;

    @Override
    public Object getId() {
        return id;
    }

    public LayoutCnab getLayoutCnab() {
        return layoutCnab;
    }

    public void setLayoutCnab(LayoutCnab layoutCnab) {
        this.layoutCnab = layoutCnab;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean getCampoIsencaoData() {
        return campoIsencaoData;
    }

    public void setCampoIsencaoData(Boolean campoIsencao) {
        this.campoIsencaoData = campoIsencao;
    }

    public Boolean getCampoIsencaoValor() {
        return campoIsencaoValor;
    }

    public void setCampoIsencaoValor(Boolean campoIsencaoValor) {
        this.campoIsencaoValor = campoIsencaoValor;
    }
}
