package player;

public class main {
	public static void main(String[] args)
    {
        player obj1 = new player("Sunil Chettri",75,175);
        cricket_player obj2 = new cricket_player("Virat",78,178,1,10_000,11);
        football_player obj3 = new football_player("Messi",75,170,88,"PSG","Center Forward");
        

        obj1.printplayerDetails();  
        System.out.println();  
        obj2.printplayerDetails();
        System.out.println();
        obj3.printplayerDetails();
        System.out.println();
        
    }    
}
