public class Bee {
    private int x;
    private int y;
    private int z;
    private int NumMoves;
    
    public Bee()
    {
        x = 0;
        y = 0;
        z = 0;
        NumMoves = 0;
    }
    
        public Bee(int X, int Y, int Z)
    {
        x = X;
        y = Y;
        z = Z;
    }
    
    public Bee(int X, int Y, int Z, int nm)
    {
        x = X;
        y = Y;
        z = Z;
        NumMoves = nm;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getZ()
    {
        return z;
    }
    
    public void setX(int X)
    {
        x = X;
    }
    
    public void setY(int Y)
    {
        y = Y;
    }
    
    public void setZ(int Z)
    {
        z = Z;
    }
    
    public int getNM()
    {
        return NumMoves;
    }
    
    public void setNM(int nm)
    {
        NumMoves = nm;
    }
    
    public String getCoordinates()
    {
        return "(" + x + "," + y + "," + z + ")";
    }
}

//source: https://www.calculatorsoup.com/calculators/geometry-solids/distance-two-points.php
