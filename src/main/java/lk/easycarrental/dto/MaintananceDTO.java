package lk.easycarrental.dto;

public class MaintananceDTO {

    private String mid;
    private String regno;
    private String description;
    private String maintanancedate;
    private String returndate;

    public MaintananceDTO() {
    }

    public MaintananceDTO(String mid, String regno, String description, String maintanancedate, String returndate) {
        this.mid = mid;
        this.regno = regno;
        this.description = description;
        this.maintanancedate = maintanancedate;
        this.returndate = returndate;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaintanancedate() {
        return maintanancedate;
    }

    public void setMaintanancedate(String maintanancedate) {
        this.maintanancedate = maintanancedate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }
}
