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

/**NÃO SERÁ IMPLEMENTADO SOMENTE UMA TABELA NO BANCO*/
@Entity
public class Fornecedor {
    @Id
    int codFornecedor;
    String nome;
    String cnpj;
    String email;
    String telefone;
    String marca;

    public Fornecedor() {
    }

    public Fornecedor(int codFornecedor, String nome, String cnpj, String email, String telefone, String marca) {
        this.codFornecedor = codFornecedor;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.marca = marca;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMarca() {
        return marca;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
   
    
    
    
    
    
}
