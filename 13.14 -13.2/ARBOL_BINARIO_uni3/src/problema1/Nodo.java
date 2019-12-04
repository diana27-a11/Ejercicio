package problema1;

public class Nodo {
     protected int dato;
        protected  Nodo izdo;
        protected  Nodo dere;
        
        public Nodo (int dato) {
            this.dato=dato;
        izdo = dere = null;
        }
        
        public Nodo (int dato, Nodo izquierdo, Nodo derecho) {
        this.dato = dato;
        this.izdo = izquierdo;
        this.dere = derecho;
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

        public Nodo getIzdo() {
            return izdo;
        }

        public void setIzdo(Nodo izdo) {
            this.izdo = izdo;
        }

        public Nodo getDere() {
            return dere;
        }

        public void setDere(Nodo dere) {
            this.dere = dere;
        }
        
}
