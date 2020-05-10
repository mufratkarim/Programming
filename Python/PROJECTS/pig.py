# Get Sentence from User

original = input("Please enter a sentence: ").strip().lower()



# Split sentence into words


words = original.split()



# Loop through words and convert to pig latin


new_words = []


for word in words:
    
# If vowel, just add 'yay'

    if word[0] in "aeiou":
        new_word = word + "yay"
        new_words.append(new_word)

# Otherwise, add first consonant closer to end and add 'yay'


    else:
        vowel_pause = 0
        for letter in word:
            if letter not in "aeiou":
                vowel_pause += 1
            else:
                break    

    cons = word[:vowel_pause]
    new_word =  word[vowel_pause:] + cons + "yay"
    new_words.append(new_word)


# Stick words back together

output = " ".join(new_words)


# output the final string 


print(output)
