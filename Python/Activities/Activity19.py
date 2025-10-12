import pandas as pd
import openpyxl as  Workbook

# Define the data
data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": [4537829158, 5892184058, 4528727830]
}

# Create a DataFrame
df = pd.DataFrame(data)

# Write the DataFrame to an Excel file
df.to_excel("user_data.xlsx", index=False)

print("Excel file 'user_data.xlsx' created successfully.")
