package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.interfaces.Profession;

public class TraineeTeacher implements Profession {

    @Override
    public void print() {
        System.out.println("This is trainee teacher class.");
    }

}
