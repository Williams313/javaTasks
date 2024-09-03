

def find_largest_and_count():
    max_num = int(input("Enter a number: "))
    count = 1

    while True:
        num = int(input("Enter a number (0 to stop): "))
        if num == 0:
            break
        if num > max_num:
            max_num = num
            count = 1
        elif num == max_num:
            count += 1

    if max_num == 0:
        print("No numbers entered except zero.")
    else:
        print(f"Largest number: {max_num}")
        print(f"Occurrences: {count}")

find_largest_and_count()
