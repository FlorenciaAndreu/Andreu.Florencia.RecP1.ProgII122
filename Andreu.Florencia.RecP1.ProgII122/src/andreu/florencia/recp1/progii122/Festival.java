
package andreu.florencia.recp1.progii122;
import java.time.LocalDate;

class Festival extends Espectaculo implements Transmitible {
    private int escenarios;
    private boolean camping;

    public Festival(String nombre, LocalDate fecha, int duracion, int escenarios, boolean camping) {
        super(nombre, fecha, duracion);
        this.escenarios = escenarios;
        this.camping = camping;
    }

    @Override
    public void transmitir() {
        System.out.println("Transmitiendo festival: " + nombre);
    }

    @Override
    public String toString() {
        return super.toString() + ", Escenarios: " + escenarios + ", Camping: " + (camping ? "Si" : "No");
    }
}

