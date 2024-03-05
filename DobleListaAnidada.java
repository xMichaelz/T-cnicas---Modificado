package com.mycompany.hotelfollowers;

public class DobleListaAnidada {
    public Object[][] dobleLista;

    public DobleListaAnidada() {
        this.dobleLista = new Object[7][3];
    }

    public void agregarElemento(Object dato, int posicionPrimeraLista, int posicionSegundaLista) {
        if (posicionPrimeraLista >= 0 && posicionPrimeraLista < 7 && posicionSegundaLista >= 0 && posicionSegundaLista < 3) {
            if (dobleLista[posicionPrimeraLista][posicionSegundaLista] == null) {
                dobleLista[posicionPrimeraLista][posicionSegundaLista] = dato;
                
                System.out.println("Se ha agregado " + dato + " en la posición [" + posicionPrimeraLista + "][" + posicionSegundaLista + "]");
            } else {
                boolean posicionEncontrada = false;
                for (int i = 0; i < 3; i++) {
                    if (dobleLista[posicionPrimeraLista][i] == null) {
                        dobleLista[posicionPrimeraLista][i] = dato;
                        System.out.println("Se ha agregado " + dato + " en la posición [" + posicionPrimeraLista + "][" + i + "]");
                        posicionEncontrada = true;
                        break;
                    }
                }
                if (!posicionEncontrada) {
                    System.out.println("La lista en la posición [" + posicionPrimeraLista + "] está llena.");
                }
            }
        } else {
            System.out.println("Posiciones fuera de rango.");
        }
    }

    public static void main(String[] args) {
        DobleListaAnidada miDobleLista = new DobleListaAnidada();

        miDobleLista.agregarElemento("Dato1", 2, 1);
        miDobleLista.agregarElemento("Dato2", 4, 2);
        miDobleLista.agregarElemento("Dato3", 2, 1); 

        for (Object[] fila : miDobleLista.dobleLista) {
            for (Object elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
