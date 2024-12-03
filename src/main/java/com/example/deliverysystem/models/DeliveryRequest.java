package com.example.deliverysystem.models;

public class DeliveryRequest {
    private String customerName;
    private String address;
    private String packageDetails;

    public DeliveryRequest(String customerName, String address, String packageDetails) {
        this.customerName = customerName;
        this.address = address;
        this.packageDetails = packageDetails;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", packageDetails='" + packageDetails + '\'' +
                '}';
    }
}
