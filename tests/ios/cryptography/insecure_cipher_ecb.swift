import CommonCrypto

// ruleid: insecure_cipher_ecb
let ecb_mode: CCMode = CCMode(kCCModeECB)
// ruleid: insecure_cipher_ecb
let ecb_options = CCOptions(kCCOptionECBMode)