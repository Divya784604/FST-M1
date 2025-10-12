# Ask the user to enter their name
name = input("Enter your name: ")

# Ask the user to enter their age
age = int(input("Enter your age: "))

# Calculate the current year
import datetime
current_year = datetime.datetime.now().year

# Calculate the year the user will turn 100
year_turn_100 = current_year + (100 - age)

# Print the message
print(f"Hello, {name}! You will turn 100 years old in the year {year_turn_100}.")
