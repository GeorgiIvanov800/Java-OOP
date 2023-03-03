package Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;
    protected String sound;

    public Animal(String name, int age, String gender) {
        validateNotBlank("Name", name);
        this.name = name;

        if (age < 0) {
            throw new IllegalArgumentException("Age should not be negative, but was: " + age);
        }
        this.age = age;

        validateNotBlank("Gender", gender);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return sound;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + System.lineSeparator()
                + this.getName() + " " + this.getAge() + " " + this.getGender() + System.lineSeparator()
                + this.produceSound();
    }

    private void validateNotBlank(String parameterName, String parameterValue) {
        if (parameterValue == null || parameterValue.trim().isEmpty()) {
            throw new IllegalArgumentException(parameterName +  "should not be null or empty, but was " + parameterValue);
        }
    }
}
