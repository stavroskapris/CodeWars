/**
 * Define a function isPrime/is_prime() that takes one integer 
 * argument and returns true/True or false/False 
 * depending on if the integer is a prime.

Per Wikipedia, a prime number (or a prime) is a natural
 number greater than 1 that has no positive
  divisors other than 1 and itself.
 */
function isPrime(num) {
	if (num <= 1)
		return false;
	for (i = 2; i < num; i++) {
		if (num % i == 0)
			return false;
	}
	return true;
}