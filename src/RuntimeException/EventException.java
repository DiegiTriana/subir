/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class EventException {
    public static void main(String[] args) {
        try {
            // Simulamos un escenario donde se lanza la excepción EventException
            throw new EventException("Error: Se ha producido un error en el evento.");
        } catch (EventException e) {
            // Manejamos la excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}