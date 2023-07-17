import Foundation
import CommonCrypto
import CryptoKit

let value = "dummy"
let data = value.data(using: .utf8)!
var digest = [UInt8](repeating: 0, count: Int(CC_SHA224_DIGEST_LENGTH))

// SHA-224 use SHA-256 context, weird but normal
var ctx = CC_SHA256_CTX()
// ruleid: insecure_hash_sha224
CC_SHA224_Init(&ctx)
// ruleid: insecure_hash_sha224
CC_SHA224_Update(&ctx, value, CC_LONG(data.count))
// ruleid: insecure_hash_sha224
CC_SHA224_Final(&digest, &ctx)

data.withUnsafeBytes {
    // ruleid: insecure_hash_sha224
    _ = CC_SHA224($0.baseAddress, CC_LONG(data.count), &digest)
}