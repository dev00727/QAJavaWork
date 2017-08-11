import java.io.Serializable;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Person implements Serializable {
    private String name;
    private String age;
    private String jobTitle;

    public Person(String name, String age, String jobTitle){
        this.name= name;
        this.age= age;
        this.jobTitle= jobTitle;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
