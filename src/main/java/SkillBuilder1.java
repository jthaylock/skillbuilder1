import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1
{
    public static void main(String[] args)
    {
        String name;
        double spice;
        double value;
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        name = input.next();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a floating-point number:");
        spice = in.nextDouble();
        value = (4.0/3.0) * Math.pow(2.0,Math.sqrt(5.0)/Math.pow(spice,3.0));
        System.out.println("Well " + name + " the spice value resulted in " + value);
        double roundedValue = Math.round(value*100.0)/100.0;
        System.out.println("And the converted value is " + roundedValue);
        calcWallPaint();
    }

    public static void calcWallPaint()
    {
        Scanner diffInput = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = diffInput.nextDouble();

        Scanner newInput = new Scanner(System.in);
        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = newInput.nextDouble();
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");
        double gallons = wallArea / 350;
        System.out.printf("Paint needed: %.2f" + " gallons\n", gallons);
        double cans = Math.ceil(gallons);
        System.out.print("Cans needed: " + cans);
    }
}
