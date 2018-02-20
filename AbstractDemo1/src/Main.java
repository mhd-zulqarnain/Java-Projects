public class Main {

    public static void main(String[] args) throws NicExecption {

        Person p1=new Person();
//        p1.setNic("134124");

        System.out.println(p1.getType());

        if(p1.getNic().equals("")) {
            throw new NicExecption("nic not found");

        }
    }
}
