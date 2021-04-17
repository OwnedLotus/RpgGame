public class BattleExecute 
{
  public void BattleInteface(WizardEnemies[] enemyArray)
  {
    for (int i = 0; i < 1 + enemyArray.length; i++)
    {
      System.out.println("The enemy " + enemyArray[i].name + " has appeared! ");
    }
  }
  


}
