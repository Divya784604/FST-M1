# Ask the user to enter numbers separated by commas
user_input = input("Enter a list of numbers separated by commas (e.g. 5, 10, 15): ")

# Split the input into individual number strings and convert to integers
try:
    number_list = [int(num.strip()) for num in user_input.split(",")]

    # Calculate the sum
    total = sum(number_list)

    # Print the result
    print("The sum of all the elements in the list is:", total)

except ValueError:
    print("Please enter only valid numbers separated by commas.")
