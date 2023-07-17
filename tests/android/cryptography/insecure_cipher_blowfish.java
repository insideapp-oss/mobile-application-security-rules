import javax.crypto.Cipher;

// ruleid: insecure_cipher_blowfish
Cipher cipher = Cipher.getInstance("Blowfish");
// ruleid: insecure_cipher_blowfish
Cipher cipher2 = Cipher.getInstance("Blowfish/ECB/NoPadding");