package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.interfaces.Profession;

public class TraineeEngineer implements Profession {

    @Override
    public void print() {
        System.out.println("This is trainee engineer class.");
    }
}
