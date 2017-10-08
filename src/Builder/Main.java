package Builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person1 = pb.setFirstName("Augusto").setLastName("Pinochet").setMiddleName("Grande").setSalutation("Jefe").setSuffix("Don").setStreetAddress("calle Olmo").setCity("Cartagena").setState("Andaluzia").setFemale(false).setEmployed(true).setHomeOwner(true).createPerson();
        Person person2 = new PersonBuilder().setFirstName("Horhe").setLastName("Gomez").createPerson();
    }
}
