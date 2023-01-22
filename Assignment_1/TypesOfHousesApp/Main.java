import model.Property;
import model.PropertyType;
import service.PropertyService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        //null space will be set later with Property class.
        PropertyType propertyType1 = new PropertyType(1L,"House",
                                  "New House",null);

        PropertyType propertyType2 = new PropertyType(2L,"Villa",
                "New Villa",null);

        PropertyType propertyType3 = new PropertyType(3L,"SummerHouse",
                "New SummerHouse",null);

       //House
        Property propertyHouse1 = new Property(1L,"House",500000D,85,
                3,14,propertyType1,1);
        Property propertyHouse2 = new Property(2L,"House",1200000D,90,
                6,5,propertyType1,1);
        Property propertyHouse3 = new Property(3L,"House",900000D,110,
                3,13,propertyType1,1);

        //Villa
        Property propertyVilla1 = new Property(4L,"Villa",900000D,150,
                5,14,propertyType2,1);
        Property propertyVilla2 = new Property(5L,"Villa",1700000D,160,
                7,5,propertyType2,1);
        Property propertyVilla3 = new Property(6L,"Villa",1000000D,110,
                4,13,propertyType2,1);

        //SummerHouse
        Property propertySummerhouse1 = new Property(7L,"SummerHouse",400000D,50,
                1,10,propertyType3,1);
        Property propertySummerhouse2 = new Property(8L,"SummerHouse",800000D,60,
                2,3,propertyType3,1);
        Property propertySummerhouse3 = new Property(9L,"SummerHouse",600000D,45,
                2,10,propertyType3,1);

        //PropertyType class must be set with List<Property>
        List<Property> houseProperties = new ArrayList<>();
        houseProperties.add(propertyHouse1);
        houseProperties.add(propertyHouse2);
        houseProperties.add(propertyHouse3);

        //Setting
        propertyType1.setProperties(houseProperties);

        List<Property> villaProperties = new ArrayList<>();
        villaProperties.add(propertyVilla1);
        villaProperties.add(propertyVilla2);
        villaProperties.add(propertyVilla3);

        propertyType2.setProperties(villaProperties); //

        List<Property> summerhouseProperties = new ArrayList<>();
        summerhouseProperties.add(propertySummerhouse1);
        summerhouseProperties.add(propertySummerhouse2);
        summerhouseProperties.add(propertySummerhouse3);

        propertyType3.setProperties(summerhouseProperties); //




        PropertyService propertyService1 = new PropertyService(houseProperties);
        PropertyService propertyService2 = new PropertyService(villaProperties);
        PropertyService propertyService3 = new PropertyService(summerhouseProperties);

        List<Property> properties = new ArrayList<>();//It's for getAllTotalPrice method
        properties.addAll(houseProperties);
        properties.addAll(villaProperties);
        properties.addAll(summerhouseProperties);

        PropertyService propertyService4 = new PropertyService(properties);

        System.out.println("Total Price of House: " + propertyService1.getTotalPriceOfHouse() + "   " +
                           "Total Price of Villa: " + propertyService2.getTotalPriceOfVilla() + "   " +
                           "Total Price of SummerHouse: " + propertyService3.getTotalPriceOfSummerHouse()+ "   " +
                           "Total Price For All Properties: " + propertyService4.getTotalPriceOfAllProperties()+ "   " +
                           "Total SquareMeters of House: " + propertyService1.getAverageNumberOfSquareOfHouse()+ "   " +
                           "Total SquareMeters of Villa: " + propertyService2.getAverageNumberOfSquareOfVilla()+ "   " +
                           "Total SquareMeters of SummerHouse: "+ propertyService3.getAverageNumberOfSquareOfSummerHouse()+ "   " +
                           "Total SquareMeters of All Properties: " + propertyService4.getAverageNumberOfSquareOfAllProperties());
        System.out.println("Properties by number of rooms and halls: " + propertyService4.getByNumberOfRoomsAndSquareMeters(3,1)
                );

    }
}
