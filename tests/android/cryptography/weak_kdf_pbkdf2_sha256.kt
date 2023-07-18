import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

val password = "dummy"
val salt = "1234"
val keyLength = 512

val skf_sha256 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256")

// ruleid: weak_kdf_pbkdf2_sha256
val spec_sha256_bad = PBEKeySpec(password, salt, 100000, keyLength)
val key_bad = skf_sha256.generateSecret(spec_sha256_bad)

// ok: weak_kdf_pbkdf2_sha256
val spec_sha256 = PBEKeySpec(password, salt, 2000000, keyLength)
val key = skf_sha256.generateSecret(spec_sha256)