/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import  javax.swing.*;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crea el objeto de la clase figuras
        Figuras figuras=new Figuras();
        
        //Se llama el metodo pintar area,que tiene el valor de 5 gracias al constructor
        figuras.pintarArea();
        
        //Se llama el metodo pintar area,que tiene el valor de 10 gracias al constructor
        figuras.pintarPerimetro();
        
        //Se cambia el valor del atributo area de forma directa ya que la variable es publica
        figuras.area=15;
        
        //Se llama el metodo pintar area, que tiene valor 15 luego de modificar el valor
        figuras.pintarArea();
        
       
    }   
    
}
