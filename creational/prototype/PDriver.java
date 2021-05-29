package designpattern.creational.prototype;

public class PDriver {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession docProfession = ProfessionCache.getClonable(1);
        System.out.println(docProfession);

        Profession engProfession = ProfessionCache.getClonable(2);
        System.out.println(engProfession);
    }
}
