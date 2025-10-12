# Get first list from the user
list1_input = input("Enter the first list of numbers (comma-separated): ")
list1 = [int(num.strip()) for num in list1_input.split(",")]

# Get second list from the user
list2_input = input("Enter the second list of numbers (comma-separated): ")
list2 = [int(num.strip()) for num in list2_input.split(",")]

# Filter odd numbers from first list
odd_numbers = [num for num in list1 if num % 2 != 0]

# Filter even numbers from second list
even_numbers = [num for num in list2 if num % 2 == 0]

# Combine both
combined_list = odd_numbers + even_numbers

# Display result
print("New list with odd numbers from first and even numbers from second:")
print(combined_list)
