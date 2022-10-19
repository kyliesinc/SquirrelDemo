package OOPDemo;
import OOPDemo.Squirrel;

public class SquirrelDemo {
    
    public static void main(String[] args) {

        // define variables
        Squirrel waltSquirrel;
        Squirrel jesseSquirrel;
        Squirrel beanSquirrel;
        Squirrel alvinSquirrel;

        // set variables for the specific squirrels
        waltSquirrel = new Squirrel(20.3, 10.5, "Brown", "Brown", "Walter");
        jesseSquirrel = new Squirrel(25.1, 2.6, "Gray", "Western Gray Squirrel", "Jesse");
        beanSquirrel = new Squirrel(43.8, 15.1, "Black", "Black Squirrel", "Bean");
        alvinSquirrel = new Squirrel(12.3, 5.2, "Brown", "Chipmunk", "Alvin");

        // get them to do stuff by calling methods from squirrel main
        waltSquirrel.walk();
        jesseSquirrel.storeNuts();
        beanSquirrel.scramble();
        alvinSquirrel.injury();

        System.out.println("Alvin's Health: " + alvinSquirrel.getHealth());

    }
}
