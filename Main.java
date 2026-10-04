package bridge;

public class Main {

    public static void main(String[] args) {

        AccessMethod qrScanner = new QRScanner();
        AccessMethod nfcReader = new NFCReader();

        CampusPass studentPass = new StudentPass(qrScanner);

        System.out.println("=== Student with QR ===");
        studentPass.enterBuilding("Anuar");

        System.out.println();

        System.out.println("=== Student switches to NFC ===");
        studentPass.setAccessMethod(nfcReader);
        studentPass.enterBuilding("Anuar");

        System.out.println();

        CampusPass staffPass = new StaffPass(nfcReader);

        System.out.println("=== Staff with NFC ===");
        staffPass.enterBuilding("Professor");
    }
}