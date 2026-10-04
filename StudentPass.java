package bridge;

public class StudentPass extends CampusPass {

    public StudentPass(AccessMethod accessMethod) {
        super(accessMethod);
    }

    @Override
    public void enterBuilding(String userName) {
        System.out.println("Student requests access.");
        accessMethod.authenticate(userName);
        System.out.println("Student access granted.");
    }
}