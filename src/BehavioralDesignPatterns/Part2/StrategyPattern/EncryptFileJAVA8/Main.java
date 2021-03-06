package BehavioralDesignPatterns.Part2.StrategyPattern.EncryptFileJAVA8;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.pdf");

        file.encrypt(Encryptor.aesEncryptor);

        file.encrypt(Encryptor.rsaEncryptor);
    }
}
