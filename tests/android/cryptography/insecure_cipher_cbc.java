import javax.crypto.Cipher;

// ruleid: insecure_cipher_cbc
Cipher cipher_pkcs5 = Cipher.getInstance("AES/CBC/PKCS5Padding");
// ruleid: insecure_cipher_cbc
Cipher cipher_pkcs7 = Cipher.getInstance("AES/CBC/PKCS7Padding");
// ok: insecure_cipher_cbc
Cipher cipher_no_padding = Cipher.getInstance("AES/CBC/NoPadding");
// ruleid: insecure_cipher_cbc
KeyGenParameterSpec spec_pkcs5 = new KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS5)
    .build();
// ruleid: insecure_cipher_cbc
KeyGenParameterSpec spec_pkcs7 = new KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS7)
    .build();
// ok: insecure_cipher_cbc
KeyGenParameterSpec spec_no_padding = new KeyGenParameterSpec.Builder("key", KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
    .build();