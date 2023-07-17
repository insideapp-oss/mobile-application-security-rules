import java.security.KeyPairGenerator;

// ruleid: weak_asymmetric_rsa
KeyPairGenerator keyGen_weak = KeyPairGenerator.getInstance("RSA");
keyGen_weak.initialize(512);

// ruleid: weak_asymmetric_rsa
KeyPairGenerator keyGen_weak_again = KeyPairGenerator.getInstance("RSA");
keyGen_weak_again.initialize(2048);

// ok: weak_asymmetric_rsa
KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
keyGen.initialize(3072);