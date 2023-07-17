import javax.crypto.Cipher;

// ruleid: insecure_cipher_blowfish
val cipher = Cipher.getInstance("Blowfish");
// ruleid: insecure_cipher_blowfish
val cipher2 = Cipher.getInstance("Blowfish/ECB/NoPadding");