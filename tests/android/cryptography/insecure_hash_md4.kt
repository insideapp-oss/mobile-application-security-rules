import java.security.MessageDigest
import org.apache.commons.codec.digest.DigestUtils

// ruleid: insecure_hash_md4
val md_1 = MessageDigest.getInstance("MD4")
// ruleid: insecure_hash_md4
val md_2 = DigestUtils.getMd4Digest()
// ruleid: insecure_hash_md4
val md_3 = DigestUtils.md4("dummy")
// ruleid: insecure_hash_md4
val md_4 = DigestUtils.md4Hex("dummy");