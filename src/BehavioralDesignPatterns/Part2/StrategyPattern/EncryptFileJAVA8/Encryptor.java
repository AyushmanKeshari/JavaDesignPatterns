package BehavioralDesignPatterns.Part2.StrategyPattern.EncryptFileJAVA8;

public interface Encryptor {

    String encryptFile();

    //Can define static methods here.
    Encryptor aesEncryptor = () -> "Applying AES encryption";

    Encryptor rsaEncryptor = () -> "Applying RSA encryption";


}
