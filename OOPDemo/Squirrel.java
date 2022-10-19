package OOPDemo;

/**
 * Squirrel object definition
 */
public class Squirrel{

    // instance variables 
    Double heightDouble;
    Double weightDouble;
    String colouString;
    String speciesString;
    String nameString;
    int healthInt;


    // constructor

    /**
     * Squirrel Constructor
     * @param newHeightDouble
     * @param newWeightDouble
     * @param newColourString
     * @param newSpeciesString
     * @param newNameString
     */
    public Squirrel(Double newHeightDouble, Double newWeightDouble, String newColourString, String newSpeciesString, String newNameString){
        
        this.healthInt = 100;
        this.heightDouble = newHeightDouble;
        this.weightDouble = newWeightDouble;
        this.colouString = newColourString;
        this.speciesString = newSpeciesString;
        this.nameString = newNameString;

    }

    // instance methods

    /**
     * Store the nuts
     */
    public void storeNuts(){
        System.out.println("Store these nuts");
    }

    /**
     * Walk around
     */
    public void walk(){
        System.out.println("Walking ... ");
    }

    /**
     * Climb the tree
     */
    public void climbTree(){
        System.out.println("Climb tree ");
    }

    /**
     * Get the health value
     * @return the health of the squirrel
     */
    public int getHealth(){
        return this.healthInt;
    }

    /**
     * Scramble around
     */
    public void scramble(){
        System.out.println("SCRAMBLE!!!");
    }

    /**
     * Take a hit from the squirrel
     */
    public void injury(){
        this.healthInt --;
    }


}