package model;

import java.util.List;
import java.util.Objects;

public class PropertyType {
    private Long propertyTypeId;
    private String propertyTypeName;
    private String propertyTypeDescription;

    //One-to-many relationship
    private List<Property> properties;
    public PropertyType(){
    }
    public PropertyType(Long propertyTypeId, String propertyTypeName,
                        String propertyTypeDescription, List<Property> properties) {
        this.propertyTypeId = propertyTypeId;
        this.propertyTypeName = propertyTypeName;
        this.propertyTypeDescription = propertyTypeDescription;
        this.properties = properties;
    }

    public Long getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Long propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getPropertyTypeName() {
        return propertyTypeName;
    }

    public void setPropertyTypeName(String propertyTypeName) {
        this.propertyTypeName = propertyTypeName;
    }

    public String getPropertyTypeDescription() {
        return propertyTypeDescription;
    }

    public void setPropertyTypeDescription(String propertyTypeDescription) {
        this.propertyTypeDescription = propertyTypeDescription;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "PropertyType{" +
                "propertyTypeId=" + propertyTypeId +
                ", propertyTypeName='" + propertyTypeName + '\'' +
                ", propertyTypeDescription='" + propertyTypeDescription + '\'' +
                ", properties=" + properties +
                '}';
    }
}
