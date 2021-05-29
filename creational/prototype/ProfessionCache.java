package designpattern.creational.prototype;

import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer,Profession> professionMap = new Hashtable<>();

    public static Profession getClonable(int id){
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadProfessionCache(){
        Doctor doc = new Doctor();
        doc.id = 1;
        professionMap.put(doc.id,doc);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionMap.put(engineer.id,engineer);
    }

}
