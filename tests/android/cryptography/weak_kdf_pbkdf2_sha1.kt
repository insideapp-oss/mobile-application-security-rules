import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

val password = "dummy"
val salt = "1234"
val keyLength = 512

val skf_sha1 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")

// ruleid: weak_kdf_pbkdf2_sha1
val spec_sha1_bad = PBEKeySpec(password, salt, 100000, keyLength)
val key_bad = skf_sha1.generateSecret(spec_sha1_bad)

// ok: weak_kdf_pbkdf2_sha1
val spec_sha1 = PBEKeySpec(password, salt, 2000000, keyLength)
val key = skf_sha1.generateSecret(spec_sha1);