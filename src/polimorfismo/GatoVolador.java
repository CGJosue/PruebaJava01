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
public class GatoVolador extends Gato implements Volador{

    @Override
    public void volar() {
        System.out.println("El gato VOLADORRR!");
    }
    
    @Override
    public void cazar(){
        System.out.println("Cazando un Aguila...");
    }
    
    @Override
    public void comer(){
        cazar();
        System.out.println("Comiendo un aguila que acabo de cazar");
    }
    
}
