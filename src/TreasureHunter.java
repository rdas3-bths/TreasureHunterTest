public class TreasureHunter {
    private String example;

    public TreasureHunter(String e) {
        example = e;
    }

    public void explore() {
        System.out.println("i am exploring!");
    }

    public String getExample() {
        return example;
    }

    public String anotherMethod() {
        return "another method has been added";
    }

    public String oneMoreMethod() {
        return "just another method";
    }

    public String toString() {
        return example;
    }

    public void dasMethod() {
        System.out.println("let's see what happens");
    }

    public void millerMethod() {
        System.out.println("this is going to get messy");
    }
}
