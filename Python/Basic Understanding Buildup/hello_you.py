# Ask user for name

name = input("What is your name?: ")

# Ask user for their age

age = input("What is your age?: ")

# Ask user for city

city = input("What is your city?: ")

# Ask user their hobbies

hobbies = input("What are your hobbies?: ")

# Create output text

message = "Your name is {} and you are {} years old. You live in {}. Your hobby/hobbies is/are {}."
output = message.format(name, age, city, hobbies)

# Print output to screen

print(output)
