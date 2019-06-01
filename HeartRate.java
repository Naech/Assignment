

public class HeartRate {

    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private int age;

    public HeartRate(String firstName, String lastName, int month, int day, int year, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
        this.age = age;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
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

    public int calculateAge() {
        //System.out.print("Enter your age: ");
        //int currentYear = input.nextInt();
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
    public String dateOfBirth(){
        return getDay() + "/" + getMonth() + "/" + getDay();
    }

}