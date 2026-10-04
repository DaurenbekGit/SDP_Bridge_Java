package bridge;

public class QRScanner implements AccessMethod {

    @Override
    public void authenticate(String userName) {
        System.out.println("QR code verified for " + userName);
    }
}