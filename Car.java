package CarRentalSystem;

import javax.naming.Name;

public class Car {
    private String carId;
    private String carName;
    private String carCompanyName;
    private Double perDayPrice;
    private Boolean isAvailable;
    Car(String Id, String Name,String CompanyName,Double perDayPrice) {
        this.carId = Id;
        this.carName = Name;
        this.carCompanyName = CompanyName;
        this.perDayPrice = perDayPrice;
    }
    public String getCarId(){
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCompanyName() {
        return carCompanyName;
    }
    public void setCarCompanyName(String carCompanyName) {
        this.carCompanyName = carCompanyName;
    }

    public Double getPerDayPrice() {
        return perDayPrice;
    }

    public void setPerDayPrice(Double perDayPrice) {
        this.perDayPrice = perDayPrice;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carName='" + carName + '\'' +
                ", carCompanyName='" + carCompanyName + '\'' +
                ", perDayPrice=" + perDayPrice +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
