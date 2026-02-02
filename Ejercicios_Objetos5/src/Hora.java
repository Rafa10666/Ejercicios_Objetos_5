public class Hora {
    // Atributos
    private int hora;
    private int minutos;

    // Constructor
    public Hora(int hora, int minutos) {
        this.hora = hora;//Este this es el atributo del objeto
        this.minutos = minutos;
    }

    // Incrementa un minuto
    //Metodo para incrementar
    public void inc() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }
    //Metodo para cambiar los minutos
    // Cambia los minutos si es válido
    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.minutos = valor;
            return true;
        }
        return false;
    }
    //Metodo para cambiar la hora
    // Cambia la hora si es válido
    public boolean setHora(int valor) {
        if (valor >= 0 && valor <= 23) {
            this.hora = valor;
            return true;
        }
        return false;
    }
    //Metodo toString
    // Devuelve la hora como String
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}