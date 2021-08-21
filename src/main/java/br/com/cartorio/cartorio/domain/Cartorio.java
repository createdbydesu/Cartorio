package br.com.cartorio.cartorio.domain;

import br.com.cartorio.cartorio.to.RegistroCartorioTO;

import javax.persistence.*;


// Criando as nossas tabelas

@Entity
@Table(name = "CARTORIO")
public class Cartorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOME_CARTORIO")
    private String nomeCartorio;

    @Column(name = "ENDERECO_CARTORIO")
    private String enderecoCartorio;

    @Column(name = "ESTADO_CARTORIO")
    private String estadoCartorio;

    @Column(name = "TIPOS_CERTIDOES")
    private String tiposCertidoes;

    // Construtor

    public Cartorio(){

    }

    public Cartorio(RegistroCartorioTO registroCartorioTO){
        this.id = registroCartorioTO.getId();
        this.nomeCartorio = registroCartorioTO.getNomeCartorio();
        this.enderecoCartorio = registroCartorioTO.getEnderecoCartorio();
        this.estadoCartorio = registroCartorioTO.getEstadoCartorio();
        this.tiposCertidoes = registroCartorioTO.getTiposCertidoes();
    }

    // Getters e Setters

    // se mais pra frente der erro, tenta colocar os getters e setter com letra maiuscula getNomeCartorio

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNomeCartorio() {return nomeCartorio;}
    public void setNomeCartorio(String nomeCartorio) {this.nomeCartorio = nomeCartorio;}

    public String getEnderecoCartorio() {return enderecoCartorio;}
    public void setEnderecoCartorio(String enderecoCartorio) {this.enderecoCartorio = enderecoCartorio;}

    public String getTiposCertidoes() {return tiposCertidoes;}
    public void setTiposCertidoes(String tiposCertidoes) {this.tiposCertidoes = tiposCertidoes;}

}
