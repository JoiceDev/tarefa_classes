/**
 * Class to test Car class functionality
 * @author JoiceDev
 * @version 1.0
 */
package tarefa_classes;

public class TesteCar {
    /**
     * Main method to demonstrate Car class usage
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating car objects
        Car carro1 = new Car(1, "Gol", 2020, "Prata");
        Car carro2 = new Car(2, "Civic", 2024, "Preto");

        // Testing methods with first car
        System.out.println("=== Car 1 Data ===");
        System.out.println("Code: " + carro1.getCodigo());
        System.out.println("Model: " + carro1.getModelo());
        System.out.println("Year: " + carro1.getAno());
        System.out.println("Color: " + carro1.getCor());

        // Modifying second car data
        carro2.setCor("Azul");
        carro2.setAno(2023);

        // Displaying second car data after modifications
        System.out.println("\n=== Car 2 Data ===");
        System.out.println("Code: " + carro2.getCodigo());
        System.out.println("Model: " + carro2.getModelo());
        System.out.println("Year: " + carro2.getAno());
        System.out.println("Color: " + carro2.getCor());
    }
}