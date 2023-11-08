public class MoralMachine
{
    public static void main(String[] args)
    {
        MMGenerator MMGenerator = new MMGenerator();
        int scenario = MMGenerator.getScenario();

        System.out.println(scenario);
        //g1 is the group that will be killed if the car stays in the current lane.
        //g2 is the group that will be killed if the car swerves into the other lane.
        String g1 = MMGenerator.getGroup();
        String g2 = MMGenerator.getGroup();

        System.out.println(g1);
        System.out.println(g2);

        boolean finalDecision = decideSwerve(scenario, g1, g2);

        System.out.println(finalDecision);
    }//end main

    public static boolean decideSwerve(int scenario, String g1, String g2)
    {
        boolean decision = false;

        return decision;
    }

    public static boolean savingMoreLives(int scenario, String g1, String g2)
    {
        boolean result = false;
        
        if (scenario < 11)
        //no legal complications
        {
            
        }
        else if (scenario < 22)
        {
            
        }
        else
        {
            
        }
        
        return result;
    }
    
    public static boolean groupSize(String g1, String g2)
    {
      if(g1.length() > g2.length())
      {
         return true;
      }
      else if (g1.length() < g2.length())
      {
         return false;
      }
      else
      {
         return true;
      }
            
   }

}//end class MoralMachine