package com.example.domain;

public class BookingPolicyService implements IBookingPolicyService {
    @Override
    public void setEmployeePolicy(EmployeeID employeeID, RoomType roomType) {

    }

    @Override
    public boolean isBookingAllowed(EmployeeID employeeID, RoomType roomType) {
        return false;
    }
}
