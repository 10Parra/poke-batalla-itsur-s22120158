/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
<<<<<<< Updated upstream
=======
import mx.edu.itsur.pokebatalla.model.pokemons.Charmeleon;
import mx.edu.itsur.pokebatalla.model.pokemons.Blastoise;
import mx.edu.itsur.pokebatalla.model.pokemons.Ekans;
import mx.edu.itsur.pokebatalla.utilities.FileManager;
import java.io.IOException;
>>>>>>> Stashed changes

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< Updated upstream
        System.out.println("Hello PokeBatalla!");
        
        //Instanciar pokemons
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        
        //Instanciar entrenadores y que capturen pokemons
        Entrenador ent1 = new Entrenador("Hannia");
=======
        System.out.println("¡Hola PokeBatalla!");

        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        Ekans ekansSalvaje = new Ekans();
        Blastoise blastoiseSalvaje = new Blastoise();
        Charmeleon charmeleonSalvaje = new Charmeleon();

        Entrenador ent1 = new Entrenador("Parra");
>>>>>>> Stashed changes
        ent1.capturarPokemon(pika);
        ent1.capturarPokemon(bullb);

        Entrenador ent2 = new Entrenador("Stacy");
        ent2.capturarPokemon(charm);
<<<<<<< Updated upstream
        
        //Instanciar batalla e iniciarla.
        Batalla b = new Batalla(ent1, ent2);
        b.desarrollarBatalla();
        
=======
        ent2.capturarPokemon(ekansSalvaje);
        ent2.capturarPokemon(charmeleonSalvaje);
        System.out.println("¿Deseas cargar una partida guardada? (Y/N)");
        char respuestaCargar = obtenerRespuestaUsuario();

        Batalla examen;
        if (respuestaCargar == 'Y' || respuestaCargar == 'y') {
            examen = FileManager.cargarPartida();
            if (examen == null) {
                examen = new Batalla(ent1, ent2);
            }
        } else {
            examen = new Batalla(ent1, ent2);
        }

        examen.desarrollarBatalla();
    }

    private static char obtenerRespuestaUsuario() {
        try {
            char respuesta = (char) System.in.read();
            System.in.read(new byte[System.in.available()]); // Limpiar buffer
            return respuesta;
        } catch (IOException ex) {
            ex.printStackTrace();
            return 'N'; // Por defecto, no cargar partida en caso de error
        }
>>>>>>> Stashed changes
    }
    
}
