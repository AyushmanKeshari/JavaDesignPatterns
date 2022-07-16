package BehavioralDesignPatterns.Part1.ChainOfResponsibilityPattern.Solution_AuthenticationRequest;

public class Client {

  public static void main(String[] args) {

    AuthenticationHandler chain = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(
            new DigestAuthenticationHandler(null)));

    chain.handleRequest("basic");
    chain.handleRequest("digest");
    chain.handleRequest("client certificate");
  }

}
