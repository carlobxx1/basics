package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCode {
    private List<Car> cars;
    private List<Driving> drivings;
    private List<Rental> rentals;

    MainCode() {
        cars = new ArrayList<>();
        drivings = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Driving> getDrivings(Driving newCustomer) {
        return drivings;
    }

    public void setDrivings(List<Driving> drivings) {
        this.drivings = drivings;
    }

    public void setRentals(Car car, Driving driving, Double rentDay, String rentDate) {
        if (car.getIsAvailable()) {
            car.setIsAvailable(false);
            rentals.add(new Rental(car, driving, rentDay, rentDate));
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    public void returnCar(Car cars) {
        cars.setIsAvailable(true);
        Rental renturnToRemove = null;
        for (Rental rental1 : rentals) {
            if (rental1.getCar() == cars) {
                renturnToRemove = rental1;
                break;
            }
        }
        if (renturnToRemove != null) {
            rentals.remove(renturnToRemove);
        } else {
            System.out.println("car has not been return");
        }

    }

    public void menu() {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("\n---------------------Welcome to car rental System application------------------------");
            System.out.println("press 1 :To Rent a car");
            System.out.println("press 2 :To Return a car");
            System.out.println("press 3 :To Exit");
            int press = scan.nextInt();
            scan.nextLine();
            if (press == 1) {
                System.out.println("\n ----To Rent a Car----\n");
                System.out.print("Enter your name according to driving id: ");
                String driverName = scan.nextLine();
                System.out.print("your drivingId pz: ");
                String userId = scan.nextLine();
                System.out.println("\nAvailable Cars:");

                for (Car car : cars) {
                    if (car.getIsAvailable()) {
                        System.out.println(car.getCarId() + " - " + car.getCarName() + " " +
                                car.getCarCompanyName() + " " + car.getPerDayPrice());
                    }
                }
                System.out.print("\nEnter the car ID you want to rent the car: ");
                String carId = scan.nextLine();

                System.out.print("Enter the number of days for rental this car: ");
                Double rentalDays = scan.nextDouble();
                scan.nextLine(); // Consume newline

                System.out.print("Enter a date (date month) eg 02 03: ");
                String dateStr = scan.nextLine();

                Driving newCustomer = new Driving("driver" + (drivings.size() + 1), driverName, userId);
                getDrivings((newCustomer));

                Car selectedCar = null;
                for (Car car : cars) {
                    if (car.getCarId().equals(carId) && car.getIsAvailable()) {
                        selectedCar = car;
                        break;
                    }
                }
                if (selectedCar != null) {
                    Double totalPrice = rentalDays * selectedCar.getPerDayPrice();
                    System.out.println("\n== Rental Information ==\n");
                    System.out.println("Customer ID: " + newCustomer.getDrivingId());
                    System.out.println("Customer Name: " + newCustomer.getDriverName());
                    System.out.println("Customer Driving ID: " + newCustomer.getUserId());
                    System.out.println("Car: " + selectedCar.getCarName() + " " + selectedCar.getCarCompanyName() + " " + selectedCar.getCarId());
                    System.out.println("Rental Days: " + rentalDays);

                    System.out.println("Rental Date: " + dateStr);

                    System.out.printf("Total Price: ₹%.2f%n", totalPrice);

                    System.out.print("\nConfirm rental (Y/N): ");
                    String confirm = scan.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {
                        setRentals(selectedCar, newCustomer, rentalDays, dateStr);
                        System.out.println("\n your Car rented successfully.");
                    } else {
                        System.out.println("\nRental canceled.");
                    }
                } else {
                    System.out.println("\nInvalid car selection or car not available for rent.");
                }
            } else if (press == 2) {
                System.out.println("\n== Return a Car ==\n");
                System.out.print("Enter the car ID you want to return: ");
                String carId = scan.nextLine();
                Car carToReturn = null;
                for (Car car : cars) {
                    if (car.getCarId().equals(carId) && !car.getIsAvailable()) {
                        carToReturn = car;
                        break;
                    }
                }
                if (carToReturn != null) {
                    Driving driving = null;
                    for (Rental rental : rentals) {
                        if (rental.getCar() == carToReturn) {
                            driving = rental.getDriving();
                            break;
                        }
                    }
                    if (driving != null) {
                        returnCar(carToReturn);
                        System.out.println("Car returned successfully by " + driving.getDriverName() + driving.getDrivingId());
                    } else {
                        System.out.println("Car was not rented or rental information is missing.");
                    }
                } else {
                    System.out.println("Invalid car ID or car is not rented.");
                }
            } else if (press == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println("\nThank you for using the Car Rental System!");
    }

    public static void main(String[] args) {
        MainCode rentalSystem = new MainCode();

        Car car1 = new Car("C001", "Toyota", "Camry", 600.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "city", 700.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 1500.0);
        rentalSystem.addCars(car1);
        rentalSystem.addCars(car2);
        rentalSystem.addCars(car3);

        rentalSystem.menu();
    }

    private void addCars(Car car1) {
    }
}
