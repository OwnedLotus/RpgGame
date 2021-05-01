import java.util.Random;

public class WizardEnemies 
{
  protected String name;


  int health;
  protected int enemyHealth;
  Random random = new Random();
  WizardEnemies[] enemyArray;
  int number = NumEnemies(1, 3);

  public void BattleStart()
  {
    SpawnEnemies();
    

  }

  public void SpawnEnemies()
  {
    for(int i = 0; i < number; i++)
    {
      enemyArray[i].name = enemyArray[i].EnemyName("REPLACE!");
      enemyArray[i].health = EnemyHealth(40, 60);
    }
  }

  public int NumEnemies(int min, int max)
  {
    int spawnNum = random.nextInt(max - min) + min;
    return spawnNum;
  }

  public String EnemyName(String Name)
  {
    name = Name;
    return name; 
  }

  public int EnemyHealth(int min, int max)
  {
    enemyHealth = random.nextInt(max - min) + min;

    return enemyHealth;
  }
}
