import Foundation
import os.log

let log = OSLog(subsystem: "myapp", category: "dummy")
let sensitiveData = "sensitive"

// ok: sensitive_log
os_log("my log", log: log, type: .info)
// ok: sensitive_log
os_log("my log %{private}@", log: log, type: .info, sensitiveData)
// ruleid: sensitive_log
os_log("my log %{public}@", log: log, type: .info, sensitiveData)

let logger = Logger(subsystem: "myapp", category: "dummy")

// ruleid: sensitive_log
logger.log("my log")
// ruleid: sensitive_log
logger.notice("my log")
// ruleid: sensitive_log
logger.debug("my log")
// ruleid: sensitive_log
logger.trace("my log")
// ruleid: sensitive_log
logger.info("my log")
// ruleid: sensitive_log
logger.error("my log")
// ruleid: sensitive_log
logger.warning("my log")
// ruleid: sensitive_log
logger.fault("my log")
// ruleid: sensitive_log
logger.critical("my log")

// ruleid: sensitive_log
logger.log("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.notice("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.debug("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.trace("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.info("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.error("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.warning("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.fault("my log \(sensitiveData)")
// ruleid: sensitive_log
logger.critical("my log \(sensitiveData)")

// ruleid: sensitive_log
logger.log("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.notice("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.debug("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.trace("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.info("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.error("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.warning("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.fault("my log \(sensitiveData, privacy: .private)")
// ruleid: sensitive_log
logger.critical("my log \(sensitiveData, privacy: .private)")

// ruleid: sensitive_log
logger.log("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.notice("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.debug("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.trace("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.info("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.error("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.warning("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.fault("my log \(sensitiveData, privacy: .public)")
// ruleid: sensitive_log
logger.critical("my log \(sensitiveData, privacy: .public)")
