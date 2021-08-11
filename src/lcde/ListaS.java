package lcde;

public class ListaS {
    Nodo inicio;


    public ListaS() {
        inicio = null;
    }

    public boolean vacio() {
        return inicio == null;
    }

    public void insertar(Object dato) {
        if (vacio()) {
            Nodo nuevo = new Nodo(null, dato, null);
            inicio = nuevo;

        } else {
            Nodo nuevo = new Nodo(null, dato, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void delete() {
        if (!vacio()) {
            inicio = inicio.getSiguiente();
        }
    }

    public void watch() {
        if (!vacio()) {
            Nodo wtc = inicio;

            while (wtc != null) {
                System.out.print(wtc.getDato() + "  ");
                wtc = wtc.getSiguiente();
            }
            System.out.println();
        }
    }

    public void showBack() {
        if (!vacio()) {
            Nodo wtc = inicio;

            while (wtc.getSiguiente() != null) {
                wtc = wtc.getSiguiente();
            }
            Nodo tmp = wtc;
            while (tmp != null) {
                System.out.print(tmp.getDato() + " ");
                tmp = tmp.getAnterior();

            }
            System.out.println();
        }
    }
}
