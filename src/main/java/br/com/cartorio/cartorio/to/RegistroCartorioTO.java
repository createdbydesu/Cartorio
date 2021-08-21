package br.com.cartorio.cartorio.to;

import com.sun.istack.NotNull;

import javax.persistence.UniqueConstraint;

public class RegistroCartorioTO {

    private Long id;

    @NotNull
    private String nomeCartorio;

    @NotNull
    private String enderecoCartorio;

    @NotNull
    private String tiposCertidoes;


    // Getters e Setters

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getnomeCartorio() {return nomeCartorio;}
    public void setNomeCartorio(String nomeCartorio) {this.nomeCartorio = nomeCartorio;}

    public String getenderecoCartorio() {return enderecoCartorio;}
    public void setenderecoCartorio(String enderecoCartorio) {this.enderecoCartorio = enderecoCartorio;}

    public String gettiposCertidoes() {return tiposCertidoes;}
    public void settiposCertidoes(String tiposCertidoes) {this.tiposCertidoes = tiposCertidoes;}

}
