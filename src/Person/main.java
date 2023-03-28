package Person;

public class main {
  public static void main(String[] args) {
    Person person1 = new Person("Dima", "02.04.1991");
    Person person2 = new Person("Alina", "06.06.1996");

    person1.getInfo();
    person2.getInfo();

    if (person1.compareTo(person2) < 0) {
      System.out.println(person1.getName() + " is younger than " + person2.getName());
    } else if (person1.compareTo(person2) > 0) {
      System.out.println(person1.getName() + " is older than " + person2.getName());
    } else {
      System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age");
    }
  }
}
