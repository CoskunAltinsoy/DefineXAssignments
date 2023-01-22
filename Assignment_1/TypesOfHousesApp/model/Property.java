package model;

import java.util.Objects;

public class Property {
    private Long propertyId;
    private String propertyName;
    private Double price;
    private int squareMeters;
    private int numberOfRooms;
    private int ageOfApartment;

    private int numberOfHall;
    private PropertyType propertyTypeId;

    public Property() {
    }
    public Property(Long propertyId, String propertyName, Double price, int squareMeters,
                    int numberOfRooms, int ageOfApartment, PropertyType propertyTypeId,
                    int numberOfHall) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.ageOfApartment = ageOfApartment;
        this.numberOfHall = numberOfHall;
        this.propertyTypeId = propertyTypeId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getAgeOfApartment() {
        return ageOfApartment;
    }

    public void setAgeOfApartment(int ageOfApartment) {
        this.ageOfApartment = ageOfApartment;
    }
    public PropertyType getPropertyTypeId() {
        return propertyTypeId;
    }
    public int getNumberOfHall() {
        return numberOfHall;
    }
    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }
    public void setPropertyTypeId(PropertyType propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property property)) return false;
        return getSquareMeters() == property.getSquareMeters() &&
                getNumberOfRooms() == property.getNumberOfRooms() &&
                getAgeOfApartment() == property.getAgeOfApartment() &&
                getNumberOfHall() == property.getNumberOfHall() &&
                Objects.equals(getPropertyId(), property.getPropertyId()) &&
                Objects.equals(getPropertyName(), property.getPropertyName()) &&
                Objects.equals(getPrice(), property.getPrice()) &&
                Objects.equals(getPropertyTypeId(), property.getPropertyTypeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyId(), getPropertyName(),
                            getPrice(), getSquareMeters(), getNumberOfRooms(),
                            getAgeOfApartment(),getNumberOfHall(), getPropertyTypeId());
    }*/

    @Override
    public String toString() {
        return "Property{" +
                "propertyId=" + propertyId +
                ", propertyName='" + propertyName + '\'' +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfHall=" + numberOfHall +
                ", ageOfApartment=" + ageOfApartment +
                ", propertyTypeId=" + propertyTypeId +
                '}';
    }
}
