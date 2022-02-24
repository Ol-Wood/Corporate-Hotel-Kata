package com.example.domain;

public interface IBookingPolicyService {
    void setEmployeePolicy(EmployeeID employeeID, RoomType roomType);
    boolean isBookingAllowed(EmployeeID employeeID, RoomType roomType);
}
