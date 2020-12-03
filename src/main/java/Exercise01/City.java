package Exercise01;

import java.util.Arrays;

public class City extends Ward {

    private District[] districts;

    public City(District[] districts) {

        this.districts = districts;
    }

    public City(String name, int code, String codename, String division_type, int phone_code, District[] districts) {
        super(name, code, codename, division_type, phone_code);
        this.districts = districts;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Thanh pho {" +
                super.toString() +
                " cac quan =" + Arrays.toString(districts) +
                '}';
    }
}
