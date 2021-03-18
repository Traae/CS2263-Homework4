/**
 * Person class.
 *
 * It was originally design with a age value, however the value is never used,
 * as I ran out of time and simplified my goal.
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */
package homework4.graphs;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = "N/A";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
