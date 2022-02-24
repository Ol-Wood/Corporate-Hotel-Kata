import com.example.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookingFeature {

    private IBookingPolicyService bookingPolicyervice;
    private BookingService bookingService;

    @BeforeEach
    void setUp(){
        this.bookingPolicyervice = new BookingPolicyService();
        this.bookingService = new BookingService(this.bookingPolicyervice);
    }

    @Test
    void should_create_booking_if_booking_policy_allows_it(){
        var employeeID = new EmployeeID(1);
        var roomType = RoomType.DEFAULT;
        bookingPolicyervice.setEmployeePolicy(employeeID, roomType);
        var checkinDate = LocalDateTime.now();
        var checkoutDate = LocalDateTime.now();

        Booking result = bookingService.book(employeeID, new HotelID(1), roomType, checkinDate, checkoutDate);
        assertNotNull(result);
    }
}
