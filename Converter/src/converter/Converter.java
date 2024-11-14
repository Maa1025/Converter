package converter;
import java.util.Scanner;
public class Converter {

    public static void main(String[] args) {

        int menu = 0;
        Scanner input = new Scanner (System.in);
        
        //Menu Selection
        System.out.println("Converter available :");
        System.out.println("1. Mass (kg - pound)");
        System.out.println("2. Distance (km - m)");
        System.out.println("3. Temperature (Celcius - Fahrenheit)");
        System.out.println("4. Length (meter - feet)");
        System.out.println("5. Memory (MB - KB)");
        System.out.print("Choose your converter :");
        menu = input.nextInt();
        
        
        switch(menu) {
            case 1:
                //Mass Converter
                MassConverter.convert();
                break;
            case 2:
                //Distance Converter
                DIstanceConverter.convert();
                break;
            case 3:
                //Temperature Converter
                TemperatureCoonverter.convert();
                break;
            case 4:
                //Length Converter
                LengthConverter.convert();
                break;
            case 5:
                //Memory Converter
                MemoryConverter.convert();
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
    
    }
    
}
