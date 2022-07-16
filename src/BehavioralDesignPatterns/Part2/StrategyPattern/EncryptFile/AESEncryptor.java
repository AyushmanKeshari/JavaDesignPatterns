package BehavioralDesignPatterns.Part2.StrategyPattern.EncryptFile;

public class AESEncryptor implements Encryptor {
    @Override
    public String encryptFile() {
        return "Applying AES Encryption";
    }
}
