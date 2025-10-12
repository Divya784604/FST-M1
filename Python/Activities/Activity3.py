# Get the players' names
player1 = input("What is Player 1's name? ")
player2 = input("What is Player 2's name? ")

# Get the choices from each player
choice1 = input(player1 + ", choose rock, paper or scissors: ").lower()
choice2 = input(player2 + ", choose rock, paper or scissors: ").lower()

# Decide the winner
if choice1 == choice2:
    print("It's a tie!")
elif choice1 == "rock":
    if choice2 == "scissors":
        print("Rock beats scissors —", player1, "wins!")
    elif choice2 == "paper":
        print("Paper beats rock —", player2, "wins!")
    else:
        print("Invalid input from", player2)
elif choice1 == "scissors":
    if choice2 == "paper":
        print("Scissors beats paper —", player1, "wins!")
    elif choice2 == "rock":
        print("Rock beats scissors —", player2, "wins!")
    else:
        print("Invalid input from", player2)
elif choice1 == "paper":
    if choice2 == "rock":
        print("Paper beats rock —", player1, "wins!")
    elif choice2 == "scissors":
        print("Scissors beats paper —", player2, "wins!")
    else:
        print("Invalid input from", player2)
else:
    print("Invalid input from", player1)