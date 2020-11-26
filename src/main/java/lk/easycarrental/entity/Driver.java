package lk.easycarrental.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    private String nic;
    private String fname;
    private String lname;
    private String username;
    private String password;
    private String address;
    private String contact;
    private String email;

    public Driver() {
    }

    public Driver(String nic, String fname, String lname, String username, String password, String address, String contact, String email) {
        this.nic = nic;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
