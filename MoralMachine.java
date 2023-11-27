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
        boolean decision = savingMoreLives(scenario, g1, g2);

        return decision;
    }

   //Scenrio 1 = Saving more lives depending on legal rules
    public static boolean savingMoreLives(int scenario, String g1, String g2)
    {
        boolean result = false;
        
        if (scenario < 11)
        //no legal complications
        {
            result = groupSize(g1, g2);
        }
        else if (scenario < 22)
        {
            result = groupSize(g1, g2);
        }
        else
        {
           result = true;
        }
        
        return result;
    }
    
   //for every scenerio
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


//Scenerio 2 = Saving more humans not depending on the legal rules
   public static boolean savingmoreHuman(String g1, String g2)
   {
      boolean result = false;
      
      int g1Animalcount = 0;
      int g2Animalcount = 0;
      for(int i= 0; i<g1.length(); i++)
      {
         char g1Animal = g1.charAt(i);
         if( (g1Animal == 's' ) || (g1Animal == 't'))
         g1Animalcount ++;
          
       }
    
      for (int j = 0;j<g2.length(); j++)
      {
         char g2Animal = g2.charAt(j);
         if ((g2Animal =='s' )|| (g2Animal =='t'))
         g2Animalcount ++;
      }
   

      if (g1Animalcount>g2Animalcount)
      {
         result = false;
       }
       else if(g1Animalcount<g2Animalcount)
       {
         result = true;
        }
        else
        {
         result = groupSize(g1, g2);
        }
        return result;
     }
        


}//end class MoralMachine
