import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

val password = "dummy"
val salt = "1234"
val keyLength = 512

val skf_sha512 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512")

// ruleid: weak_kdf_pbkdf2_sha512
val spec_sha512_bad = PBEKeySpec(password, salt, 100000, keyLength)
val key_bad = skf_sha512.generateSecret(spec_sha512_bad)

// ok: weak_kdf_pbkdf2_sha512
val spec_sha512 = PBEKeySpec(password, salt, 300000, keyLength)
val key = skf_sha512.generateSecret(spec_sha512)