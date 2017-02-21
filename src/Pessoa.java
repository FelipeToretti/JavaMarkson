/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edutec
 */
public abstract class Pessoa implements IPessoa
{
    private String nome,rg,cpf;

    public Pessoa(String nome, String rg, String cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String retornaDados(){
     String dados = "Nome : "+this.getNome()+"\nCPF : "+this.getCpf()+"\nRG : "+this.getRg();
     return dados;
    }
    
    @Override
    public void AlteraNome(String nome){
    this.setNome(nome);
    }
    
    
}
      
    

