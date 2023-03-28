package Person;
// Создайте класс Person,
// которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
// Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
// Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
// Но можно сравнивать даты рождения!
// Альтернативная подсказка: если очень хочется вычислять возраст,
// то можно это делать в миллисекундах с использованием getTime()!
public class Person implements Comparable<Person> {

  private String name;
  private int birthDate;
  private int age;

  public Person(String name, int birthDate, int age) {
    this.name = name;
    this.birthDate = birthDate;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setBirthDate(int birthDate) {
    this.birthDate = birthDate;
  }

  public int getBirthDate() {
    return birthDate;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

