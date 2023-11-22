package pojojavabin;

public class Pojo {
    private String name = "pankaj";
    public int age = 29;
    protected double height = 5.9;

    public String toString() {
        return "Name : " + name + ", Age: " + age + ", Height: " + height;
    }

    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}