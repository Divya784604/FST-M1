# Sample dictionary of fruits and their prices
fruit_prices = {
    "apple": 1.5,
    "banana": 0.5,
    "orange": 0.75,
    "mango": 2.0,
    "grape": 3.0,
    "pineapple": 2.5
}

# Ask the user to enter a fruit to check
fruit_to_check = input("Enter the fruit you want to check: ").lower()

# Check if the fruit is available
if fruit_to_check in fruit_prices:
    print(f"Yes, {fruit_to_check} is available at ${fruit_prices[fruit_to_check]:.2f} per unit.")
else:
    print(f"Sorry, {fruit_to_check} is not available.")
