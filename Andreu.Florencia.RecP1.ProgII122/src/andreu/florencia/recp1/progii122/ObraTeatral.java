
package andreu.florencia.recp1.progii122;

import java.time.LocalDate;

class ObraTeatral extends Espectaculo implements Calificable {
    private Clasificacion clasificacion;
    private String director;
    private int puntajeAcumulado;
    private int cantidadCalificaciones;

    public ObraTeatral(String nombre, LocalDate fecha, int duracion, Clasificacion clasificacion, String director) {
        super(nombre, fecha, duracion);
        this.clasificacion = clasificacion;
        this.director = director;
        this.nombre = nombre;
    }

    @Override
    public void calificar(int puntaje) {
        puntajeAcumulado += puntaje;
        cantidadCalificaciones++;
        System.out.println("Obra " + nombre + " calificada con: " + puntaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", Clasificacion: " + clasificacion + ", Director: " + director;
    }
}
