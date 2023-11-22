package pojojavabin;

public class MainTest {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.setPeople(new Student());
       // faculty.setPeople(new Emp());
      //  faculty.getPeople(new Emp());
      faculty.service();
    }
}
