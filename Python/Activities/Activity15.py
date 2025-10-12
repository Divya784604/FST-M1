try:
    # Deliberately use an undefined variable to cause NameError
    print(undefined_variable)
except NameError:
    print("Caught a NameError: 'undefined_variable' is not defined.")

print("Program continues executing normally.")
