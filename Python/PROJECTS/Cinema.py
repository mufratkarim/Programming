films= {
    "Avengers: Endgame": [13,5],
    "Dark Phoenix": [13,2],
    "Jason Bourne": [18,5],
    "Mary Poppins Returns": [7,3]
    }

while True:
    choice=input("What film do you want to watch? ").strip().title()

    if choice in films:
        age = int(input("How old are you? ").strip())

        #Checks user age
        
        if age >= films[choice][0]:
            
            if films[choice][1] > 0:
                print("Enjoy the film!")
                films[choice][1]=films[choice][1]-1
                
            else:
                print("Sorry, we are sold out!")
                
        else:
            print("You are too young to see the film")

    else:
        print("We don't have that film...")
