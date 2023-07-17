import java.util.Random;
import java.lang.*;
import java.security.SecureRandom;

// ok: insecure_random_number_generator
SecureRandom sRandom_ok = new SecureRandom();
// ruleid: insecure_random_number_generator
SecureRandom sRandom_ko = new SecureRandom(12);
// ruleid: insecure_random_number_generator
Random random = new Random();
// ruleid: insecure_random_number_generator
int math_r = 1 + Math.random();