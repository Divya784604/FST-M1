# Ask the user to enter numbers separated by commas
user_input = input("Enter numbers separated by commas to create a tuple: ")

try:
    # Convert input into a tuple of integers
    numbers_tuple = tuple(int(num.strip()) for num in user_input.split(","))

    print("Numbers divisible by 5 are:")
    for num in numbers_tuple:
        if num % 5 == 0:
            print(num)

except ValueError:
    print("Invalid input! Please enter only numbers separated by commas.")
