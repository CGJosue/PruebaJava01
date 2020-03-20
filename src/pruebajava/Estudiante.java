/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava;

/**
 *
 * @author sinfante
 */
//La clase estudiante se deriva de la clase persona.
//Para derivar una clase de otra, se utiliza la palabra reservada extends.
public class Estudiante extends Persona {
    
    int matricula;

    public Estudiante(int matricula) {
        //De igual manera que en C++, los constructores se invocan recursivamente.
        //Se ejecuta primero el codigo del constructor de la clase padre, y
        //despues el codigo de este constructor.
        //Si no se especifica que constructor se ejecutara, automaticamente se
        //ejecuta el constructor sin parametros de la clase padre.
        this.matricula = matricula;
    }
    public Estudiante(String nombre,int matricula){
        //para ejecutar un constructor especifico de la clase padre, se utiliza
        //super(). La invocacion a super debe ser siempre la primera linea de
        //codigo del constructor
        super(nombre,19);
        this.matricula=matricula;
    }
    public Estudiante(String nombre, int edad, int matricula){
        super(nombre,edad);
        this.matricula=matricula;
    }
    public Estudiante(){
        //cuando declaramos un constructor, el constructor defaul ya no existira.
        //Si queremos un constructor sin parametros, es necesario declararlo.
    }
    @Override
    public void saludar(){
        System.out.print("Hola, soy el estudiante "+getNombre()+", con matricula ");
        System.out.println(""+matricula+"...");
    }
    
    //Modificamos que es lo que hace Estudiante cuando se compara con equals.
    //El codigo heredado de Object compara referencia y clase. Necesitamos que
    //Compara nombre y matricula
    
    @Override
    //Compara este objeto contra el objeto o, devuelve verdadero si son iguales
    //(Comparamos o contra this)
    public boolean equals(Object o){
        if(o instanceof Estudiante){
            Estudiante e2=(Estudiante)o;
            if(this.matricula==e2.matricula);
            return true;
        }
        return false;
    }
    //Cuando un objeto es implreso en println, o cuando es cocatenado a una 
    //cadena, el objeto es convertido a cadena por medio del metodo toString().
    //Si queremos modificar el comportamiento basico definido en Object, necesitamos
    //sobreescribir toString().

    @Override
    public String toString() {
        
        //Generamos una cadena que contenga el nombre, la edad, y la matricula
        String ret="Estudiante "+nombre+ " , "+edad+" anios, matricula "+matricula;
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
