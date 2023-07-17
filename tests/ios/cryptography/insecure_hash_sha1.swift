import Foundation
import CommonCrypto
import CryptoKit

let value = "dummy"
let data = value.data(using: .utf8)!
var digest = [UInt8](repeating: 0, count: Int(CC_SHA1_DIGEST_LENGTH))

var ctx = CC_SHA1_CTX()
// ruleid: insecure_hash_sha1
CC_SHA1_Init(&ctx)
// ruleid: insecure_hash_sha1
CC_SHA1_Update(&ctx, value, CC_LONG(data.count))
// ruleid: insecure_hash_sha1
CC_SHA1_Final(&digest, &ctx)

data.withUnsafeBytes {
    // ruleid: insecure_hash_sha1
    _ = CC_SHA1($0.baseAddress, CC_LONG(data.count), &digest)
}

// ruleid: insecure_hash_sha1
let sha1 = Insecure.SHA1.hash(data: data)