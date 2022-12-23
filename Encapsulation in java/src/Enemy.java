public class Enemy {

//    We are Encapsulating properties within the object.we can do that setting properties to private
    private int health;

//    Use getter and setter to access the private properties.
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void Talk() {
        System.out.println("I am an enemy.");
        System.out.println("you better run!");
    }
}

