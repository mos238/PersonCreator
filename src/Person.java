// Person Object Blueprint
public class Person {
    // Declare All attributes, encapsulate using private keyword
    private String name;
    private int age;
    private int height;
    private double weight;
    // Method Constructors
    public Person(String name, int age, int height, double weight) { // list all setter methods
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }
    // Setter method for name, age, height, weight, growOlder:  Always USE void, pass all parameters
    public void setName (String name) {
        this.name = name;
    }
    // Getter methods for name etc, return value, no parameter passing
    public String getName() {
        return name;
    }
    // Setter methods for age etc,
    public void setAge (int age) {this.age = age;}
    // Getter method for age, return value, no parameter passing
    public int getAge() {return age;}
    // Use shortcut cmd  + n (Alt + Insert: windows)
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    // Behavioural Method Component
    public void growOlder(){
       setAge(getAge()+1); // Increase age by 1
       setHeight(getHeight()-1); // Decrease height by 1
       setWeight(getWeight()-0.5);// Decrease the weight  by 0.5
        }
    }
