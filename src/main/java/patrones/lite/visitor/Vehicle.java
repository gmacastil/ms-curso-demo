package com.lite.visitor;

public interface Vehicle {

    int accept(VehicleInspector vehicleInspector);

}
