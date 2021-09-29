package br.edu.ifsp.projectstringbloomis.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long localId;
    private String nome;
    private String avaliacao;
    private String rua;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Usuario usuario;
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Lugar() {
        
    }

    public Lugar(String nome, String avaliacao, String rua) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.rua = rua;
    }
    public Long getLocalId() {
        return localId;
    }
    public void setLocalId(Long localId) {
        this.localId = localId;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    

}
