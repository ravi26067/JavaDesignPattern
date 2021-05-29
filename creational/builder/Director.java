package designpattern.creational.builder;

public class Director {

    Builder builder;

    Director( Builder builderType){
        this.builder = builderType;
    }

    public Home getComplexity(){
        return this.builder.getComplexities();
    }

    public void manageRequiredHomeConstruction(){
        this.builder.buildFloor();
        this.builder.buildWall();
        this.builder.buildTerrace();
    }
}
