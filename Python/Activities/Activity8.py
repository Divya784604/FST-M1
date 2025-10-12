# Ask the user to enter numbers separated by commas
user_input = input("Enter a list of numbers separated by commas: ")

# Convert the input string to a list of integers
try:
    number_list = [int(num.strip()) for num in user_input.split(",")]

    # Check if the first and last numbers are the same
    if len(number_list) >= 1:
        result = number_list[0] == number_list[-1]
        print("First and last numbers are the same:", result)
    else:
        print("The list is empty. Please enter at least one number.")

except ValueError:
    print("Invalid input! Please enter only numbers separated by commas.")
