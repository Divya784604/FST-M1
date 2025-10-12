import pandas as pd

# Read the CSV file
df = pd.read_csv('users.csv')

# 1. Print the values only in the Usernames column
print("Usernames column:")
print(df['Usernames'])

# 2. Print the username and password of the second row (index 1)
print("\nSecond row (Username and Password):")
print("Username:", df.loc[1, 'Usernames'])
print("Password:", df.loc[1, 'Passwords'])

# 3. Sort the Usernames column in ascending order and print the entire data
print("\nData sorted by Usernames (ascending):")
print(df.sort_values("Usernames"))

# 4. Sort the Passwords column in descending order and print the entire data
print("\nData sorted by Passwords (descending):")
print(df.sort_values("Passwords", ascending=False))
