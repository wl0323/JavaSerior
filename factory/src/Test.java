/**
 * @author shkstart
 * @create 2022-07-22-22:26
 */
public class Test {
    public static void main(String[] args) {
        Factory factory=new Factory();
        Animal cat = factory.createAnimal("cat");
        Animal dog = factory.createAnimal("dog");
        System.out.println(cat.pet());
        System.out.println(dog.pet());

    }
}
