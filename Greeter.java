public class Greeter {
    // class variables
    private String greeting;
    
    // constructors
    public Greeter() {
	greeting = "Hello, world!";
    }
    public Greeter(String g) {
	greeting = g;
    }
    
    // set get
    public void setGreeting(String g) {
	greeting = g;
    }
    public String getGreeting() {
	return greeting;
    }
    
    // other methods
    public String greet() {
        return greeting;
    }
    public String ungreet() {
        return "I'm out!";
    }
    public String greetPerson(String name) {
	return "Hello, " + name + ".";
    }
    public String loudGreet() {
	return "HELLO!";
    }
}
