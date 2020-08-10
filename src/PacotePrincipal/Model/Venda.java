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
public class Venda {
    @Id
    int codVenda;
    String tipoPagamento;
    Date data;
    Double valor;

    public Venda() {
    }

    public Venda(int codVenda, String tipoPagamento, Date data, Double valor) {
        
        this.codVenda = codVenda;
        this.tipoPagamento = tipoPagamento;
        this.data = data;
        this.valor = valor;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public Date getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
