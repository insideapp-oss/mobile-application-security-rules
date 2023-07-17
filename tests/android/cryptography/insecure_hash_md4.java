import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;

// ruleid: insecure_hash_md4
MessageDigest md_1 = MessageDigest.getInstance("MD4");
// ruleid: insecure_hash_md4
MessageDigest md_2 = DigestUtils.getMd4Digest();
// ruleid: insecure_hash_md4
byte[] md_3 = DigestUtils.md4("dummy");
// ruleid: insecure_hash_md4
String md_4 = DigestUtils.md4Hex("dummy");