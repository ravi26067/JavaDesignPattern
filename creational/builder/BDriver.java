package designpattern.creational.builder;

public class BDriver {

    public static void main(String[] args) {

        //we have created eathquake builder
        EarthquakeHomeBuilderClass earthquakeHomeBuilde = new EarthquakeHomeBuilderClass();
        //we will use director class which controls which builder to call and it has complex object creation logic
        Director director = new Director(earthquakeHomeBuilde);
        //it will have construction logic based on builder type
        director.manageRequiredHomeConstruction();
        //this will return home of earthquake resistant
        Home homeConstructed = director.getComplexity();
        System.out.println(homeConstructed);
        System.out.println(homeConstructed.floor);

    }
}
