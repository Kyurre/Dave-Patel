package Assignment2;

public class Player{

    public int numPlayers;


    public static void main(String[] args){
        Player play = new Player();
        play.numPlayers = 10;
        System.out.println("Number of Players: " + play.numPlayers);

        //Task 4
        PlayerData playerdata = new PlayerData();
        PlayerData[] myData = playerdata.getMyData();
        System.out.println(myData);
    }
    
}