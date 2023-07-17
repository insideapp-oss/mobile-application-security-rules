import LocalAuthentication

let context = LAContext()
// ruleid: improper_biometric
context.evaluatePolicy(.deviceOwnerAuthenticationWithBiometrics, localizedReason: "Reason") { success, error in }