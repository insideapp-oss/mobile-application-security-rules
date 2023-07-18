import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

String password = "dummy";
String salt = "1234";
int keyLength = 512;

SecretKeyFactory skf_sha512 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");

// ruleid: weak_kdf_pbkdf2_sha512
PBEKeySpec spec_sha512_bad = new PBEKeySpec(password, salt, 100000, keyLength);
SecretKey key_bad = skf_sha512.generateSecret(spec_sha512_bad);

// ok: weak_kdf_pbkdf2_sha512
PBEKeySpec spec_sha512 = new PBEKeySpec(password, salt, 300000, keyLength);
SecretKey key = skf_sha512.generateSecret(spec_sha512);