import Foundation

@objc public protocol MyServiceProtocol {
    func upperCaseString(_ string: String, withReply reply: @escaping (String) -> Void)
}

// ruleid: insecure_ipc
let connection = NSXPCConnection(serviceName: "myService")
// ruleid: insecure_ipc
let interface = NSXPCInterface(with: MyServiceProtocol.self)
// ruleid: insecure_ipc
let listener = NSXPCListener.service()
// ruleid: insecure_ipc
var fileCoordinator = NSFileCoordinator()