/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Operaciones {
    
    private int numero1;
    private int numero2;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    public int suma(){
        
        int suma;
        suma = numero1+numero2;
        return suma;
    }
    public int resta(){
        
        int resta;
        resta = numero1-numero2;
        return resta;
    }
    public int multiplicacion(){
        
        int multiplicacion;
        multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    public int division(){
        
        int division;
        division = numero1/numero2;
        return division;
    }
}
