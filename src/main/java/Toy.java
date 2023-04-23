public class Toy implements Action {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Robot " + name + " is trying to stand up");
    }

    @Override
    public void play(Toy legoToy) {
        System.out.println("Robot " + name + " is fighting with another " + legoToy);
    }

    @Override
    public String toString( ){
        return name;
    }

}
