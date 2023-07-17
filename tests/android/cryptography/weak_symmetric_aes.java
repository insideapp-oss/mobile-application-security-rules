import java.security.KeyPairGenerator;

// ruleid: weak_symmetric_aes
KeyPairGenerator keyGen_weak = KeyPairGenerator.getInstance("AES");
keyGen_weak.initialize(128);

// ruleid: weak_symmetric_aes
KeyPairGenerator keyGen_weak_again = KeyPairGenerator.getInstance("AES");
keyGen_weak_again.initialize(192);

// ok: weak_symmetric_aes
KeyPairGenerator keyGen = KeyPairGenerator.getInstance("AES");
keyGen.initialize(256);