package bridge;

public class NFCReader implements AccessMethod {

    @Override
    public void authenticate(String userName) {
        System.out.println("NFC card verified for " + userName);
    }
}