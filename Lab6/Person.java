import java.util.Random;
public class Person
{
  private int health;
  private int damage;
  private String name;
  private boolean dead;
  private double dodge;
  public Person(String name, int health, int damage, boolean dead, double dodge)
  {
    this.health = health;
    this.damage = damage;
    this.name = name;
    this.dead = dead;
    this.dodge = dodge;
  }

  public String getName()
  {
    return this.name;
  }
  public int getHealth()
  {
    return this.health;
  }
  public void setHealth()
  {
    Random randomHealth = new Random();
    //health = randomHealth.nextInt();
    if (name == "Warrior")
    {
      int value = 20;
      health = value + randomHealth.nextInt(20);
    }
    else if (name == "Mage")
    {
      int value = 10;
      health = value + randomHealth.nextInt(50);
    }
  }
  public void setDamage()
  {
    Random randomDamage = new Random();
    damage = randomDamage.nextInt();
  }

  public boolean isDead(int health)
  {
    if (health == 0) {return true;}
    else {return false;}
  }

  public void takeDamage(int damage)
  {
    health -= damage;
  }

  public void attack(Person reciever)
  {
    reciever.takeDamage(20);
  }
}
