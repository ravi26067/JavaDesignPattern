package designpattern.creational.builder;

public interface Builder {

    public void buildFloor();
    public void buildWall();
    public void buildTerrace();

    public Home getComplexities();

}
