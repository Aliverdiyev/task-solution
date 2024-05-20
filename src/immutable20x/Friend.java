package immutable20x;

public final class Friend {
    private final String name;
    private final String hometown;
    private final int age;
    private final String hobby;
    private final String phoneNumber;

    public Friend(String name) {
        this(name, "");
        System.out.println("friend 0");
    }

    public Friend(String name, String hometown) {
        this(name, hometown, 0);
        System.out.println("friend 1");
    }

    public Friend(String name, String hometown, int age) {
        this(name, hometown, age, "");
        System.out.println("friend 2");
    }

    public Friend(String name, String hometown, int age, String hobby) {
        this(name, hometown, age, hobby, "");
        System.out.println("friend 3");
    }

    public Friend(String name, String hometown, int age, String hobby, String phoneNumber) {
        this.name = name;
        this.hometown = hometown;
        this.age = age;
        this.hobby = hobby;
        this.phoneNumber = phoneNumber;
        System.out.println("friend 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

