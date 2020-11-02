public class Line
{
  private Person[] people;
  private int numPeople;

  public Line(int lineCapacity)
  {
    people = new Person[lineCapacity];
    numPeople = 0;
  }

  public void add(Person p)
  {
    if(numPeople < people.length)
    {
      people[numPeople++] = p;
    }
    else
    {
      System.out.println("Line is full. Go away!");
    }
  }

  public Person remove()
  {
    if(numPeople > 0)
    {
      Person p = people[0];

      //Everyone moves up in the line
      for(int i=0; i<numPeople-1; i++)
      {
        people[i] = people[i+1];
      }
      numPeople--;
      return p;
    }
    else
    {
      System.out.println("Line is already empty");
      return null;
    }
  }

  public boolean isEmpty()
  {
    return numPeople == 0;  //Or can check [0] is null
  }

  public static void main(String[] args)
  {
    //Parallel arrays using array-literal syntax
    String[] names = { "Ryan", "Michael", "Jeff", "Tanner"};
    int[] ages     = {  33, 25, 98, 22};
    int numPeople = 4;

    Line deadpoolLine = new Line(names.length);
    for(int i=0; i<numPeople; i++)
    {
      deadpoolLine.add( new Person(names[i], ages[i]) );
    }

    while(deadpoolLine.isEmpty() == false)
    {
      System.out.println( deadpoolLine.remove() );  //Anonymous object returned
    }
  }
}
