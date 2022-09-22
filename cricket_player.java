package player;

public class cricket_player extends player  {
	 int ranking;
	    int Totalruns;
	    int totalWickets;
	    cricket_player(String n, float w, int h,int ranking, int totalruns, int totalWickets)
	    {
	        super(n,w,h);
	        this.Sports="Cricket";
	        this.ranking=ranking;
	        this.Totalruns=totalruns;
	        this.totalWickets=totalWickets;
	    }
	    @Override
	    void printplayerDetails()
	    {
	        super.printplayerDetails();
	        System.out.println("Ranking : "+this.ranking);
	        System.out.println("Total runs scored : "+this.Totalruns);
	        System.out.println("Total wickets : "+this.totalWickets);
	    }

}
