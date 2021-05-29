package designpattern.creational.abstractfactory;

/**
 * Abstract factory provider
 */

public class AbstractFactoryProvider {

    public static AbstractFactory getFactory(Boolean isTrainee){

        if(isTrainee){
            return new TraineeAbstractFactory();
        }else{
            return new ProfessionAbstractFactory();
        }

    }
}
