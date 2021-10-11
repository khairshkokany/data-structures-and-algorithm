package Animal;

public class Cat extends Animal{
    public Cat(String firstName) {
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
        return  "CAT{" +
                "firstName='" + super.getFirstName() + '\'' +

                '}';

    }
}
