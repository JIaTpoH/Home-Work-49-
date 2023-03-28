package Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Создайте класс Person,
// которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
// Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
// Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
// Но можно сравнивать даты рождения!
// Альтернативная подсказка: если очень хочется вычислять возраст,
// то можно это делать в миллисекундах с использованием getTime()!
public class Person implements Comparable<Person> {

  private String name;
  private LocalDate birthDate;


  public Person(String name, String birthDate) {
    this.name = name;
    this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("DD.MM.YYYY"));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = LocalDate.ofEpochDay(birthDate);
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }
}

