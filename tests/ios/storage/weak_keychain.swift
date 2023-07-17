import Foundation
import Security

func accessibility_always_this_device_only() {
    let token = "dummy"
    var query = [String : AnyObject]()
    query[kSecClass as String] = kSecClassGenericPassword
    query[kSecValueData as String] = token as AnyObject?
    // ruleid: weak_keychain
    query[kSecAttrAccessible as String] = kSecAttrAccessibleAlwaysThisDeviceOnly
    SecItemAdd(query as CFDictionary, nil)
}

func accessibility_always_this_device_only_other() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ruleid: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleAlwaysThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}   
    
func accessibility_always() {
    let token = "dummy"
    var query = [String : AnyObject]()
    query[kSecClass as String] = kSecClassGenericPassword
    query[kSecValueData as String] = token as AnyObject?
    // ruleid: weak_keychain
    query[kSecAttrAccessible as String] = kSecAttrAccessibleAlways
    SecItemAdd(query as CFDictionary, nil)
}

func accessibility_always_other() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ruleid: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleAlways
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}    
    
func accessibility_when_passcode_this_device() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}    

func accessibility_after_first_unlock_this_device() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}

func accessibility_after_first_unlock() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleAfterFirstUnlock
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}

func accessibility_when_unlocked_this_device() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleWhenUnlockedThisDeviceOnly
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}

func accessibility_when_unlocked() {
    let keychainItemQuery = [
        kSecValueData: "dummy".data(using: .utf8)!,
        kSecClass: kSecClassGenericPassword,
        // ok: weak_keychain
        kSecAttrAccessible: kSecAttrAccessibleWhenUnlocked
    ] as CFDictionary
    SecItemAdd(keychainItemQuery, nil)
}