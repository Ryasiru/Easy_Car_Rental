package lk.easycarrental.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;
    private String name;
    private String nic;
    private String contact;
    private String regno;
    private String start;
    private String end;
    private String pickup;
    private String dropoff;
    private String passengers;
    private String driverstatus;
    private String driverid;
    private String drivername;
    private String drivercontact;
    private String bookingstatus;

    public BookingDetail() {
    }

    public BookingDetail(String name, String nic, String contact, String regno, String start, String end, String pickup, String dropoff, String passengers, String driverstatus, String driverid, String drivername, String drivercontact, String bookingstatus) {
        this.name = name;
        this.nic = nic;
        this.contact = contact;
        this.regno = regno;
        this.start = start;
        this.end = end;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.passengers = passengers;
        this.driverstatus = driverstatus;
        this.driverid = driverid;
        this.drivername = drivername;
        this.drivercontact = drivercontact;
        this.bookingstatus = bookingstatus;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getDrivercontact() {
        return drivercontact;
    }

    public void setDrivercontact(String drivercontact) {
        this.drivercontact = drivercontact;
    }

    public String getBookingstatus() {
        return bookingstatus;
    }

    public void setBookingstatus(String bookingstatus) {
        this.bookingstatus = bookingstatus;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getDriverstatus() {
        return driverstatus;
    }

    public void setDriverstatus(String driverstatus) {
        this.driverstatus = driverstatus;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }
}
