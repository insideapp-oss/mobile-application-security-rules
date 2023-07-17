import Foundation

// ruleid: insecure_random_number_generator
let random = arc4random_uniform(100)
// ruleid: insecure_random_number_generator
srand48(100)
// ruleid: insecure_random_number_generator
let random3 = Int.random(in: 1..<100)
// ruleid: insecure_random_number_generator
let random4 = Float.random(in: 1..<100)
// ruleid: insecure_random_number_generator
let random5 = Double.random(in: 1..<100)
// ruleid: insecure_random_number_generator
let random6 = CGFloat.random(in: 1..<100)