/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13_11;

class nodo {
    protected int dato;
    protected nodo izdo;
    protected nodo dcho;
    
    public nodo(String[] nodo){
        this.dato = dato;
        izdo = dcho = null;
    }
    
    public nodo(int dato, nodo izquierdo, nodo derecho){
        this.dato = dato;
        this.izdo = izquierdo;
        this.dcho = derecho;
    }
    //operaciones de acceso

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(nodo izdo) {
        this.izdo = izdo;
    }

    public nodo getDcho() {
        return dcho;
    }

    public void setDcho(nodo dcho) {
        this.dcho = dcho;
    }
}
