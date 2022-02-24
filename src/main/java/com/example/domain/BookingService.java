package com.example.domain;

import java.time.LocalDateTime;

public class BookingService {
    private IBookingPolicyService bookingPolicyervice;

    public BookingService(IBookingPolicyService bookingPolicyervice) {
        this.bookingPolicyervice = bookingPolicyervice;
    }

    public Booking book(EmployeeID employeeID,
                        HotelID hotelID,
                        RoomType roomType,
                        LocalDateTime checkinDate,
                        LocalDateTime checkoutDate) {

        // check employee policy
        var isBookingAllowed = bookingPolicyervice.isBookingAllowed(employeeID, roomType);

        if (isBookingAllowed){
            new Booking();
        }
        return null;
    }
}
