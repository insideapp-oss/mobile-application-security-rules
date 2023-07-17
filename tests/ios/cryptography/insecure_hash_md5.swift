import Foundation
import CommonCrypto
import CryptoKit

let value = "dummy"
let data = value.data(using: .utf8)!
var digest = [UInt8](repeating: 0, count: Int(CC_MD5_DIGEST_LENGTH))

var ctx = CC_MD5_CTX()
// ruleid: insecure_hash_md5
CC_MD5_Init(&ctx)
// ruleid: insecure_hash_md5
CC_MD5_Update(&ctx, value, CC_LONG(data.count))
// ruleid: insecure_hash_md5
CC_MD5_Final(&digest, &ctx)

data.withUnsafeBytes {
    // ruleid: insecure_hash_md5
    _ = CC_MD5($0.baseAddress, CC_LONG(data.count), &digest)
}

// ruleid: insecure_hash_md5
let md5_2 = Insecure.MD5.hash(data: data)