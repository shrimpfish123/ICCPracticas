public class Main {

    public static void main(String[] args) {
        Reloj relojDeMesa = new Reloj(70,7,25);
        
        
        System.out.println("El reloj marca las: "+relojDeMesa.laHoraEs());
        System.out.println("Ahora el reloj marca las: "+relojDeMesa.manecillas(60));
        System.out.println("El reloj marca las: "+relojDeMesa.laHoraEs());

    }
}