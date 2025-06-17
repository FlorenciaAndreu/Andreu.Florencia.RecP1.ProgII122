
package andreu.florencia.recp1.progii122;

import java.time.LocalDate;
import java.util.Objects;

abstract class Espectaculo {
    protected String nombre;
    protected LocalDate fecha;
    protected int duracion;

    public Espectaculo(String nombre, LocalDate fecha, int duracion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espectaculo that = (Espectaculo) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }

    @Override
    public String toString() {
        return "Espectaculo: " + nombre + ", Fecha: " + fecha + ", Duracion: " + duracion + " minutos";
    }
}