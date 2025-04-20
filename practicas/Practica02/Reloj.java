public class Reloj {
    // ATRIBUTOS
    private int segundos = this.segundos > 60 ? this.segundos % 60: this.segundos;
    private int minutos = this.minutos > 60 ? this.minutos % 60 : this.minutos;
    private int horas = this.horas > 24 ? this.horas %24 : this.horas;
  

    // METODO CONSTRUCTOR
    public Reloj(int segundos , int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        if(this.segundos >= 60) this.segundos = this.segundos %60 ;
        if(this.minutos >= 60) this.minutos = this.minutos %60;
        if(this.horas >= 24) this.horas = this.horas % 24;

    }
    //METODO PARA VER LA HORA
    public String laHoraEs(){
        String nuevaSegundos = this.segundos < 10 ? "0" + this.segundos : "" + this.segundos;
        String nuevaMinutos= this.minutos < 10 ? "0" + this.minutos : "" + this.minutos;
        String nuevaHora = this.horas < 10 ? "0" + this.horas : "" + this.horas;
        
        
        String laHora = nuevaHora + ":" + nuevaMinutos + ":" + nuevaSegundos;
        return laHora;
    }


    //METODO PARA SUMAR SEGUNDOS/MINUTOS/HORAS
    public String manecillas(int sec){
        for(int i = 0; i < sec; i++){
            ++this.segundos;
            if(this.segundos == 60){
                this.segundos = 0;
                ++this.minutos;
            }
            if(this.minutos == 60){
                this.minutos = 0;
                ++this.horas;
            }
            if(this.horas == 24){
                this.horas = 0;
            }
        }
        String nuevaSegundos = this.segundos < 10 ? "0" + this.segundos : "" + this.segundos;
        String nuevaMinutos= this.minutos < 10 ? "0" + this.minutos : "" + this.minutos;
        String nuevaHora = this.horas < 10 ? "0" + this.horas : "" + this.horas;

        String laHora = nuevaHora + ":" + nuevaMinutos + ":" + nuevaSegundos;
        return laHora;
        }
}