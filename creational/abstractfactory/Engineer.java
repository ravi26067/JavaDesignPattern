package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.interfaces.Profession;

public class Engineer implements Profession {

    @Override
    public void print() {
        System.out.println("This is engineer class.");
    }
}
