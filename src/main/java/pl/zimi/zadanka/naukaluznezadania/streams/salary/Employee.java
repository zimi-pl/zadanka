package pl.zimi.zadanka.naukaluznezadania.streams.salary;


//https://geek.justjoin.it/zastosowanie-stream-api-z-java-8-przyklady

public class Employee {
    private int id;
    private double salary;
    private String division;
    private DayJob dayJob;

    public Employee(int id, double salary, String division, DayJob dayJob) {
        this.id = id;
        this.salary = salary;
        this.division = division;
        this.dayJob = dayJob;
    }

    public enum DayJob {
        FULL_TIME("Full-time job"),
        PART_TIME("Part-time job");

        String dayJobDescription;

        DayJob(String dayJobDescription) {
            this.dayJobDescription = dayJobDescription;
        }
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Employee {");
        stringBuilder.append(" \nid: ").append(this.id);
        stringBuilder.append(", \nsalary: ").append(this.salary);
        stringBuilder.append(", \ndivision: ").append(this.division);
        stringBuilder.append(", \ndayJob: ").append(this.dayJob);
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
    public String getDivision(){
        return this.division;
    }
    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public DayJob getDayJob() {
        return dayJob;
    }
}
