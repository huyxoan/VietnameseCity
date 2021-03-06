package Exercise01;

public class Ward {
    private String name;
    private int code;
    private String codename;
    private String division_type;
    private int phone_code;

    public Ward() {
    }

    @Override
    public String toString() {
        return "Xa{" +
                "Ten='" + name + '\'' +
                ", code=" + code +
                ", codename='" + codename + '\'' +
                ", kieu='" + division_type + '\'' +
                ", dien thoai=" + phone_code +
                '}';
    }

    public Ward(String name, int code, String codename, String division_type, int phone_code) {
        this.name = name;
        this.code = code;
        this.codename = codename;
        this.division_type = division_type;
        this.phone_code = phone_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getDivision_type() {
        return division_type;
    }

    public void setDivision_type(String division_type) {
        this.division_type = division_type;
    }

    public int getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(int phone_code) {
        this.phone_code = phone_code;
    }
}
