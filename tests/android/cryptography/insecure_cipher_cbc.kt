import javax.crypto.Cipher;

// ruleid: insecure_cipher_cbc
val cipher_pkcs5 = Cipher.getInstance("AES/CBC/PKCS5Padding");
// ruleid: insecure_cipher_cbc
val cipher_pkcs7 = Cipher.getInstance("AES/CBC/PKCS7Padding");
// ok: insecure_cipher_cbc
val cipher_no_padding = Cipher.getInstance("AES/CBC/NoPadding");
// ruleid: insecure_cipher_cbc
val spec_pkcs5 = KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS5)
    .build()
// ruleid: insecure_cipher_cbc
val spec_pkcs7 = KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS7)
    .build()
// ok: insecure_cipher_cbc
val spec_no_padding = KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
    .build()