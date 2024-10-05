package CarRentalSystem;

public class Driving {

    private String drivingId;
    private String driverName;
    private String userId;
    Driving(String Id,String Name,String userId){
        this.drivingId=Id;
        this.driverName=Name;
        this.userId=userId;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDrivingId() {
        return drivingId;
    }

    public void setDrivingId(String drivingId) {
        this.drivingId = drivingId;
    }
    @Override
    public String toString() {
        return "Driving{" +
                "drivingId='" + drivingId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
