L=[]

while len(L) < 3:
    new_name=input("Please add a new name: ").strip().capitalize()
    L.append(new_name)

print("Sorry the list is full")
print("The List is: " + str(L))
