String getUserName(String firstName, String lastName) {
    return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
}
assert getUserName("Monica", "Crespo") == "mcrespo" : "getUserName isn't working"

// println(getUserName("Monica", "Crespo"))

void printCredentials(cred) {
    println("UserName is ${cred}")
}

printCredentials(getUserName("Monica", "Crespo"))

String[] firstNames = ["Ferra", "Dani", "Jordi", "Joan", "Martin"]
String[] lastNames = ["Adriá", "García", "Cruz", "Roca", "Berasategi"]

for (int i = 0; i < firstNames.size(); i++) {
   printCredentials(
       getUserName(firstNames[i], lastNames[i])
   );
}