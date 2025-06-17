
package andreu.florencia.recp1.progii122;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GestorEspectaculos gestor = new GestorEspectaculos();
        
        System.out.println("\n ****** Bienvenidos a nuestro Gestor de Espectaculos! *****\n");
        
        try {
            gestor.agregarEspectaculo(new Concierto("QuilmesRock", LocalDate.of(2025, 7, 10), 120, Genero.ROCK, Arrays.asList("Soda", "Virus")));
            gestor.agregarEspectaculo(new ObraTeatral("MammaMia", LocalDate.of(2025, 7, 15), 90, Clasificacion.MAYOR13, "Meryl Streep"));
            gestor.agregarEspectaculo(new Concierto("CosquinRock", LocalDate.of(2025, 7, 10), 120, Genero.ROCK, Arrays.asList("Divididos", "La Renga")));
            gestor.agregarEspectaculo(new Concierto("POP!", LocalDate.of(2025, 7, 10), 120, Genero.POP, Arrays.asList("Miranda", "Lali")));
            gestor.agregarEspectaculo(new Festival("SummerFest", LocalDate.of(2025, 12, 1), 180, 3, true));
            gestor.agregarEspectaculo(new Concierto("SuperJazz", LocalDate.of(2025, 7, 10), 120, Genero.JAZZ, Arrays.asList("Saxo1", "Saxo2")));

            // Caso duplicado
            //gestor.agregarEspectaculo(new Concierto("QuilmesRock", LocalDate.of(2025, 7, 10), 120, Genero.ROCK, Arrays.asList("Tan Bionica")));
        } catch (EspectaculoDuplicadoExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n-*-*-* Espectaculos disponibles:  *-*-*-*");
        gestor.mostrarEspectaculos();

        System.out.println("\n*-*-*-* Transmision de eventos:  *-*-*-*");
        gestor.transmitirEventos();

        System.out.println("\n*-*-*-* Calificacion de eventos:  *-*-*-*");
        gestor.calificarEvento("MammaMia", 9);
        gestor.calificarEvento("QuilmesRock", 10);
        gestor.calificarEvento("SummerFest", 8); // no calificable
        gestor.calificarEvento("POP!", 4);
        gestor.calificarEvento("SuperJazz", 2);
        gestor.calificarEvento("CosquinRock", 5);
        gestor.calificarEvento("Hamlet", 8); //no existe

        System.out.println("\n*-*-*-* Nuestros conciertos de: ROCK *-*-*-*");
        gestor.filtrarPorGenero(Genero.ROCK);
        System.out.println("\n*-*-*-* Nuestros conciertos de: POP *-*-*-*");
        gestor.filtrarPorGenero(Genero.POP);
        System.out.println("\n*-*-*-* Nuestros conciertos de: JAZZ *-*-*-*");
        gestor.filtrarPorGenero(Genero.JAZZ);
    }
}
