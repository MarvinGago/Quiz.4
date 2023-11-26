/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz4;
import javax.swing.JOptionPane;
/**
 *
 * @author CPUw1010
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion de los arreglos de las canciones 
        Cancion[] canciones = new Cancion[10];
        canciones[0] = new Cancion(1, "Normal", "Ferxxo", "3:30", 2020);
        canciones[1] = new Cancion(2, "A sky full a star", "Coldplay", "4:15", 2021);
        canciones[2] = new Cancion(3, "My Universe", "Coldplay", "2:45", 2019);
        canciones[3] = new Cancion(4, "Chorrito pa la animas", "Ferxxo", "3:50", 2022);
        canciones[4] = new Cancion(5, "Que se joda", "Anuel", "3:10", 2023);
        canciones[5] = new Cancion(6, "vibra", "Anuel", "4:00", 2021);
        canciones[6] = new Cancion(7, "Hipocrita", "Anuel", "3:20", 2020);
        canciones[7] = new Cancion(8, "Pepas", "Farruko", "3:45", 2022);
        canciones[8] = new Cancion(9, "Tulum", "PP & Grupo Frontera", "3:15", 2018);
        canciones[9] = new Cancion(10, "Si la Calle me llama", "Eladio", "4:30", 2023);

        
        
        
       // Obtener canciones anteriores al pasado
        int anoActual = 2023;
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() < anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener musicas al presente
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() == anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener musica posteriores al presente
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() > anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener la canción de mayor duración
        Cancion cancionMayorDuracion = canciones[0];
        for (Cancion cancion : canciones) {
            if (cancion.getDuracion().compareTo(cancionMayorDuracion.getDuracion()) > 0) {
                cancionMayorDuracion = cancion;
            }
        }
        JOptionPane.showInputDialog(cancionMayorDuracion.getTitulo ());

        // Obtener el autor de la canción en la primera posición
        String autorPrimeraCancion = canciones[0].getAutor();
        System.out.println(autorPrimeraCancion);

        // El resultado de todas las canciones
        for (Cancion cancion : canciones) {
            JOptionPane.showInputDialog("Id: " + cancion.getIdCancion() + ", Titulo: " + cancion.getTitulo() + ", Autor: " + cancion.getAutor() + ", Duracion: " + cancion.getDuracion() + ", year of creation: " + cancion.getAnoCreacion());
        }

    
    
    

        //llamados a los getters y setters en el programa principal
        Cancion cancion = canciones[0];
        System.out.println(cancion.getTitulo());  
        cancion.setTitulo("Spotify le da la Bienvenida ");  
        System.out.println(cancion.getTitulo());  
    }
}
