package bridge;

public abstract class CampusPass {

    protected AccessMethod accessMethod;

    public CampusPass(AccessMethod accessMethod) {
        this.accessMethod = accessMethod;
    }

    public void setAccessMethod(AccessMethod accessMethod) {
        this.accessMethod = accessMethod;
    }

    public abstract void enterBuilding(String userName);
}