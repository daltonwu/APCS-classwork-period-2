public class Driver {
    public static void main(String[] args) {
        Greeter g1 = new Greeter("YOLOOOO!");
        //Greeter g2 = new Greeter();
        System.out.println(g1.greet());
        //System.out.println(g2.greet());
	System.out.println(g1.greetPerson("BOB"));
	System.out.println(g1.loudGreet());
        
	
    }
}
