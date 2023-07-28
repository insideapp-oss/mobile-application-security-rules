import UIKit

// ruleid: insecure_pasteboard
let pasteboard = UIPasteboard.general

// ok: insecure_pasteboard
let otherpasteboard = UIPasteboard.withUniqueName()

// ruleid: insecure_pasteboard
if UIPasteboard.general.hasStrings {
    print("has strings")
}