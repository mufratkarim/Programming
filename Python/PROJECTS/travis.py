known_users=["Karim", "Stephen", "Bob", "Mark", "Ruffalo"]
print("The number of users are " + str(len(known_users)))

while True:
    print("Hi! My name is Travis")
    name=input("What is your name? ").strip().lower().capitalize()
    if name in known_users:
        output1="\nHello, {}.\n".format(name)
        print(output1)
        remove=input("Would you like to be removed from the system (y/n)?: ").lower()
        if remove =="y":
            known_users.remove(name)
        elif remove=="n":
            print("No problem!")
            
    else:
        output2="\nHmmm I don't think I know you yet {}.\n".format(name)
        print(output2)
        add_me=input("Would you like to be added to the system (y/n): ").strip().lower()

        if add_me == "y":
            known_users.append(name)
        elif add_me=="n":
            print("No worries, see you around!")
     
