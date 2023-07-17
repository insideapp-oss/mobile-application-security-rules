import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;

// ruleid: insecure_hash_sha1
MessageDigest md_1 = MessageDigest.getInstance("SHA1");
// ruleid: insecure_hash_sha1
MessageDigest md_2 = DigestUtils.getSha1Digest();
// ruleid: insecure_hash_sha1
byte[] md_3 = DigestUtils.sha1("dummy");
// ruleid: insecure_hash_sha1
String md_4 = DigestUtils.sha1Hex("dummy");