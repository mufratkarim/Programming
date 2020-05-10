# Get user email


email = input("What is your email address?: ").strip()


# Slice out username


username = email[:email.index("@")]



# Slice domain Name

domain = email[(email.index("@"))+1:]



# Format message


output = "Your username is {} and your domain is at {}".format(username,domain)



# display message


print(output)

