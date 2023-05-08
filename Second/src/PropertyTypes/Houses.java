package PropertyTypes;

import BaseClass.Property;
import Enums.PropertyCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Houses extends Property {
    private int noOfFloors;
    private double yardSize;

    public Houses(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms, double rentPerMonth,
                  boolean isOccupiedStatus, PropertyCode property, int noOfFloors, double yardSize) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.noOfFloors = noOfFloors;
        this.yardSize = yardSize;
    }

    @Override
    public double rentalIncome() {
        return getRentPerMonth() * getNoOfBedrooms() * getNoOfFloors();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "noOfFloors=" + noOfFloors + "," +'\n' +
                "yardSize=" + yardSize + "\n\n";
    }
}
