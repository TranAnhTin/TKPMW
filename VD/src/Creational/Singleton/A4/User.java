package Creational.Singleton.A4;

public class User {
    Election e = Election.getInstance();
    public User(String name) {
        this.name = name;
    }

    public String name;
    public void vote(Candidate c)
    {
        e.vote(c,name);
    }
}
