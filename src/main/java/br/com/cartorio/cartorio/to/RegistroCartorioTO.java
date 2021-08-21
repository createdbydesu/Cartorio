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
    private String estadoCartorio;

    @NotNull
    private String tiposCertidoes;


    // Getters e Setters

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNomeCartorio() {return nomeCartorio;}
    public void setNomeCartorio(String nomeCartorio) {this.nomeCartorio = nomeCartorio;}

    public String getEnderecoCartorio() {return enderecoCartorio;}
    public void setEnderecoCartorio(String enderecoCartorio) {this.enderecoCartorio = enderecoCartorio;}

    public String getEstadoCartorio() {return estadoCartorio;}
    public void setEstadoCartorio(String estadoCartorio) { this.estadoCartorio = estadoCartorio;}

    public String getTiposCertidoes() {return tiposCertidoes;}
    public void setTiposCertidoes(String tiposCertidoes) {this.tiposCertidoes = tiposCertidoes;}

}
