import javax.crypto.Cipher;

// ruleid: insecure_cipher_ecb
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
// ruleid: insecure_cipher_ecb
Cipher cipher2 = Cipher.getInstance("Blowfish/ECB/NoPadding");
// ruleid: insecure_cipher_ecb
KeyGenParameterSpec spec = new KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_ECB)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
    .build();