/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.pessoa;

/**
 *
 * @author Vinixai
 */
public class ChefeDeDepartamento extends Funcionario {
    private String departamento;
    
    public ChefeDeDepartamento(String nome, int idade, double salario, String departamento){
        super(nome, idade, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Trabalha no Departamento: " + departamento);
    }
   
}
    

    
    

