// Representa los días de la semana
public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    // Sobrescribir toString() para cambiar el formato
    @Override
    public String toString() {
        // Convertir el nombre a minúsculas y añadir "Hoy es "
        return "Hoy es " + this.name().toLowerCase();//El thisname y tolowercase para convertir en minusculas
    }
}