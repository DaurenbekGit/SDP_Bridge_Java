package bridge;

public class StaffPass extends CampusPass {

    public StaffPass(AccessMethod accessMethod) {
        super(accessMethod);
    }

    @Override
    public void enterBuilding(String userName) {
        System.out.println("Staff member requests access.");
        accessMethod.authenticate(userName);
        System.out.println("Staff access granted.");
    }
}