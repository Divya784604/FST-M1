# Ask the user to enter a number
num = int(input("Enter a number to display its multiplication table: "))

# Print the multiplication table from 1 to 10
print(f"\nMultiplication table of {num}:\n")

for i in range(1, 11):
    result = num * i
    print(f"{num} x {i} = {result}")
