package player;

public class player {

	String name;
    double weight;
    int height; 
    String Sports;

    public player(String n, double d, int h)
    {
        this.name=n;
        this.weight=d;
        this.height=h;
        this.Sports="N.A";
    }
    public void SetSports(String s)
    {
        this.Sports=s;
    }
    void printplayerDetails()
    {
        System.out.println("Name of the player : "+this.name);
        System.out.println("Weight of the player : "+this.weight);
        System.out.println("Height of the player : "+this.height);
        System.out.println("Sports the player plays : "+this.Sports);
    }

}
