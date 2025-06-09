class Carta {
    String[] dife;

    public Carta(String[] dife) {
        this.dife = dife;
    }

    public void voltear() {
        for (String c : dife) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public boolean valido(Carta otra) {
        int iguales = 0;
        for (int i = 0; i < dife.length; i++) {
            if (dife[i].equals(otra.dife[i])) {
                iguales++;
            }
        }
        return iguales >= 3; 
    }
}