public class TenantTest {
    public static void main (String[] args){

        new TenantController(new Tenant(100000, "default_tenant", "", "", "", "default_pic.png"));
    }
}
