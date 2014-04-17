import org.specs2.mutable._

/**
 * Before you start:
 * The following is a TDD Kata exercise in coding, refactoring and test-first.
 * Try not to read ahead.
 * Read each rule on their own, implement the necessary tests and code, refactor then move onto the next rule.
 * Focus on testing for correct inputs only.
 *
 * The FizzBuzz Kata
 * This Kata uses 4 simple rules to describe the behaviour of the unit under test (FizzBuzzCalculator).
 *
 * 1. If the FizzBuzzCalculator receives a number that is divisible by 3, then return "Fizz"
 * 2. If the FizzBuzzCalculator receives a number that is divisible by 5, then return "Buzz"
 * 3. If the FizzBuzzCalculator receives a number that is divisible by 3 and 5, then return "FizzBuzz"
 * 4. If the FizzBuzzCalculator receives a number that is not divisible by 5 or 3, then return the original value as a string
 *
 * Additional Tasks
 * 5. Make the calculator accept a number as a string
 * 7. Make the calculator accept a list of comma separated numbers
 * 8. Make the calculator accept numbers, "Fizz" and "Buzz" as inputs. If "Fizz" or "Buzz" are supplied just return them as strings
 */

class FizzBuzzTests extends Specification {
  "FizzBuzz" should {
    "Return string 0 then asked to calculate 0" in {
      FizzBuzz.calculate(0) must equalTo("0")
    }
  }
}

