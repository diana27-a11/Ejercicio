/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal2;


public class ProyectoFinal2 {

    private void setRaiz(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addNodo(Nodo nodo, Nodo raiz) {

        if (raiz == null) {

            this.setRaiz(nodo);
        } else {

            if (nodo.getValor() <= raiz.getValor()) {

                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                } else {
                    addNodo(nodo, raiz.getHojaIzquierda());
                }
            } else {

                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                } else {
                    addNodo(nodo, raiz.getHojaDerecha());
                }
            }
        }
    }
}
