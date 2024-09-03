

for i in range(100, 211):
    if (i % 3 == 0 and i % 4 != 0) or (i % 4 == 0 and i % 3 != 0):
        print(i, end=" ")

