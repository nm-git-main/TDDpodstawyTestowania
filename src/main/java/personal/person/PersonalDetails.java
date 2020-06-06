package personal.person;

public class PersonalDetails {
    String name;
    String lastName;
    int age;

    public PersonalDetails(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String checkAge() {
        if (age < 10) {
            return "Dziecko";
        } else if (age < 18) {
            return "Nastolatek";
        } else {
            return "Dorosly";
        }
    }
}
