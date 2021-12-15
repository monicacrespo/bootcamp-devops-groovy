abstract class User {
    String lastName;
    String firstName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName);
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
    }
}

class FirstChef extends User {
    public String[] Dishes;
}

class Baker extends User {
    public void Bake() {}
}

User[] users = [
   new FirstChef(firstName: "Ferra", lastName: "Adria"),
   new FirstChef(firstName: "Dani", lastName: "Garcia"),
   new FirstChef(firstName: "Jordi", lastName: "Cruz"),
   new FirstChef(firstName: "Joan", lastName: "Roca"),
   new FirstChef(firstName: "Martin", lastName: "Berasategi"),
];

users.each{
    user ->
    if (user instanceof FirstChef) {
        println("Username is ${user.UserName()}");
        user.Dishes.each(d -> println("${d}"));
    } else {
        user.Bake();
    }
}