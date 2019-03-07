import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeeProject {

    public static void main(String[] args) throws FileNotFoundException {
        String everything[];
        Cube beehive[] = new Cube[15];
        Bee bees[] = new Bee[15];
        Cube obstacles[] = null;
        NearestNeighbor nn = new NearestNeighbor();
        int TotalNumMoves = 0;

        String scanner;
        Scanner sc = new Scanner(new File("beesetup1.txt"));
        int i = 0;
        while(sc.hasNext())
        {
        i++;
        scanner = sc.next();
        everything = scanner.split(",");
        
        if(i > 2 && i < 18)
        {
           beehive[i - 3] = new Cube(Integer.valueOf(everything[0]), Integer.valueOf(everything[1]), Integer.valueOf(everything[2]));
           System.out.println("Beehive coordinates: " + beehive[i - 3].getCoordinates());
        }
        
        if(i >= 18 && i < 33)
        {
            bees[i - 18] = new Bee(Integer.valueOf(everything[0]), Integer.valueOf(everything[1]), Integer.valueOf(everything[2]));
            System.out.println("Starting position of bee " + (i - 17) + ": " + bees[i - 18].getCoordinates());
        }
        
        if(i == 33)
        {
             obstacles = new Cube[Integer.valueOf(everything[0])]; 
        }
        
        if(i > 33)
        {
            obstacles[i - 34] = new Cube(Integer.valueOf(everything[0]), Integer.valueOf(everything[1]), Integer.valueOf(everything[2]));
        }
        }
        sc.close();

        int NumMoves = 0;
                
        for(int m = 0; m < beehive.length; m++)
        {
          NumMoves = nn.CalcNumMoves(bees[m], beehive, obstacles);
          System.out.println("bee " + (m + 1) + "'s number of moves: " + NumMoves + "; ending location in the hive: " + bees[m].getCoordinates());
          TotalNumMoves += NumMoves;
        }

        System.out.println("total number of moves for all 15 bees " + TotalNumMoves);
}
}
