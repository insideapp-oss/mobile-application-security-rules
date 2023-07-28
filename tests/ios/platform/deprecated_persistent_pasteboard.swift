import UIKit


// ruleid: deprecated_persistent_pasteboard
UIPasteboard.withUniqueName().setPersistent(true)

// ok: deprecated_persistent_pasteboard
UIPasteboard.withUniqueName().setPersistent(false)

let pasteboard = UIPasteboard.withUniqueName()
// ruleid: deprecated_persistent_pasteboard
pasteboard.setPersistent(true)
// ok: deprecated_persistent_pasteboard
pasteboard.setPersistent(false)