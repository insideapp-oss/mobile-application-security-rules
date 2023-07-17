import javax.crypto.Cipher;

// ruleid: insecure_cipher_des
val cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
// ruleid: insecure_cipher_des
val factory = SecretKeyFactory.getInstance("DES");