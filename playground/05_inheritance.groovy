class User {
    String lastName;
    String firstName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName);
    }

    String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
    }
}

User[] users = [
    new User(firstName: "Ferra", lastName: "Adria"),
    new User(firstName: "Dani", lastName: "Garcia"),
    new User(firstName: "Jordi", lastName: "Cruz"),
    new User(firstName: "Joan", lastName: "Roca"),
    new User(firstName: "Martin", lastName: "Berasategi"),
];

users.each(user -> println("UserName is ${user.UserName()}"))