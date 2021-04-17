public class WizardMain
{
 public static void main(String[] args) 
  {
    WizardCreater wizard1 = new WizardCreater();
    wizard1.Wizard("Theron", 25);
    wizard1.StatDisplay();

    


    wizard1.FireBall();
    wizard1.Avalanche();
    wizard1.StatDisplay();
    wizard1.LevelUp();
    wizard1.StatDisplay();
    wizard1.Avalanche();
    wizard1.LevelUp();

  }
}