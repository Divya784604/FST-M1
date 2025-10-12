import pandas as pd

# Create the data
data = {
    'Usernames': ['admin', 'Charles', 'Deku'],
    'Passwords': ['password', 'Charl13', 'AllMight']
}

# Convert data to DataFrame
df = pd.DataFrame(data)

# Write DataFrame to CSV file
df.to_csv('users.csv', index=False)

print("CSV file 'users.csv' has been created successfully.")
