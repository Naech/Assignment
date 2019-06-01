public class HealthProfile{

    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private int height;
    private int weight;
    private int age;

    public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, int height, int weight, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName; 
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public int calculateAge() {
        int age = 2019 - year; 
        return age;
    }

    public int maxHeartRate() {
        int calculateHeartRate = 220 - age;
        return calculateHeartRate;
    }

    public double targetHeartRate(){
        double maxHeartRate = maxHeartRate()* 0.80;
        return maxHeartRate;
 }
    public double calculateBMI(){
        double bmi = weight * 730 / height * height;
        return bmi;
    }
}