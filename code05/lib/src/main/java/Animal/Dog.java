package Animal;

public class Dog extends Animal{
    public Dog(String firstName) {
        super(firstName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String toString() {
        return  "DOG{" +
                "firstName='" + super.getFirstName() + '\'' +

                '}';

    }
}
