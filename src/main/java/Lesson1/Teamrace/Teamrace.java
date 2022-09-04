package Lesson1.Teamrace;

import java.util.Random;

public class Teamrace {
    private String nameTeam = "unknown";
    People [] nationality = { new Russian ("Ivan"), new American("Jon"), new Frenchy("Gerard")};
    public People[] teamPeople = new People[4];
    Random random = new Random();

    public void Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(3);
            teamPeople[i] = nationality[ran];
        }
    }
    public void printInformationAboutTheTeam() {
        System.out.println("Team: " + nameTeam);
        for(People a : teamPeople) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (People a : teamPeople){
            if(a.passing){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}