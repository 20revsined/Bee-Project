public class Cube {
    private int x;
    private int y;
    private int z;
    private String location;
    
    public Cube()
    {
        x = 0;
        y = 0;
        z = 0;
        location = "(" + x + ", " + y + ", " + z + ")";
        
    }
    
    public Cube(int X, int Y, int Z)
    {
        x = X;
        y = Y;
        z = Z;
    }
    
   public Cube(Bee b[])
    {
    for (int i=0; i < 15; i++)
    {
        b[i]= new Bee(x,y,z);
    }
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
    
        public String getCoordinates() //location of the beehive
    {
        return "(" + x + "," + y + "," + z + ")";
    }
        
        public String getCoordinates(Bee b[]){
        for (int i=0; i < 15; i++)
        {
            location = b[i].getCoordinates();
            return location;
        }
        return "";
    }
    
}
