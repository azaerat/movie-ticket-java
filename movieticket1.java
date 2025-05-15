import java.util.Scanner;

public class movieticket1 {
    public static void main(String[] args) {
        final double ticketPrice = 10.0;
        Scanner keyboard = new Scanner(System.in);
        double total = 0.0;
        String selectedMovie;

        System.out.println("Enter a movie you would like to see.");
        System.out.println("COMEDY: Training Day | White Chicks");
        System.out.println("ACTION: 21 Jump Street | The Flash");
        System.out.println("HORROR: The Nun | The Exorcist");
        System.out.println("CHILDREN: Despicable Me | Elemental");
        System.out.println("THRILLER: Harriet | Sound of Freedom");

        selectedMovie = keyboard.nextLine();

        if (selectedMovie.equalsIgnoreCase("cancel")) {
            System.out.println("Order canceled.");
        } else if (selectedMovie.equalsIgnoreCase("delete")) {
            System.out.println("Ticket deleted.");
        } else {
            total += cost(selectedMovie, ticketPrice);
            System.out.println("Current total: $" + total);
        }

        System.out.println("Would you like to buy another movie ticket?");
        selectedMovie = keyboard.nextLine();

        if (!selectedMovie.equalsIgnoreCase("no")) {
            System.out.println("Order complete. Your total is: $" + total);
        } else {
            System.out.println("Thank you. Your order has been processed.");
        }

        keyboard.close();
    }

    public static double cost(String selectedMovie, double ticketPrice) {
        if (selectedMovie.equalsIgnoreCase("Training Day") ||
            selectedMovie.equalsIgnoreCase("White Chicks") ||
            selectedMovie.equalsIgnoreCase("21 Jump Street") ||
            selectedMovie.equalsIgnoreCase("The Flash") ||
            selectedMovie.equalsIgnoreCase("The Nun") ||
            selectedMovie.equalsIgnoreCase("The Exorcist") ||
            selectedMovie.equalsIgnoreCase("Despicable Me") ||
            selectedMovie.equalsIgnoreCase("Elemental") ||
            selectedMovie.equalsIgnoreCase("Harriet") ||
            selectedMovie.equalsIgnoreCase("Sound of Freedom")) {
            return ticketPrice;
        } else {
            System.out.println("Movie not recognized.");
            return 0.0;
        }
    }
}

