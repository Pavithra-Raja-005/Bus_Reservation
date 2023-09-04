package BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.SQLException;

public class Booking {
	
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name of Passenger: ");
		passengerName = scanner.next();
		
		System.out.println("Enter the bus No : ");
		busNo = scanner.nextInt();
		
		System.out.println("Enter the date dd-mm-yyyy");
		String dataInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dataInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable() throws SQLException {
		
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
				
		int capacity = busdao.getCapacity(busNo);
		int booked = bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;
	}

}
