package pojojavabin;
//JavaBean
public class EmpBean implements java.io.Serializable {
    private int eid;
    private String ename;
    private double esal;

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getEid() {
        return eid;
    }

}
