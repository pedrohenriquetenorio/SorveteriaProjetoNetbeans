/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pedro
 */
@Entity
public class Caixa {
    @Id
   // @Column(name = "cod_funcionario", length = 15, nullable = false)
    int codCaixa;
   // @Column(name = "cod_funcionario", length = 15, nullable = false)
    Date data;

    public Caixa() {
    }

    public Caixa(int codCaixa, Date data) {
        this.codCaixa = codCaixa;
        this.data = data;
    }

    public int getCodCaixa() {
        return codCaixa;
    }

    public Date getData() {
        return data;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    public void setData(Date data) {
        this.data = data;
    }

    
}
