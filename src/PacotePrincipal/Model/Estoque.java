/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pedro
 */
@Entity
public class Estoque {
    @Id
    int codEstoque;
    String validade;
    int quantidade;
    String tipo;

    public Estoque() {
    }

    public Estoque(int codEstoque, String validade, int quantidade, String tipo) {
        this.codEstoque = codEstoque;
        this.validade = validade;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public int getCodEstoque() {
        return codEstoque;
    }

    public String getValidade() {
        return validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCodEstoque(int codEstoque) {
        this.codEstoque = codEstoque;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
