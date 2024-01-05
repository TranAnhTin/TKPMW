package Creational.Singleton.A4;

public class MainVote {
    public static void main(String[] args) {
        User vu = new User("vu");
        vu.vote( Candidate.TRUMP);
        vu.vote( Candidate.BIDEN);
        Election.getInstance().print();
    }
}
