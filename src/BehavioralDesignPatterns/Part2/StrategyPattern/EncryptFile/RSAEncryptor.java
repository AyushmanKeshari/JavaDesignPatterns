package BehavioralDesignPatterns.Part2.StrategyPattern.EncryptFile;

public class RSAEncryptor implements Encryptor {
    @Override
    public String encryptFile() {
        return "Applying RSA Encryption";
    }
}
