import java.util.Random
import java.lang.*
import java.security.SecureRandom

// ok: insecure_random_number_generator
val sRandom_ok = SecureRandom();
// ruleid: insecure_random_number_generator
val sRandom_ko = SecureRandom(12);
// ruleid: insecure_random_number_generator
val random = Random();
// ruleid: insecure_random_number_generator
val math_r = 1 + Math.random();