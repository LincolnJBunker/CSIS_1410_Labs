package abstractClass;

/**
 * Main method for package abstractClass
 * 
 * creates an array of two printers, with an instance for Inkjet and Laser and loops through each of them 11 times
 * contains conditional statements to refill & display the remaining toner and cartridge of each printer dynamically
 */
public class PrinterApp {
	
    /**
     * Main method for this application
     * 
     * It creates an array of Printer objects, prints each printer, 
     * calls the print method multiple times, and refills toner/cartridge.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create instances of Inkjet and Laser printers
        Printer[] printers = {
            new InkjetPrinter("Canon TS202"),
            new LaserPrinter("Samsung Xpress")
        };

        // Loop through each printer
        for (Printer printer : printers) {
            System.out.println(printer);

            for (int i = 0; i < 11; i++) {
                printer.print();
            }
            
            System.out.println();

            // Refill and display remaining toner/cartridge dynamically
            if (printer instanceof InkjetPrinter) {
                ((InkjetPrinter) printer).refillCartridge();
                System.out.println("Remaining cartridge after refilling: " + ((InkjetPrinter) printer).getRemainingCartridge() + "%");
            } else if (printer instanceof LaserPrinter) {
                ((LaserPrinter) printer).refillToner();
                System.out.println("Remaining toner after refilling: " + ((LaserPrinter) printer).getRemainingToner() + "%");
            }

            System.out.println();
        }
    }
}
