class MazoMio {
    Carta[] cartas;
    int size;

    public MazoMio(int capacidad) {
        cartas = new Carta[capacidad];
        size = 0;
    }

    public void agregar(Carta c) {
        if (size < cartas.length) {
            cartas[size] = c;
            size++;
        }
    }

    public Carta obtener(int i) {
        return cartas[i];
    }

    public void eliminar(int i) {
        for (int j = i; j < size - 1; j++) {
            cartas[j] = cartas[j + 1];
        }
        size--;
    }

    public int tamaño() {
        return size;
    }

    public boolean vacia() {
        return size == 0;
    }

    public void voltear() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "] ");
            cartas[i].voltear();
        }
    }

    public Carta ultima() {
        if (size == 0) return null;
        return cartas[size - 1];
    }
}