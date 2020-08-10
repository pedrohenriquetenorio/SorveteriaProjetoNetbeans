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
public class Funcionario {
    @Id
    private int codFuncionario;
    private String cpf;
    private String nome; 
    private String senha;
    private String endereço;
    private String telefone;
    private String email;
//    private String cargo;

    
    public Funcionario(){
    
    }

    public Funcionario(int codFuncionario, String cpf, String nome, String senha, String endereço, String telefone, String email) {
        this.codFuncionario = codFuncionario;
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
    }
    
    public int getCodFuncionario() {
        return codFuncionario;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

//    public String getCargo() {
//        return cargo;
//    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setCargo(String cargo) {
//        this.cargo = cargo;
//    }
    
}
