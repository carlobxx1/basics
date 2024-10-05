package CarRentalSystem;

class Ram {
    public void sound() {
        System.out.println("make different sound");
    }
}
class Jay extends Ram {
    public Jay() {
    }

    @Override
    public void sound() {
        System.out.println("make no sound");
    }

}
public class Test
{
    public static void main(String[] args) {
        Ram r = new Jay();
        r.sound();
    }

}



