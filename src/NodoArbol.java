import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NodoArbol {
    String valor;
    NodoArbol izquierda, derecha;

    public NodoArbol(String valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }

    public NodoArbol(NodoArbol izquierda, String valor, NodoArbol derecha) {
        this.valor = valor;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
}

class Pila {
    private Stack<Object> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public void push(Object item) {
        pila.push(item);
    }

    public Object pop() {
        return pila.pop();
    }

    public Object top() {
        return pila.peek();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }
}


