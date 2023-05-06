import random
from art_num_guess import *

comp=random.randint(1,100)

def easy():
    guess=0

    while guess!=comp:
        guess=int(input("Guess the Number: "))
        if guess>comp:
            print("Too High. Guess Again.\n")
        elif guess<comp:
            print("Too Low. Guess Again.\n")
        elif guess>100 or guess<1:
            print("The number exceeds limits. Guess Again.\n")

    print(f"Congratulations!! The number is {comp}.")

def medium():
    lives=10
    guess=0

    while guess!=comp and lives>0:
        guess=int(input("Guess the Number: "))
        if guess>comp:
            lives-=1
            print("Too High!! Guess Again.")
            print(f"You have {lives} lives left.\n")
        elif guess<comp:
            lives-=1
            print("Too Low!! Guess Again.")
            print(f"You have {lives} lives left.\n")
        elif guess>100 or guess<1:
            print("The number exceeds limits. Guess Again.")
            print(f"You have {lives} lives left.\n")

    if guess==comp:
        print(f"Congratulations!! The number is {comp}. YOU WIN!!!\n")
    else:
        print(f"You have run out of lives. You Loose.\n The number was {comp}")

def hard():
    lives=5
    guess=0

    while guess!=comp and lives>0:
        guess=int(input("Guess the Number: "))
        if guess>comp:
            lives-=1
            print("Too High!! Guess Again.")
            print(f"You have {lives} left.\n")
        elif guess<comp:
            lives-=1
            print("Too Low!! Guess Again.")
            print(f"You have {lives} left.\n")
        elif guess>100 or guess<1:
            print("The number exceeds limits. Guess Again.")
            print(f"You have {lives} left.\n")

    if guess==comp:
        print(f"Congratulations!! The number is {comp}. YOU WIN!!!\n")
    else:
        print(f"You have run out of lives. You Loose.\n The number was {comp}")


print(logo)
print("Select game mode: ")
mode=input("Type 'easy','medium' or 'hard': ").lower()
if mode=='easy':
    print(easy0)
    easy()
elif mode=='medium':
    print(medium0)
    medium()
elif mode=='hard':
    print(hard0)
    hard()
else:
    print("Sorry!! Invalid Input.")