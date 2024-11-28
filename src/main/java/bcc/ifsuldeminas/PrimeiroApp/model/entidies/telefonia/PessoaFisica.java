/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entidies.telefonia;


public class PessoaFisica extends Cliente{
    public String CPF;
    
     public PessoaFisica(String CPF, String nome, String endereco){
            super(nome,endereco);
            this.CPF=CPF;         
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
     
}
