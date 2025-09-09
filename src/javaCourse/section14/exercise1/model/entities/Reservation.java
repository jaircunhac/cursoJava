package javaCourse.section14.exercise1.model.entities;

import javaCourse.section14.exercise1.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    //Use throws DomainException because I don't need to deal with it in the method, but in the main class with a catch
    public void updateDate(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckout() {
        return checkOut;
    }
}
