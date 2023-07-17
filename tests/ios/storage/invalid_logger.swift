import Foundation
import os.log

// ruleid: sensitive_log
print("my log")

// ruleid: sensitive_log
NSLog("my log")

let log = OSLog(subsystem: "myapp", category: "dummy")
let signpostID = OSSignpostID(log: log)
// ruleid: sensitive_log
os_signpost(.begin, log: log, name: "Processing", signpostID: signpostID)