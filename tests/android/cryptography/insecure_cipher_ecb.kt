import javax.crypto.Cipher;

// ruleid: insecure_cipher_ecb
val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
// ruleid: insecure_cipher_ecb
val cipher2 = Cipher.getInstance("Blowfish/ECB/NoPadding");
// ruleid: insecure_cipher_ecb
val spec = KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_ECB)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
    .build()