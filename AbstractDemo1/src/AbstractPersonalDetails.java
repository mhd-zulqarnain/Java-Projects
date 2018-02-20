/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public abstract class AbstractPersonalDetails implements Details {

    String type;

    AbstractPersonalDetails(){
        setType();
    }
    @Override
    public void setType(){
        type="person";
    }
    public String getType(){
        return type;
    }

}
