package pojojavabin;

public class Faculty {
    People people;

    public void setPeople(People people) {
    this.people = people;
    }

    public People getPeople(People people) {
        return people;
 
    }
public void service(){
    people.learn();
}
}