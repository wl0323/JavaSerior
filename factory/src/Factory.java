/**
 * @author shkstart
 * @create 2022-07-22-22:18
 */
public class Factory {
    public  Animal createAnimal(String animal){
        if(animal.equals("dog")){
            return new Dog();
        } else if (animal.equals("cat")) {
            return  new Cat();
        }else {
            return null;
        }
    }
}


