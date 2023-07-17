import CommonCrypto
import CryptoKit

// ruleid: weak_symmetric_aes
let key_size_bad = kCCKeySizeAES128
// ruleid: weak_symmetric_aes
let key_size_bad_2 = kCCKeySizeAES192
// ok: weak_symmetric_aes
let key_size = kCCKeySizeAES256

let plainData = "Dummy".data(using: .utf8)!

// ruleid: weak_symmetric_aes
let key_bad = SymmetricKey(size: .bits128)
let encrypted_bad = try AES.GCM.seal(plainData, using: key_bad, nonce: nil)
let decrypted_bad = try AES.GCM.open(encrypted, using: key_bad)

// ruleid: weak_symmetric_aes
let key_bad_2 = SymmetricKey(size: .bits192)
let encrypted_bad_2 = try AES.GCM.seal(plainData, using: key_bad_2, nonce: nil)
let decrypted_bad_2 = try AES.GCM.open(encrypted, using: key_bad_2)

// ok: weak_symmetric_aes
let key = SymmetricKey(size: .bits256)
let encrypted = try AES.GCM.seal(plainData, using: key, nonce: nil)
let decrypted = try AES.GCM.open(encrypted, using: key)