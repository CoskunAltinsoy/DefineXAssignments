package service;

import model.Property;

import java.util.ArrayList;
import java.util.List;

public class PropertyService {

    private List<Property> properties;
    public PropertyService(List<Property> properties){
        this.properties = properties;
    }

    public int getTotalPriceOfHouse(){
        int totalPrice = 0;
        for (Property property: properties) {
            if(property.getPropertyTypeId().getPropertyTypeName().toLowerCase().equals("house")){
               totalPrice+=property.getPrice();
            }
        }
        return totalPrice;
    }

    public int getTotalPriceOfVilla(){
        int totalPrice = 0;
        for (Property property: properties) {
            if(property.getPropertyTypeId().getPropertyTypeName().toLowerCase().equals("villa")){
                totalPrice+=property.getPrice();
            }
        }
        return totalPrice;
    }

    public int getTotalPriceOfSummerHouse(){
        int totalPrice = 0;
        for (Property property: properties) {
            if(property.getPropertyTypeId().getPropertyTypeName().toLowerCase().equals("summerhouse")){
                totalPrice+=property.getPrice();
            }
        }
        return totalPrice;
    }

    public int getTotalPriceOfAllProperties(){
        int totalPrice = 0;
        for (Property property: properties) {
            totalPrice+=property.getPrice();
        }
        return totalPrice;
    }

    public int getAverageNumberOfSquareOfHouse(){
        int totalSquare = 0;
        int numOfHouse = 0;
        for (Property property: properties) {
            if(property.getPropertyTypeId().getPropertyTypeName().toLowerCase().equals("house")){
                totalSquare+=property.getSquareMeters();
                numOfHouse++;
            }
        }
        return totalSquare / numOfHouse;
    }

    public int getAverageNumberOfSquareOfVilla(){
        int totalSquare = 0;
        int numOfHouse = 0;
        for (Property property: properties) {
            if(property.getPropertyTypeId().getPropertyTypeName().toLowerCase().equals("villa")){
                totalSquare+=property.getSquareMeters();
                numOfHouse++;
            }
        }
        return totalSquare / numOfHouse;
    }

    public int getAverageNumberOfSquareOfSummerHouse(){
        int totalSquare = 0;
        int numOfHouse = 0;
        for (Property property: properties) {
            if(property.getPropertyTypeId().getPropertyTypeName().toLowerCase().equals("summerhouse")){
                totalSquare+=property.getSquareMeters();
                numOfHouse++;
            }
        }
        return totalSquare / numOfHouse;
    }

    public int getAverageNumberOfSquareOfAllProperties(){
        int totalSquare = 0;
        for (Property property: properties) {
            totalSquare+=property.getSquareMeters();
        }
        return totalSquare / properties.size();
    }

    public List<Property> getByNumberOfRoomsAndSquareMeters(int numberOfRooms, int numberOfHall){
        List<Property> getProperties = new ArrayList<>();
        for (Property property: properties) {
            if(property.getNumberOfRooms() == numberOfRooms &&
                property.getNumberOfHall() == numberOfHall) {
                getProperties.add(property);
            }
        }
        return getProperties;
    }

}
