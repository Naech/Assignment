public class HeartRates{

    public static void main(String args[]){
        
        HeartRate person = new HeartRate("Max", "Zayn", 29, 04, 1973, 14);

        System.out.println(person.getFirstName() + " " + person.getLastName() + "'s " + " " + "date of birth is " + person.getMonth() + " " + "/" + person.getDay() + " " + "/" + person.getYear());
        
        person.calculateAge();
        person.maxHeartRate();
        person.targetHeartRate();
        System.out.println();

        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + "is " + person.calculateAge() + " years" + " " + "and his test result states: " + "\nHeart Rate: " + person.maxHeartRate() + "\nTargeted Heart Rate: " + " " + person.targetHeartRate());

    
    }

}