import javax.crypto.Cipher;

// ruleid: insecure_cipher_des
Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
// ruleid: insecure_cipher_des
SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");