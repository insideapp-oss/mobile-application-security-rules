import javax.crypto.Cipher;

// ruleid: insecure_cipher_rc2
Cipher cipher = Cipher.getInstance("RC2/CBC/PKCS5Padding");
// ruleid: insecure_cipher_rc2
SecretKeyFactory factory = SecretKeyFactory.getInstance("RC2");