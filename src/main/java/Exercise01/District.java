package Exercise01;

public class District extends Ward{
    private Ward[] wards;

    public District() {

    }

    public District(String name, int code, String codename, String division_type, int phone_code, Ward[] wards) {
        super(name, code, codename, division_type, phone_code);
        this.wards = wards;
    }

    public Ward[] getWards() {
        return wards;
    }

    public void setWards(Ward[] wards) {
        this.wards = wards;
    }

    public District(Ward[] wards) {
        this.wards = wards;
    }
}
