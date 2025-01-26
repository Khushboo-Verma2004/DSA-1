def isPowerOfTwo(n: int) -> bool:
  
    # A number less than or equal to zero cannot be a power of two
    if n <= 0:
        return False
      
    # n & (n - 1) will be 0 if n is a power of two
    return (n & (n - 1)) == 0

def main():
    # Examples for testing
    test_cases = [1, 16, 3]

    for n in test_cases:
        result = isPowerOfTwo(n)
        print(f"Is {n} a power of two? {result}")

if __name__ == "__main__":
    main()
