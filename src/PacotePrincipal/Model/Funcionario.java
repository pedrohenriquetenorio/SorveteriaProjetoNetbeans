/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pedro
 */
@Entity 
public class Funcionario {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "cod_funcionario", length = 15, nullable = false)
    private int codFuncionario;
    @Column(name = "cpf", length = 15, nullable = false)
    private String cpf;
    @Column(name = "nome", length = 45, nullable = false)
    private String nome; 
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;
    @Column(name = "endereco", length = 45, nullable = false)
    private String endereco;
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
    @Column(name = "email", length = 45, nullable = false)
    private String email;
//    private String cargo;

    
    public Funcionario(){
    
    }

    public Funcionario(int codFuncionario, String cpf, String nome, String senha, String endereco, String telefone, String email) {
        this.codFuncionario = codFuncionario;
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
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
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    
    
//    public void setCargo(String cargo) {
//        this.cargo = cargo;
//    }

    @Override
    public String toString() {
        return "Funcionario{" + "codFuncionario=" + codFuncionario + ", cpf=" + cpf + ", nome=" + nome + ", senha=" + senha + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }

    
}
