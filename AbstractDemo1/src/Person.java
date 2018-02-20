/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public class Person extends AbstractPersonalDetails {
    String type,nic="";

    public String getNic() {
        return nic;
    }

    @Override
    public void setNic(String nic) {
        this.nic=nic;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
