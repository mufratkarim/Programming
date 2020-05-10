students = {
    "male": ["John","Stephen","Robert","Charlie"],
    "female": ["Samantha","Amy","Sarah","Bipasha"]
    }

for key in students.keys():
    for name in students[key]:
        if "a" in name:
            print(name)


vowels = 0
consonants = 0

detector = input("\n\nEnter a word to check how many vowels and consontants are there?: ")

for letter in detector:
    if letter.lower() in "aeiou":
        vowels = vowels + 1
    elif letter == "":
        pass
    else:
        consonants = consonants + 1 

print("There are {} vowels and {} consonants".format(vowels, consonants))
