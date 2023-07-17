import java.security.MessageDigest
import org.apache.commons.codec.digest.DigestUtils

// ruleid: insecure_hash_md2
val md_1 = MessageDigest.getInstance("MD2")
// ruleid: insecure_hash_md2
val md_2 = DigestUtils.getMd2Digest()
// ruleid: insecure_hash_md2
val md_3 = DigestUtils.md2("dummy")
// ruleid: insecure_hash_md2
val md_4 = DigestUtils.md2Hex("dummy");