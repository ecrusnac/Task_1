package Task1_7;

import java.util.ArrayList;

public class Processor {
    private String stringsFromArgs = "";
    private Long sumOfAllArgs = 0L;
    private ArrayList<Person> people = new ArrayList<Person>();

    public String getStringsFromArgs() {
        return stringsFromArgs;
    }

    public Long getSumOfAllArgs() {
        return sumOfAllArgs;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void compute(Object obj) {
        if (obj instanceof String) compute((String) obj);
        if (obj instanceof Integer) compute((Integer) obj);
        if (obj instanceof Long) compute((Long) obj);
        if (obj instanceof Person) compute((Person) obj);
    }

    public void compute(String s) {
        stringsFromArgs += s;
    }

    public void compute(Integer n) {
        sumOfAllArgs += n;
    }

    public void compute(Long n) {
        sumOfAllArgs += n;
    }

    public void compute(Person p) {
        people.add(p);
    }
}
