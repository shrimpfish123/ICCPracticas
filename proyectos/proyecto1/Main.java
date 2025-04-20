public class Main {

    public static void main(String[] args) {
        
        Recipiente jarra = new Recipiente(8,18);
        Recipiente jarra2 = new Recipiente(10,18);
        
        //Comienzo de la presentación de los metodos
        System.out.println("CAPACIDAD");
        System.out.println(jarra.capacidad());
        System.out.println("*********************************");
        System.out.println("ESTA VACIO");
        System.out.println(jarra.estaVacio());
        System.out.println("*********************************");
        System.out.println("RELLENA");
        System.out.println(jarra.rellena(76.8));
        System.out.println("*********************************");
        System.out.println("CAPACIDAD RESTANTE");
        System.out.println(jarra.capacidadRestante());
        System.out.println("*********************************");
        System.out.println("ESTA LLENO");
        System.out.println(jarra.estaLleno());
        System.out.println("*********************************");
        System.out.println("VIERTE LA JARRA EN LA JARRA 2");
        jarra.vierte(jarra2);
        System.out.println("*********************************");
        System.out.println("TIENEN LAS MISMAS DIMENSIONES");
        System.out.println(jarra.mismasDimensiones(jarra2));
        System.out.println("*********************************");
        System.out.println("TIENEN LA MISMA CAPACIDAD");
        System.out.println(jarra.mismaCapacidad(jarra2));
        System.out.println("*********************************");
        System.out.println("LA JARRA CONTIENE MAS");
        System.out.println(jarra.contieneMas(jarra2));
        System.out.println("*********************************");
        System.out.println("LA JARRA TIENE MAS CAPACIDAD");
        System.out.println(jarra.cabeMas(jarra2));
        System.out.println("*********************************");
        System.out.println("VACIA LA JARRA");        
        System.out.println(jarra.vacia());
        System.out.println("*********************************");
        System.out.println("MUESTRA DE LA JARRA");
        System.out.println(jarra.muestra());
        System.out.println("*********************************");
        System.out.println("CREA UN RECIPIENTE IDENTICO A LA JARRA ");
        System.out.println(jarra.creaContenedorJusto());
        System.out.println("*********************************");
        System.out.println("MUETRA CON EL CLON DE LA JARRA");
        System.out.println(jarra.creaContenedorJusto().muestra());
        System.out.println("FIN.......");
    }
    
}