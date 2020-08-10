/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pedro
 */
 @Entity
 public class Compra {    
    @Id
    private int codCompra;
    private Date data;
    private Float Valor;
    private int quantidade;
    public Compra(){
    
    }

    public Compra(Date data, int codCompra, Float Valor, int quantidade) {
        this.data = data;
        this.codCompra = codCompra;
        this.Valor = Valor;
        this.quantidade = quantidade;
    }
  
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float Valor) {
        this.Valor = Valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
