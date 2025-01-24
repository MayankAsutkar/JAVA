class fat
{
    
    public void playmusic()
    {
        System.out.println("playing music");
    }
    public String getmepen(int cost)
    {
        if(cost>10)
        {         
            return "pen";
        }
        return "nothing";
    }
}
public class vid27 
{
    public static void main(String arg[])
    {
        //METHODS IN JAVA:
        fat obj = new fat();
        obj.playmusic();
        String res = obj.getmepen(9);
        System.out.println(res);
        
    }
}
