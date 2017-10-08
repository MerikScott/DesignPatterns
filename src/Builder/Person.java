package Builder;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private String salutation;
    private String suffix;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomeOwner;

    public Person(String lastName,
                  String firstName,
                  String middleName,
                  String salutation,
                  String suffix,
                  String streetAddress,
                  String city,
                  String state,
                  boolean isFemale,
                  boolean isEmployed,
                  boolean isHomeOwner) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
        this.suffix = suffix;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHomeOwner = isHomeOwner;
    }
}
