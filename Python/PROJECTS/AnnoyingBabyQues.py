import random
questions=["Why is the sky blue?: ",
           "Why don't we see any more dinosaur?: ",
           "Why are you so scary?: "]

questions=random.choice(questions)

answer = input(questions).strip().lower()

while answer != "just because":
    answer = input("why?: ").strip().lower()

print("Oh.....Ok")
