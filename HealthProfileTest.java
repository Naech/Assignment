public class HealthProfileTest{

    public static void main(String args[]){
         
        HealthProfile health = new HealthProfile("John", "Clinton", "Male", 04, 29, 1973, 57, 75, 173);

        System.out.println(health.getFirstName() + " " + health.getLastName() + " :" + "\nGender: " + health.getGender() + "\nMonth: " + " " + health.getMonth() + "\nDay: " + " " + health.getDay() + "\nYear: " + " " + health.getYear() + "\nWeight: " + " " + health.getWeight() + "\nHeight: " + " " + health.getHeight());

        health.calculateAge();
        health.maxHeartRate();
        health.targetHeartRate();
        health.calculateBMI();
        System.out.println();

        System.out.println(health.getFirstName() + " " + health.getLastName() + " :" + "\nAge: " + " " + health.calculateAge() + "\nHeart Rate: "  + " " + health.maxHeartRate() + "\nTargeted Heart Rate: " + " " + health.targetHeartRate() + "\nBMI: " + " " + health.calculateBMI());

        //String.out.println(health.getFirstName() + " " + health.getLastName() + " " + )
    }
}