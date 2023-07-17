import Foundation
import CommonCrypto
import CryptoKit

let value = "dummy"
let data = value.data(using: .utf8)!
var digest = [UInt8](repeating: 0, count: Int(CC_MD4_DIGEST_LENGTH))

var ctx = CC_MD4_CTX()
// ruleid: insecure_hash_md4
CC_MD4_Init(&ctx)
// ruleid: insecure_hash_md4
CC_MD4_Update(&ctx, value, CC_LONG(data.count))
// ruleid: insecure_hash_md4
CC_MD4_Final(&digest, &ctx)

data.withUnsafeBytes {
    // ruleid: insecure_hash_md4
    _ = CC_MD4($0.baseAddress, CC_LONG(data.count), &digest)
}