import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;

// ruleid: insecure_hash_md5
MessageDigest md_1 = MessageDigest.getInstance("MD5");
// ruleid: insecure_hash_md5
MessageDigest md_2 = DigestUtils.getMd5Digest();
// ruleid: insecure_hash_md5
byte[] md_3 = DigestUtils.md5("dummy");
// ruleid: insecure_hash_md5
String md_4 = DigestUtils.md5Hex("dummy");