public class RPGDesign
{
  private int championHealth;
  private int championDamage;
  public static void main(String[] args)
  {
    Person berserker1 = new Person("Berserker", 35, 20, false, 0);
    Person warrior1 = new Person("Warrior", 0, 0, false, 0.25);
    Person mage1 = new Person("Mage", 0, 0, false, 0);
    Person berserker2 = new Person("Berserker", 35, 20, false, 0);
    Person warrior2 = new Person("Warrior", 0, 0, false, 0.25);
    Person mage2 = new Person("Mage", 0, 0, false, 0);
    warrior1.setHealth();
    warrior1.setDamage();
    mage1.setHealth();
    mage1.setDamage();
    warrior2.setHealth();
    warrior2.setDamage();
    mage2.setHealth();
    mage2.setDamage();
    System.out.println("A Raging " + berserker1.getName() + " (" + berserker1.getHealth() + ")");
    System.out.println("A Disciplined " + warrior1.getName() + " (" + warrior1.getHealth() + ")");
    System.out.println("A Wild " + mage1.getName() + " (" + mage1.getHealth() + ")");
    System.out.println("A Raging " + berserker2.getName() + " (" + berserker2.getHealth() + ")");
    System.out.println("A Disciplined " + warrior2.getName() + " (" + warrior2.getHealth() + ")");
    System.out.println("A Wild " + mage2.getName() + " (" + mage2.getHealth() + ")");
  }

  public String round()
  {
    while(/*2+ are still alive*/)
    {
      System.out.println(" ");
      System.out.println("In the arena...");

      System.out.println(" ");
    }
  }
  public boolean isBerserkserAlive()
  {
    //if (berserker1.getHealth() == 0) {return false;}
    System.out.println("A Raging " + berserker1.getName() + " (" + berserker1.getHealth() + ")");
    System.out.println("A Disciplined " + warrior1.getName() + " (" + warrior1.getHealth() + ")");
    System.out.println("A Wild " + mage1.getName() + " (" + mage1.getHealth() + ")");
    System.out.println("A Raging " + berserker2.getName() + " (" + berserker2.getHealth() + ")");
    System.out.println("A Disciplined " + warrior2.getName() + " (" + warrior2.getHealth() + ")");
    System.out.println("A Wild " + mage2.getName() + " (" + mage2.getHealth() + ")");
  }
  /*public boolean isWarriorAlive()
  {

  }
  public boolean isMageAlive()
  {

  }*/
  public String toString()
  {
    return "A";//this.name + " has " + this.health + " health.";
  }
  // public void contenstants()
  // {
  //
  // }

  // public int health()
  // {
  //   Random randomHealth = new Random();
  //   championHealth = randomHealth.nextInt();
  // }
  // public int damage()
  // {
  //   Random randomDamage = new Random();
  //   championDamage = randomDamage.nextInt();
  // }


}
