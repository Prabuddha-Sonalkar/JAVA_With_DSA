public class Interface {
    public static void main(String[] args) {
        Beer b=new Beer();
        b.eat();
    }
}

interface Herbivore{
    public void eat();
}

// interface Carnivore{
//     public void eat();
// }

class Beer implements Herbivore{
     @Override
     public void eat(){
        System.out.println("eat veg");
     }
}