public class WizardCreater
{
  int mp = 50;
  protected int exp = 0;
  protected int level = 1;
  String name;
  int age;
  protected int health;


  public void Wizard(String name,int age)
  {
    this.name = name;
    this.age = age;
    health = 50;
  }

  public void FireBall()
  {
    int damage = 3;
    System.out.println(name + " casts spell FireBall. It does: " + damage + " Damage!");
    mp = mp - 2;
    exp = exp + 100;
  }

  public void Avalanche()
  {
    int damage = 5;
    System.out.println(name + " casts spell Avalanche. It does: " + damage + " Damage!");
    mp = mp - 5;
    exp = exp + 500;
  }

  public void LevelUp()
  {
    if (exp > 999)
    {
      System.out.println(name + " has leveled up!");
      level++;
      exp = exp - 1000;
    }
    else
    {
      System.out.println(name + " does not have enough Experience points to level up");
    }
  }
  
  public void StatDisplay()
  {
    System.out.println(name);
    System.out.println(age);
    System.out.println(exp);
    System.out.println(mp);
  }

}