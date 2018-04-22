package Java8.ComparatorUsingLambda;

public class Student {
    private String name;
    private int age;
    private String s_class;

  public Student() {
  }

    public Student(String name, int age, String s_class) {
        super();
        this.name = name;
        this.age = age;
        this.s_class = s_class;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getS_class() {
        return s_class;
    }

    public Student setS_class(String s_class) {
        this.s_class = s_class;
        return this;
    }

    @Override
    public String toString() {
        return "Student [  name:" +name+"  age:"+age+"  class:"+s_class+" ]";
    }
}
