
package andreu.florencia.recp1.progii122;

import java.util.List;
import java.time.LocalDate;

class Concierto extends Espectaculo implements Transmitible, Calificable {
    private Genero genero;
    private List<String> artistas;
    private int puntajeAcumulado;
    private int cantidadCalificaciones;

    public Concierto(String nombre, LocalDate fecha, int duracion, Genero genero, List<String> artistas) {
        super(nombre, fecha, duracion);
        this.genero = genero;
        this.artistas = artistas;
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    @Override
    public void transmitir() {
        System.out.println("Transmitiendo concierto: " + nombre);
    }

    @Override
    public void calificar(int puntaje) {
        puntajeAcumulado += puntaje;
        cantidadCalificaciones++;
        System.out.println("Concierto " + nombre + " calificado con: " + puntaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", Genero: " + genero + ", Artistas: " + artistas;
    }
}