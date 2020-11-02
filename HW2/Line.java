public class Line {

    private Person[] people;
    private int numPeople;

    public Line(int lineCapacity) {
        people = new Person[lineCapacity];
        numPeople = 0;
        }

    public void add(Person p) {
        //adds person to the list, and checks if the list is aleasy full
        if (numPeople < people.length) {
            people[numPeople++] = p;
            }
        else {
            System.out.println("Line is full. Go away.");
            }
        }

    public Person remove() {
        //removes people from the list, and tests if it's already empty
        if (numPeople > 0) {
            Person p = people[0];
            for (int i = 1; i<numPeople-1; i++) {
                people[i] = people[i + 1];
                // if (people[i+1] != null) {
                //   people[i] =
                // }
                //people[i + 1] = null;
                }
            numPeople--;
            return p;
            }
        else {
          System.out.println("Line is already empty.");
          return null;
          }
        }
    public boolean isEmpty() {
        //if the line is empty...
        return numPeople == 0;
        }

    public static void main(String[] args) {
        String[] names = {"Brittany", "Paxton", "Henry", "Isaac", "Talia"};
        int[] ages = {19, 18, 18, 18, 21};
        int numPeople = 5;

        Line deadpoolLine = new Line(names.length);
        for(int i=0; i<numPeople; i++) {
          deadpoolLine.add(new Person(names[i], ages[i]));
          //System.out.println(deadpoolLine);
          }

        // while(deadpoolLine.isEmpty() == false) {
        //   System.out.println(deadpoolLine.remove());  //Anonymous object returned
        //   }
    }
}
