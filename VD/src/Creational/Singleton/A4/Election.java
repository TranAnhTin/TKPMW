package Creational.Singleton.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election election;
    int trump=0,biden=0;
    List<String> votedUser =new ArrayList<>();

    public static Election getInstance(){
        if(election==null)
            election=new Election();
        return election;
    }
    public void vote(Candidate c, String n){
        for (String voted:votedUser){
            if(voted.equals(n))
                return;
        }
        votedUser.add(n);
        if(c==Candidate.TRUMP)
            trump++;
        if(c==Candidate.BIDEN)
            biden++;

    }
    public void print(){
        System.out.println("Trump: " + trump + " Biden: " + biden);
    }
}
