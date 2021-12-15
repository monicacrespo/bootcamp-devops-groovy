import groovy.json.JsonSlurper
String filePath = "chef.json";

def jsonSlurper = new JsonSlurper()
ArrayList data = jsonSlurper.parse(new File(filePath));

println(data.getClass())

for (chef: data) {

    println(chef.name);
    for (restaurant: chef.restaurants) {
        println('\t' + restaurant.name)
    
        for (dish: restaurant.dishes){
            println("\t\t" + dish.name + ": \$" + dish.price)
        }
    }  
}