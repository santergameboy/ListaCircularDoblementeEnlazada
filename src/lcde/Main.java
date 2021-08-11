package lcde;

public class Main {
    public static void main(String[] args) {
        ListaS lista = new ListaS();
        System.out.println(lista.vacio());
        for (int i = 10; i >0 ; i--) {
            lista.insertar(i);
        }
        lista.watch();
        System.out.println(lista.vacio());
        lista.delete();
        lista.delete();

        lista.watch();
        lista.showBack();
    }
}