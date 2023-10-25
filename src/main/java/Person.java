public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private long ssn;
    static int count = 0;

    public Person(){
        count++;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.ssn = 0;
        count++;
    }

    public Person(String firstName, String lastName, byte age, long ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        count++;
    }

    public String speak(){
        if(this.firstName == null && this.lastName == null)
           return "I don't have a name.";
        else if(this.age == 0){
            return "My name is " + this.firstName + " " + this.lastName + ".";
        }
        return "My name is " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old.";
    }

    public String toString(){
        if(this.firstName == null && this.lastName == null)
            return "N/A";
        else if(this.ssn == 0)
            return this.firstName + " " + this.lastName;
        String str = Long.toString(this.ssn);
        return this.firstName + " " + this.lastName + " " + str.substring(str.length()-4);
    }
    static int getPersonCount(){
        return count;
    }
}
