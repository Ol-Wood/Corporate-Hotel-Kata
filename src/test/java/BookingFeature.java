import com.example.domain.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookingFeature {

    @Test
    void should_create_booking(){
        var bookingService = new BookingService();
        var checkinDate = LocalDateTime.now();
        var checkoutDate = LocalDateTime.now();
        Booking result = bookingService.book(new EmployeeID(1), new HotelID(1), RoomType.DEFAULT, checkinDate, checkoutDate);
        assertNotNull(result);
    }
}
