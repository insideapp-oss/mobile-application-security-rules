import javax.crypto.Cipher;

// ruleid: insecure_cipher_rc2
val cipher = Cipher.getInstance("RC2/CBC/PKCS5Padding");
// ruleid: insecure_cipher_rc2
val factory = SecretKeyFactory.getInstance("RC2");