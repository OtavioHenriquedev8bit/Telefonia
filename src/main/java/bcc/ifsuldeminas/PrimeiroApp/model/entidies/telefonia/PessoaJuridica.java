/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entidies.telefonia;

/**
 *
 * @author 202211000016
 */
public class PessoaJuridica extends Cliente {
    public String CPF;

    public PessoaJuridica(String CPF,String nome, String endereco) {
         super(nome,endereco);
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
