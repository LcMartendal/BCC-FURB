/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02.view;

import questao02.model.Empresa;
import questao02.model.Funcionario;
import questao02.model.Programador;
import questao02.model.Venda;
import questao02.model.Vendedor;

/**
 *
 * @author Lc Martendal
 */
public class View {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Robson S/A");
        //luiz
        Vendedor luiz = new Vendedor("Luiz", 1000, 10);
        luiz.incluirVenda(new Venda(200));
        luiz.incluirVenda(new Venda(100));
        minhaEmpresa.incluirFuncionario(luiz);
        //Paula
        Vendedor paula = new Vendedor("Paula", 1200, 7);
        paula.incluirVenda(new Venda(500));
        paula.incluirVenda(new Venda(350));
        paula.incluirVenda(new Venda(280));
        minhaEmpresa.incluirFuncionario(paula);
        
        //Julio
        Programador julio = new Programador("Julio", 1000);
        julio.incluirLinguagem("C");
        julio.incluirLinguagem("Java");
        minhaEmpresa.incluirFuncionario(julio);
        
        //Ana
        Programador ana = new Programador("Ana", 1000);
        ana.incluirLinguagem("Java");
        ana.incluirLinguagem("C#");
        minhaEmpresa.incluirFuncionario(ana);
        
         //Anderson
        Programador anderson = new Programador("Anderson", 1200);
        anderson.incluirLinguagem("Phyton");
        minhaEmpresa.incluirFuncionario(anderson);
        
        //José
        Funcionario jose = new Funcionario("Jose", 1000);
        minhaEmpresa.incluirFuncionario(jose);
        
        //Maria
        Funcionario maria = new Funcionario("Maria", 1400);
        minhaEmpresa.incluirFuncionario(maria);
        
        
        
        
       // O programa deve:
// Exibir o custo total que a empresa terá com os salários de todos 
//os tipos de funcionários
        System.out.println("**** CUSTO TOTAL DE SALARIOS ****");
        System.out.println(" R$ "+minhaEmpresa.calcularCustosSalarios());

// Listar o nome de todos os funcionários com seu respectivo custo de salário
       System.out.println("**** RELAÇÃO DE FUNCIONARIOS ****");
       
       for(Funcionario func : minhaEmpresa.getFuncionarios()){
           System.out.println(" "+func.getNome()+ "  - R$ "+func.calcularSalario());
       }
       
// Listar o nome dos vendedores e o percentual de comissão de cada um
       System.out.println("**** RELAÇÃO DE VENDEDORES ****");
       for(Funcionario func : minhaEmpresa.getFuncionarios()){
           if (func instanceof Vendedor){
               System.out.println(" "+func.getNome()+
                               "  - %Comissão "+((Vendedor)func).getPercentualComissao());
           }
           
       }
// Listar os programadores e as linguagens que cada um conhece.
       System.out.println("**** RELAÇÃO DE PROGRAMADORES ****");
       for(Funcionario func : minhaEmpresa.getFuncionarios()){
           if (func instanceof Programador){
               System.out.println(" "+func.getNome()+
                               "  - Linguagens [ "+((Programador)func).getLinguagens()+"]");
           }
           
       }
        
        
    }
}
