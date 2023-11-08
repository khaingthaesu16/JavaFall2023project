public class MMGenerator 
{
   static final char MAN = 'a';
   static final char WOMAN = 'b';
   static final char BOY = 'c';
   static final char GIRL = 'd';
   static final char ELDERLY_MAN = 'e';
   static final char ELDERLY_WOMAN = 'f';
   static final char OBESE_MAN = 'g';
   static final char OBESE_WOMAN = 'h';
   static final char MALE_EXECUTIVE = 'i';
   static final char FEMALE_EXECUTIVE = 'j';
   static final char MALE_DOCTOR = 'k';
   static final char FEMALE_DOCTOR = 'l';
   static final char MALE_JOGGER = 'm';
   static final char FEMALE_JOGGER = 'n';
   static final char PREGNANT_WOMAN = 'o';
   static final char HOMELESS_PERSON = 'p';
   static final char CRIMINAL = 'q';
   static final char BABY = 'r';
   static final char DOG = 's';
   static final char CAT = 't';

   public static int getScenario()
   {
      int scenario = (int)(Math.random() * 3);
      int legal = (int)(Math.random() * 3) * 10;

      return (scenario + legal);
   }

   public static String getGroup()
   {
      int count = (int)Math.ceil(Math.random()* 5);
      String group = "";
      for(int i = 0; i < count; i++){
          int val = (int)Math.floor(Math.random() * (CAT-MAN + 1));
          group += (char)(MAN + val);
      }
      return group;
   }

   public static String getMemberName(char member)
   {
      String name = "n/a";
      switch (member)
      {
         case MAN : name = "Man"; break;
         case WOMAN: name = "Woman"; break;
         case BOY: name = "Boy"; break;
         case GIRL: name = "Girl"; break;
         case ELDERLY_MAN: name = "Elderly Man"; break;
         case ELDERLY_WOMAN: name = "Elderly Woman"; break;
         case OBESE_MAN: name = "Obese Man"; break;
         case OBESE_WOMAN: name = "Obese Woman"; break;
         case MALE_EXECUTIVE: name = "Male Executive"; break;
         case FEMALE_EXECUTIVE: name = "Female Executive"; break;
         case MALE_DOCTOR: name = "Male Doctor"; break;
         case FEMALE_DOCTOR: name = "Female Doctor"; break;
         case MALE_JOGGER: name = "Male Jogger"; break;
         case FEMALE_JOGGER: name = "Female Jogger"; break;
         case PREGNANT_WOMAN: name = "Pregnant Woman"; break;
         case HOMELESS_PERSON: name = "Homeless Person"; break;
         case CRIMINAL: name = "Criminal"; break;
         case BABY: name = "Baby"; break;
         case DOG: name = "Dog"; break;
         case CAT: name = "Cat"; break;
      }

      return name;
   }

   public static void printGroup(String group)
   {
      for(int i = 0; i < group.length(); i++)
      {
         System.out.println(getMemberName(group.charAt(i)));
      }
   }
}//end class MMGenerator