import Foundation
import Security
    
func accessibility_when_passcode_this_device() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: exportable_keychain
        kSecAttrAccessible: kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}    

func accessibility_after_first_unlock_this_device() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: exportable_keychain
        kSecAttrAccessible: kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}

func accessibility_after_first_unlock() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ruleid: exportable_keychain
        kSecAttrAccessible: kSecAttrAccessibleAfterFirstUnlock
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}

func accessibility_when_unlocked_this_device() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: exportable_keychain
        kSecAttrAccessible: kSecAttrAccessibleWhenUnlockedThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}

func accessibility_when_unlocked() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ruleid: exportable_keychain
        kSecAttrAccessible: kSecAttrAccessibleWhenUnlocked
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}