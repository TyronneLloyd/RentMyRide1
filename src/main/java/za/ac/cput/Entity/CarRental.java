package za.ac.cput.Entity;

/*
    @Description: CarRental.java -> Car Rental class facilitates the renting of cars and records them
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 3 June 2021
  */

public class CarRental {

    private String rentalID, clientID, numberPlate, employeeNumber, rentalStartDate, rentalEndDate;

    private  CarRental(Builder builder){
        this.rentalID = builder.rentalID;
        this.clientID = builder.clientID;
        this.employeeNumber = builder.employeeNumber;
        this.numberPlate = builder.numberPlate;
        this.rentalStartDate = builder.rentalStartDate;
        this.rentalEndDate = builder.rentalEndDate;
    }

    public static class Builder{

        private String rentalID, clientID, numberPlate, employeeNumber, rentalStartDate, rentalEndDate;

        public Builder setRentalID(String rentalID){
            this.rentalID = rentalID;
            return this;
        }

        public Builder clientID(String clientID){
            this.clientID = clientID;
            return this;
        }

        public Builder numberPlate(String numberPlate){
            this.numberPlate = numberPlate;
            return this;
        }

        public Builder employeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder rentalStartDate(String rentalStartDate){
            this.rentalStartDate = rentalStartDate;
            return this;
        }

        public Builder rentalEndDate(String rentalEndDate){
            this.rentalEndDate = rentalEndDate;
            return this;
        }

        public CarRental build(){return new CarRental(this);}

        public Builder copy(CarRental CarRental){
            this.rentalID = CarRental.rentalID;
            this.clientID = CarRental.clientID;
            this.employeeNumber = CarRental.employeeNumber;
            this.numberPlate = CarRental.numberPlate;
            this.rentalStartDate = CarRental.rentalStartDate;
            this.rentalEndDate = CarRental.rentalEndDate;
            return this;
        }

    }    //Builder class ends

    @Override
    public String toString() {
        return "CarRental{" +
                "rentalID='" + rentalID + '\'' +
                ", clientID='" + clientID + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", rentalEndDate='" + rentalEndDate + '\'' +
                '}';
    }

    public String getRentalID() {
        return rentalID;
    }

    public String getClientID() {
        return clientID;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }
}
