package designpattern.creational.builder;

public class EarthquakeHomeBuilderClass implements Builder{

    private Home earthquakeResistantHome = new Home();

    @Override
    public void buildFloor() {
        this.earthquakeResistantHome.floor = "Wooden floor";
    }

    @Override
    public void buildWall() {
        this.earthquakeResistantHome.walls = ("Wooden wall");
    }

    @Override
    public void buildTerrace() {
        this.earthquakeResistantHome.terrace =("Wooden terrace");
    }

    @Override
    public Home getComplexities() {
        return this.earthquakeResistantHome;
    }
}
