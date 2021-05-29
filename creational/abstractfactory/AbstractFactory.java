package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.interfaces.Profession;

/**
 * Main abstract factory class
 */
public abstract class AbstractFactory {

    public abstract Profession getProfession(String typeOfProfession);

}
