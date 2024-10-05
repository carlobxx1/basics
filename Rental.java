package CarRentalSystem;

public class Rental {
    private Car car;
    private Driving driving;
    private Double rentDays;
    private String rentDate;
     Rental(Car car,Driving driving ,Double rentDay,String rentDate){
         this.car=car;
         this.driving=driving;
         this.rentDays=rentDay;
         this.rentDate=rentDate;
     }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driving getDriving() {
        return driving;
    }

    public void setDriving(Driving driving) {
        this.driving = driving;
    }

    public Double getRentDays() {
        return rentDays;
    }

    public void setRentDays(Double rentDays) {
        this.rentDays = rentDays;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", driving=" + driving +
                ", rentDays=" + rentDays +
                ", rentDate='" + rentDate + '\'' +
                '}';
    }
}
