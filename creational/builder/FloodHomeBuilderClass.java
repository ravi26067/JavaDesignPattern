package designpattern.creational.builder;

public class FloodHomeBuilderClass implements Builder{
    private Home floodResistantHome = new Home();
    @Override
    public void buildFloor() {
        this.floodResistantHome.floor = "10 ft high floor";
    }

    @Override
    public void buildWall() {
        this.floodResistantHome.floor = "water restint wall";
    }

    @Override
    public void buildTerrace() {
        this.floodResistantHome.floor = "water resistant terrace";
    }

    @Override
    public Home getComplexities() {
        return this.floodResistantHome;
    }
}
