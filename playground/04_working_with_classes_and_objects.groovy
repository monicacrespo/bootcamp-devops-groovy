class User {
    String lastName;
    String firstName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName);
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
    }
}

String[] firstNames = ["Ferra", "Dani", "Jordi", "Joan", "Martin"]
String[] lastNames = ["Adriá", "García", "Cruz", "Roca", "Berasategi"]

for (int i = 0; i < firstNames.size(); i++) {
    User u = new User(firstName: firstNames[i], lastName: lastNames[i]);
    println("UserName is ${u.UserName()}")  
}

User[] users = [
   new User(firstName: "Ferra", lastName: "Adria"),
   new User(firstName: "Dani", lastName: "Garcia"),
   new User(firstName: "Jordi", lastName: "Cruz"),
   new User(firstName: "Joan", lastName: "Roca"),
   new User(firstName: "Martin", lastName: "Berasategi"),
];

for (int i = 0; i < users.size(); i++) {
   println("UserName is ${users[i].UserName()}")
}
