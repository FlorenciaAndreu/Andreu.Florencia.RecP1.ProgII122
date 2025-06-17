
package andreu.florencia.recp1.progii122;

import java.util.*;

class GestorEspectaculos {
    private List<Espectaculo> espectaculos = new ArrayList<>();

    public void agregarEspectaculo(Espectaculo e) throws EspectaculoDuplicadoExcepcion {
    for (Espectaculo esp : espectaculos) {
        if (esp.equals(e)) {
            throw new EspectaculoDuplicadoExcepcion("Ya existe un espectaculo con ese nombre y fecha.");
        }
    }
    espectaculos.add(e);
}

    public void mostrarEspectaculos() {
        espectaculos.forEach(System.out::println);
    }

    public void transmitirEventos() {
        for (Espectaculo e : espectaculos) {
            if (e instanceof Transmitible t) {
                t.transmitir();
            } else {
                System.out.println("El espectaculo " + e.getNombre() + " no puede ser transmitido.");
            }
        }
    }

    public List<Concierto> filtrarPorGenero(Genero g) {
        List<Concierto> resultado = new ArrayList<>();
        for (Espectaculo e : espectaculos) {
            if (e instanceof Concierto c && c.getGenero() == g) {
                resultado.add(c);
                System.out.println(c);
            }
        }
        return resultado;
    }

    public void calificarEvento(String nombre, int puntaje) {
        for (Espectaculo e : espectaculos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                if (e instanceof Calificable c) {
                    c.calificar(puntaje);
                } else {
                    System.out.println("El espectaculo " + nombre + " no se puede calificar.");
                }
                return;
            }
        }
        System.out.println("No se pudo encontrar el espectaculo con nombre: " + nombre);
    }
}

