import javax.crypto.Cipher;

// ruleid: insecure_cipher_3des
Cipher cipher = Cipher.getInstance("3DES/CBC/NoPadding");
// ruleid: insecure_cipher_3des
Cipher cipher2 = Cipher.getInstance("DESede/CBC/NoPadding");
// ruleid: insecure_cipher_3des
Cipher cipher3 = Cipher.getInstance("DESEDEWRAP/CBC/NoPadding");
// ruleid: insecure_cipher_3des
SecretKeyFactory factory = SecretKeyFactory.getInstance("DESede");