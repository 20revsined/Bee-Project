public class NearestNeighbor {

    private int x;
    private int y;
    private int z;
    private int NumMoves;
    private Cube beehive[] = new Cube[1];
    private Cube obstacles[] = new Cube[1];
    private Bee b;
    private NearestNeighbor nn;

    public NearestNeighbor() {
        x = 0;
        y = 0;
        z = 0;
        NumMoves = 0;
        
    }

    public NearestNeighbor(int X, int Y, int Z) {
        x = X;
        y = Y;
        z = Z;
    }

    public NearestNeighbor(int X, int Y, int Z, int nm) {
        x = X;
        y = Y;
        z = Z;
        NumMoves = nm;
    }

    public int getNM() {
        return NumMoves;
    }

    public void setNM(int nm) {
        NumMoves = nm;
    }

    public int ShortestDistanceX(Bee b, Cube beehive[]) {
        int min;
        int i = 0;

        int Xdistance = 0;
        int Ydistance = 0;
        int Zdistance = 0;

        Comparable c[] = new Comparable[beehive.length];

        for (i = 0; i < beehive.length; i++) {
            Xdistance = Math.abs(b.getX() - beehive[i].getX());
            Ydistance = Math.abs(b.getY() - beehive[i].getY());
            Zdistance = Math.abs(b.getZ() - beehive[i].getZ());

            c[i] = Xdistance + Ydistance + Zdistance;
        }

        Sortall.BubbleSort(c);

        min = Integer.valueOf(c[0].toString());
        
        for(i = 0; i < beehive.length; i++)
        {
            //System.out.println(c[i]);
            if (min == Math.abs(b.getX() - beehive[i].getX()) + Math.abs(b.getY() - beehive[i].getY()) + Math.abs(b.getZ() - beehive[i].getZ()))
            {
                beehive[i].setX(beehive[i].getX());
                beehive[i].setY(beehive[i].getY());
                beehive[i].setZ(beehive[i].getZ());
                
                //System.out.println(beehive[i].getCoordinates());
                return beehive[i].getX();
            }
        }
        return 0;
    }
    
        public int ShortestDistanceY(Bee b, Cube beehive[]) {
        int min;
        int i = 0;

        int Xdistance = 0;
        int Ydistance = 0;
        int Zdistance = 0;

        Comparable c[] = new Comparable[beehive.length];

        for (i = 0; i < beehive.length; i++) {
            Xdistance = Math.abs(b.getX() - beehive[i].getX());
            Ydistance = Math.abs(b.getY() - beehive[i].getY());
            Zdistance = Math.abs(b.getZ() - beehive[i].getZ());

            c[i] = Xdistance + Ydistance + Zdistance;
        }

        Sortall.BubbleSort(c);

        min = Integer.valueOf(c[0].toString());
        
        for(i = 0; i < beehive.length; i++)
        {
            //System.out.println(c[i]);
            if (min == Math.abs(b.getX() - beehive[i].getX()) + Math.abs(b.getY() - beehive[i].getY()) + Math.abs(b.getZ() - beehive[i].getZ()))
            {
                beehive[i].setX(beehive[i].getX());
                beehive[i].setY(beehive[i].getY());
                beehive[i].setZ(beehive[i].getZ());
                
                //System.out.println(beehive[i].getCoordinates());
                return beehive[i].getY();
            }
        }
        return 0;
    }
        
        public int ShortestDistanceZ(Bee b, Cube beehive[]) {
        int min;
        int i = 0;

        int Xdistance = 0;
        int Ydistance = 0;
        int Zdistance = 0;

        Comparable c[] = new Comparable[beehive.length];

        for (i = 0; i < beehive.length; i++) {
            Xdistance = Math.abs(b.getX() - beehive[i].getX());
            Ydistance = Math.abs(b.getY() - beehive[i].getY());
            Zdistance = Math.abs(b.getZ() - beehive[i].getZ());

            c[i] = Xdistance + Ydistance + Zdistance;
        }

        Sortall.BubbleSort(c);

        min = Integer.valueOf(c[0].toString());
        
        for(i = 0; i < beehive.length; i++)
        {
            //System.out.println(c[i]);
            if (min == Math.abs(b.getX() - beehive[i].getX()) + Math.abs(b.getY() - beehive[i].getY()) + Math.abs(b.getZ() - beehive[i].getZ()))
            {
                beehive[i].setX(beehive[i].getX());
                beehive[i].setY(beehive[i].getY());
                beehive[i].setZ(beehive[i].getZ());
                
                //System.out.println(beehive[i].getCoordinates());
                return beehive[i].getZ();
            }
        }
        return 0;
    }
        
    public int ObstaclesX(Bee b, Cube obstacles[])
    {
        int XLocation = b.getX();
        int YLocation = b.getY();
        int ZLocation = b.getZ();
        for(int i = 0; i < obstacles.length; i++)
        {
        if (XLocation == obstacles[i].getX() && YLocation == obstacles[i].getY() && ZLocation == obstacles[i].getZ()) {
                            
                        //System.out.println("bee hit obstacle");
                        //XLocation++;
                        //b.setX(XLocation);
                        YLocation--;
                        XLocation--;
                        //ZLocation++;
                        
                        //System.out.println(b.getCoordinates());
                        
                        if (XLocation != obstacles[i].getX() && YLocation != obstacles[i].getY() && ZLocation != obstacles[i].getZ()) {
                            b.setX(XLocation);
                            b.setY(YLocation);
                            b.setZ(ZLocation);
                            NumMoves++;
                            NumMoves++;
                            //System.out.println(b.getCoordinates());
                            break;
                        }
                        
//                        else if(XLocation == obstacles[i].getX() && YLocation == obstacles[i].getY() && ZLocation == obstacles[i].getZ())
//                        {
//                           System.out.println("bee hit obstacle");
//                           YLocation++;
//                        
//                        System.out.println(b.getCoordinates());
//                           
//                            if (XLocation != obstacles[i].getX() && YLocation != obstacles[i].getY() && ZLocation != obstacles[i].getZ()) {
//                            b.setX(XLocation);
//                            b.setY(YLocation);
//                            b.setZ(ZLocation);
//                            NumMoves++;
//                            NumMoves++;
//                            NumMoves++;
//                            System.out.println(b.getCoordinates());
//                            break;
//                        }
//                        }
//                        
//                        else if(XLocation == obstacles[i].getX() && YLocation == obstacles[i].getY() && ZLocation == obstacles[i].getZ())
//                        {
//                            System.out.println("bee hit obstacle");
//                            ZLocation++;
//                        
//                        System.out.println(b.getCoordinates());
//                           
//                            if (XLocation != obstacles[i].getX() && YLocation != obstacles[i].getY() && ZLocation != obstacles[i].getZ()) {
//                            b.setX(XLocation);
//                            b.setY(YLocation);
//                            b.setZ(ZLocation);
//                            System.out.println(b.getCoordinates());
//                            NumMoves++;
//                            NumMoves++;
//                            NumMoves++;
//                            break;
//                        }   
//                        }

                    } 
                    else
                    {
                       continue;
                    }
        }
           return b.getX();
    }

    public int ObstaclesY(Bee b, Cube obstacles[])
    {
        int XLocation = b.getX();
        int YLocation = b.getY();
        int ZLocation = b.getZ();
        for(int i = 0; i < obstacles.length; i++)
        {
        if (XLocation == obstacles[i].getX() && YLocation == obstacles[i].getY() && ZLocation == obstacles[i].getZ()) {
                            
                        //System.out.println("bee hit obstacle");

                        //XLocation++;
                        //b.setX(XLocation);
                        
                        YLocation--;
                        XLocation--;
                        //ZLocation++;
                        
                        //System.out.println(b.getCoordinates());
                        
                        if (XLocation != obstacles[i].getX() && YLocation != obstacles[i].getY() && ZLocation != obstacles[i].getZ()) {
                            b.setX(XLocation);
                            b.setY(YLocation);
                            b.setZ(ZLocation);
                            NumMoves++;
                            NumMoves++;
                            //NumMoves++;
                            System.out.println(b.getCoordinates());
                            break;
                        }

                    } 
                    else
                    {
                       continue;
                    }
        }
           return b.getY();
    }
        
    public int ObstaclesZ(Bee b, Cube obstacles[])
    {
        int XLocation = b.getX();
        int YLocation = b.getY();
        int ZLocation = b.getZ();
        for(int i = 0; i < obstacles.length; i++)
        {
        if (XLocation == obstacles[i].getX() && YLocation == obstacles[i].getY() && ZLocation == obstacles[i].getZ()) {
                            
                       // System.out.println("bee hit obstacle");

                        //XLocation++;
                        //b.setX(XLocation);
                        
                        YLocation--;
                        XLocation--;
                        //ZLocation++;
                        
                        //System.out.println(b.getCoordinates());
                        
                        if (XLocation != obstacles[i].getX() && YLocation != obstacles[i].getY() && ZLocation != obstacles[i].getZ()) {
                            b.setX(XLocation);
                            b.setY(YLocation);
                            b.setZ(ZLocation);
                            NumMoves++;
                            NumMoves++;
                            //NumMoves++;
                            System.out.println(b.getCoordinates());
                            break;
                        }

                    } 
                    else
                    {
                       continue;
                    }
        }
           return b.getZ();
    }
        
    public int CalcNumMoves(Bee b, Cube beehive[], Cube obstacles[])
    {
        nn = new NearestNeighbor();
        NumMoves = 0;
        int XLocation = b.getX();
        int YLocation = b.getY();
        int ZLocation = b.getZ();

        for (int i = 0; i < beehive.length; i++)
        {

            while (true)
            {
//                System.out.println(ShortestDistanceX(b, beehive));
//                System.out.println(ShortestDistanceX(b, beehive) + " " + ShortestDistanceY(b, beehive) + " " + ShortestDistanceZ(b, beehive));
                    if (XLocation > nn.ShortestDistanceX(b, beehive)) {
                        XLocation--;
                        ObstaclesX(b, obstacles);
                        NumMoves++;
                        b.setX(XLocation);
                        //System.out.println(b.getCoordinates());
                    }

                    else if (XLocation < nn.ShortestDistanceX(b, beehive)) {
                        XLocation++;
                        ObstaclesX(b, obstacles);
                        NumMoves++;
                        b.setX(XLocation);
                       // System.out.println(b.getCoordinates());
                    }

                    if (YLocation > ShortestDistanceY(b, beehive)) {
                        YLocation--;
                        ObstaclesY(b, obstacles);
                        NumMoves++;
                        b.setY(YLocation);
                       // System.out.println(b.getCoordinates());
                    }

                    else if (YLocation < ShortestDistanceY(b, beehive)) {
                        YLocation++;
                        ObstaclesY(b, obstacles);
                        NumMoves++;
                       b.setY(YLocation);
                      //  System.out.println(b.getCoordinates());
                    }

                    if (ZLocation > ShortestDistanceZ(b, beehive)) {
                        ZLocation--;
                        ObstaclesZ(b, obstacles);
                        NumMoves++;
                        b.setZ(ZLocation);
                      //  System.out.println(b.getCoordinates());
                    }

                    else if (ZLocation < ShortestDistanceZ(b, beehive)) {
                        ZLocation++;
                        ObstaclesZ(b, obstacles);
                        NumMoves++;
                        b.setZ(ZLocation);
                     //   System.out.println(b.getCoordinates());
                    }
                   
                
                if (XLocation == ShortestDistanceX(b, beehive) && YLocation == ShortestDistanceY(b, beehive) && ZLocation == ShortestDistanceZ(b, beehive))
                {
                    break;
                }
            }
        
        }
        return NumMoves;
    }
    }

//source: https://www.java-examples.com/find-largest-and-smallest-number-array-example
