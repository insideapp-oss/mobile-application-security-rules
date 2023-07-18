import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

String password = "dummy";
String salt = "1234";
int keyLength = 512;

SecretKeyFactory skf_sha1 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

// ruleid: weak_kdf_pbkdf2_sha1
PBEKeySpec spec_sha1_bad = new PBEKeySpec(password, salt, 100000, keyLength);
SecretKey key_bad = skf_sha1.generateSecret(spec_sha1_bad);

// ok: weak_kdf_pbkdf2_sha1
PBEKeySpec spec_sha1 = new PBEKeySpec(password, salt, 2000000, keyLength);
SecretKey key = skf_sha1.generateSecret(spec_sha1);