package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.interfaces.Profession;

public class ABFDriver {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactoryProvider.getFactory(true);
        Profession profession = factory.getProfession("Engineer");
        profession.print();
    }
}
