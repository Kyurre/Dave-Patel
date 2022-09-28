package Assignment2;

public class Player{

    public int numPlayers;
    SeLinkList head;
    
    public void addPlayer(int a, int b, int c){
        SeLinkList node = new SeLinkList(a, b, c);
        if(head == null){
            head = node;
        }
        else{
            SeLinkList temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    public void display(){
        SeLinkList node = head; 
        while(node.next != null){
            System.out.printf("%d %d %d\n", node.a, node.b, node.c);
            node = node.next;
        }
        // print the final node
        System.out.printf("%d %d %d\n", node.a, node.b, node.c);
    }


    //initializeList based on add player and player data
    public Player initializeList(Player play){
        PlayerData playerData = new PlayerData();
        PlayerData[] data = playerData.getMyData();
        Player playerList = play;
        for(PlayerData p: data ){
            playerList.addPlayer(p.a, p.b, p.c);
            //System.out.println("Added Player with: ("+ p.a + " " + p.b + " " + p.c + ")");
        }

        return playerList;
    }



    public static void main(String[] args){
        Player play = new Player();
        play.numPlayers = 10;
        System.out.println("Number of Players: " + play.numPlayers);

        //Task 4
        PlayerData playerdata = new PlayerData();
        PlayerData[] myData = playerdata.getMyData();

        //for(PlayerData p: myData ){
        //   System.out.println(p.a + " " + p.b + " " + p.c);
        //}

        //Task7 Test
        //play.addPlayer(1, 5, 6);
        //play.addPlayer(2, 4, 6);
        //play.display

        //Task 8
        play.initializeList(play);
        play.display();
        
    }
    
}