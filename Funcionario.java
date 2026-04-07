/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;
import herança.Pessoa;
/**
 *
 * @author vitor
 */
public class Funcionario extends Pessoa {
    private String setor;
    private String trabalhando; 
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
