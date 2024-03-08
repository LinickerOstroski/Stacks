package pilhajava;

public class Pilha<T> {

    private int topo;
    private T[] elementos;

    public Pilha(int tamanho) { //Construtor
        elementos = (T[]) new Object[tamanho];
        this.topo = -1;

    }

    public boolean isFull() {
        return this.topo == elementos.length - 1; // teste lógico.
        /*
        if(this.topo == elementos.length - 1) {
            return true;
        } else {
            return false;
        }
         */
    }

    public boolean isEmpty() {
        //return this.topo == -1;

        if (this.topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean push(T novoDado) {
        if (this.isFull() == false) { // ! = se não acontecer
            elementos[++topo] = novoDado;
            /*primeiro implementando no topo, depois o valor*/
            return true;
        } // fim if
        return false;
    }// fim push

    public T pop() { //O POP não apaga os dados, ele dá TOPO -1 e o dado fica lá até ser subescrito
        //return elementos[topo--];
        T retorno = elementos[topo];
        topo--;
        return retorno;
    }// fim pop

    public int size() {
        return this.topo + 1; //somamos 1 pois começa no -1, se tenho 0, tenho 1 elemento
    }

    public T peek() {
        return elementos[topo];
    }

    @Override

    public String toString() {
        StringBuilder retorno = new StringBuilder();

        for (int i = this.topo; i >= 0; i--) {
            retorno.append(elementos[i]).append("\n");
        }

        retorno.append("--------");
        return retorno.toString();
    }

}
