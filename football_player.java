package player;

public class football_player extends player {

	int NumOfGoals;
    String NameOfClub;
    String position;
    
    football_player(String n, float w, int h,int numGoals, String ClubName,String pos)
    {
        super(n,w,h);
        this.Sports="Football";
        this.NumOfGoals=numGoals;
        this.NameOfClub=ClubName;
        this.position=pos;
    }

    void printplayerDetails()
    {
        super.printplayerDetails();
        System.out.println("Number of goals scored : "+this.NumOfGoals);
        System.out.println("Name of the club : "+this.NameOfClub);
        System.out.println("Position the player plays at : "+this.position);
    }

}
