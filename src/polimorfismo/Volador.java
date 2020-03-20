/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Josue
 */

//Una interfaz es como una clase abstracta. A diferencia de una 
//clase solo define metodos (atributos no).
//Las interfaces comunmente tienen nombre de adjetivo
//Las clases tienen nombre de alguna cosa.
//La interfaz no debe definir codigo para sus metodos, solo 
//el nombre
//Los metodos en una interfaz son public y abstract, aunque no
//se declara explicitamente

public interface Volador {
    
    public abstract void volar();
    
}
