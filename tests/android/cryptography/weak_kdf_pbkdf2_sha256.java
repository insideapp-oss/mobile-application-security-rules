import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

String password = "dummy";
String salt = "1234";
int keyLength = 512;

SecretKeyFactory skf_sha256 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

// ruleid: weak_kdf_pbkdf2_sha256
PBEKeySpec spec_sha256_bad = new PBEKeySpec(password, salt, 100000, keyLength);
SecretKey key_bad = skf_sha256.generateSecret(spec_sha256_bad);

// ok: weak_kdf_pbkdf2_sha256
PBEKeySpec spec_sha256 = new PBEKeySpec(password, salt, 1000000, keyLength);
SecretKey key = skf_sha256.generateSecret(spec_sha256);