package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.interfaces.Profession;

/**
 * Intermediate factory classes which will provide the profession
 */

public class TraineeAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null)
            return null;
        else if (typeOfProfession.equals("Engineer"))
            return new TraineeEngineer();
        else if (typeOfProfession.equals("Teacher"))
            return new TraineeTeacher();
        return null;
    }
}
